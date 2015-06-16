package com.softdive.madpiggy.app.client.detail.deal;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.FontWeight;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.global.AppConstant;
import com.softdive.madpiggy.app.client.global.GlobalResources;
import com.softdive.madpiggy.app.client.model.AdReview;
import com.softdive.madpiggy.app.client.util.ImageLoaderQueue;
import com.softdive.madpiggy.app.client.util.Util;
import com.softdive.madpiggy.app.client.widget.celllist.CellWidget;

public class ReviewWidget extends CellWidget<AdReview> {
	
	@UiField Image reviewUserImage;
	@UiField HTMLPanel reviewerName;
	@UiField HTMLPanel reviewText;

	private static ReviewWidgetUiBinder uiBinder = GWT.create(ReviewWidgetUiBinder.class);

	interface ReviewWidgetUiBinder extends UiBinder<Widget, ReviewWidget> {
	}

	public ReviewWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void render(AdReview adReview) {
		reviewerName.getElement().getStyle().setFontWeight(FontWeight.BOLD);
		reviewText.getElement().getStyle().setFontSize(0.8, Unit.EM);
		ImageLoaderQueue.IMAGE_LOADER_QUEUE.push(new ImageLoaderQueue.ImageHolder(reviewUserImage, AppConstant.MP_U_URL + adReview.getUserId() + "/" + "profile.png", GlobalResources.INSTANCE.getUserImage().getSafeUri().asString()));
		reviewerName.getElement().setInnerText(adReview.getReviewer());
		if (!Util.isValueNull(adReview.getDescription()) && !adReview.getDescription().trim().isEmpty()) {
			reviewText.getElement().setInnerText(adReview.getDescription());
		} else {
			reviewText.getElement().setInnerText(adReview.getReviewTitle());
		}
	}
}
