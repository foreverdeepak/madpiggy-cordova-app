package com.softdive.madpiggy.app.client.detail.deal;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.FontWeight;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent.ORIENTATION;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.model.AdReview;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.widget.celllist.CellList;
import com.softdive.madpiggy.app.client.widget.celllist.HasCellSelectedHandler;
public class DealDetailViewImpl extends Composite implements DealDetailView{

	@UiField HTMLPanel dealDetailContainer;
	@UiField(provided = true) CellList<AdReview> reviewListContainer;
	@UiField Label reviewCount;
	@UiField FlexPanel parentContainer;
	@UiField Label noReviews;
	
	
	private DealDetailWidget dealDetailWidget;

	@UiTemplate("DealDetailViewImpl.ui.xml")
	interface DealDetailViewUiBinder extends UiBinder<Widget, DealDetailViewImpl> {
	}

	private static DealDetailViewUiBinder binder = GWT.create(DealDetailViewUiBinder.class);

	public DealDetailViewImpl(Advertisement advertisement) {
		reviewListContainer = new CellList<>(new ReviewCell());
		initWidget(binder.createAndBindUi(this));
		setDeal(advertisement);
		reviewCount.getElement().getStyle().setFontWeight(FontWeight.BOLD);
		noReviews.getElement().getStyle().setMargin(10, Unit.PX);
		noReviews.setVisible(false);

	}

	@Override
	public void setDeal(Advertisement advertisement) {
		dealDetailWidget = new DealDetailWidget(advertisement);
		dealDetailContainer.clear();
		dealDetailContainer.add(dealDetailWidget);
		//parentContainer.add(floatingSetting);
	}

	@Override
	public void onOrientationChange(ORIENTATION orientation) {
		dealDetailWidget.onOrientationChange(orientation);
	}

	@Override
	public void render(Collection<AdReview> reviews, int index) {
		if (index == 0 && reviews.size() == 0) {
			noReviews.setVisible(true);
			reviewListContainer.setVisible(true);
		} else {
			reviewListContainer.render(reviews, index);
			noReviews.setVisible(false);
		}
	}

	@Override
	public void clear() {
	}

	@Override
	public HasCellSelectedHandler getList() {
		return reviewListContainer;
	}

	@Override
	public FlexPanel getParentContainer() {
		return parentContainer;
	}


}
