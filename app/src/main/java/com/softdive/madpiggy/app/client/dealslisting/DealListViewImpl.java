package com.softdive.madpiggy.app.client.dealslisting;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.widget.celllist.CellList;
import com.softdive.madpiggy.app.client.widget.celllist.HasCellSelectedHandler;
import com.softdive.madpiggy.app.client.widget.celllist.staggered.StaggeredCellList;

public class DealListViewImpl extends Composite implements DealListView {

	private static DealListViewImplUiBinder uiBinder = GWT.create(DealListViewImplUiBinder.class);

	interface DealListViewImplUiBinder extends UiBinder<Widget, DealListViewImpl> {
	}

	Presenter presenter;

	@UiField(provided = true) CellList<Advertisement> deals;

	public DealListViewImpl() {
		deals = new StaggeredCellList<Advertisement>(new DealCell());
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public HasCellSelectedHandler getList() {
		return deals;
	}

	@Override
	public void render(Collection<Advertisement> ads, int index) {
		deals.render(ads, index);
	}

	@Override
	public void onOrientationChange() {
		deals.onOrientationChange();
	}

	@Override
	public int getLowestColumnHeight() {
		return deals.getScrollHeight();
	}

	@Override
	public Collection<Advertisement> getModel() {
		return deals.getModelList();
	}

	@Override
	public Advertisement getLatestAdvertisement() {
		return getLatestAdvertisement(deals.getModelList());
	}

	@Override
	public void showFooter() {
		deals.showFooter();
	}

	@Override
	public void hideFooter() {
		deals.hideFooter();
	}
	
	private Advertisement getLatestAdvertisement(Collection<Advertisement> ads) {
		Advertisement latestAd = ads.iterator().next();
		for (Advertisement ad : ads) {
			if (ad.getCreated().after(latestAd.getCreated())) {
				latestAd = ad;
			}
		}
		
		return latestAd;
	}

}
