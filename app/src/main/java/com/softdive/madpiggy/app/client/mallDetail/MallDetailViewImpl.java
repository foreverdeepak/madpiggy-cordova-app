package com.softdive.madpiggy.app.client.mallDetail;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent.ORIENTATION;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.dealslisting.DealListView;
import com.softdive.madpiggy.app.client.dealslisting.DealListViewImpl;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.storage.ListingDataStore;
import com.softdive.madpiggy.app.client.widget.celllist.HasCellSelectedHandler;

public class MallDetailViewImpl extends Composite implements MallDetailView {

	@UiField HTMLPanel mallDetailContainer;
	@UiField HTMLPanel dealsContainer;
	@UiField FlexPanel parentContainer;
	private static MallDetailViewImplUiBinder uiBinder = GWT.create(MallDetailViewImplUiBinder.class);

	interface MallDetailViewImplUiBinder extends UiBinder<Widget, MallDetailViewImpl> {
	}

	
	private MallDetailWidget mallDetailWidget;
	private Presenter presenter;
	private DealListView dealListView;

	public MallDetailViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void setMall(Mall mall) {
//		mallDetailWidget = new MallDetailWidget(mall);
//		mallDetailWidget.setPresenter(presenter);
//		mallDetailContainer.clear();
//		mallDetailContainer.add(mallDetailWidget);
//		Collection<Advertisement> ads = ListingDataStore.getDealsByMallId(mall.getId());
//		
//		if (ads != null && ads.size() > 0) {
//			dealListView = new DealListViewImpl();
//			dealListView.render(ads, 0);
//			dealsContainer.add(dealListView);
//		}
	}

	@Override
	public void onOrientationChange(ORIENTATION orientation) {
		mallDetailWidget.onOrientationChange(orientation);
		
		if (dealListView != null) {
			dealListView.onOrientationChange();
		}
	}


	@Override
	public void clear() {
	}


	@Override
	public FlexPanel getParentContainer() {
		return parentContainer;
	}

	@Override
	public HasCellSelectedHandler getList() {
		if (dealListView != null) {
			return dealListView.getList();
		}
		return null;
	}

	@Override
	public Mall getMall() {
		// TODO Auto-generated method stub
		return null;
	}


}
