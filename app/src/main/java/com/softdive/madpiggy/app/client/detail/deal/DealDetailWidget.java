package com.softdive.madpiggy.app.client.detail.deal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.ait.toolkit.gmaps.client.GMapsLibraryLoader;
import com.ait.toolkit.gmaps.client.GMapsLibraryLoader.GmapLibrary;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent.ORIENTATION;
import com.googlecode.mgwt.ui.client.widget.carousel.Carousel;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPropertyHelper.Justification;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.global.AppConstant;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.mallDetail.MallDetailView.Presenter;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Image.ImageType;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.Outlet;
import com.softdive.madpiggy.app.client.model.WeekDay;
import com.softdive.madpiggy.app.client.model.helper.ImageHelper;
import com.softdive.madpiggy.app.client.storage.ListingDataStore;
import com.softdive.madpiggy.app.client.util.ImageLoaderQueue;

public class DealDetailWidget extends Composite {

	@UiField FlexPanel parentContainer;
	@UiField HTMLPanel adTitle;
	@UiField HTMLPanel adDescription;
	@UiField Carousel dealCoverImageCarousel;
	@UiField Label timeRange;
	@UiField Label days;
	@UiField FlexPanel exclusiveCard;
	@UiField FlexPanel outletsCard;
	@UiField FlexPanel outletsContainer;
	@UiField HTMLPanel mallsCard;
	Collection<DealMallWidget> mallWidgets = new ArrayList<DealMallWidget>();

	@UiField FlexPanel mallsContainer;

	private int carouselHeight = 0;

	private ArrayList<Image> images = new ArrayList<>();
	private ArrayList<com.softdive.madpiggy.app.client.model.Image> imgs = new ArrayList<>();

	private Advertisement advertisement;

	private static DealDetailWidgetUiBinder uiBinder = GWT.create(DealDetailWidgetUiBinder.class);

	interface DealDetailWidgetUiBinder extends UiBinder<Widget, DealDetailWidget> {
	}

	public DealDetailWidget(Advertisement ad) {
		this.advertisement = ad;
		initWidget(uiBinder.createAndBindUi(this));

		com.softdive.madpiggy.app.client.model.Image img = ImageHelper.getCoverImage(ad, ImageType.LARGE);
		carouselHeight = getCalulatedCoverImageHeight(img);
		dealCoverImageCarousel.setHeight(carouselHeight + "px");

		adTitle.getElement().setInnerText(ad.getTitle());
		adDescription.getElement().setInnerText(ad.getDescription());

		if (!ad.isExclusive()) {
			exclusiveCard.removeFromParent();
		} else {
			StringBuilder daysOfWeek = new StringBuilder();
			for (WeekDay day : ad.getApplicableDays()) {
				daysOfWeek.append(day.getDayname()).append(", ");
			}
			String dys = daysOfWeek.toString();
			if (dys.endsWith(", ")) {
				dys = dys.substring(0, dys.length() - 2);
			}
			if (ad.getTimeRange() != null) {
				timeRange.setText(ad.getTimeRange().toString());
			} else {
				timeRange.setText("Whole Day");
			}

			if (ad.getApplicableDays() == null || ad.getApplicableDays().size() == 7) {
				days.setText("All days of the week");
			} else {
				days.setText(dys);
			}
		}
		addImagesToCarousel();

		renderOutlets(ad.getId());
	}

	private void renderOutlets(long id) {
		Collection<Outlet> outlets = App.getListingDataStore().getOutletsByDealId(id);

		outlets = sortOutletsByDistance(outlets);

		final Collection<Long> outletIds = new ArrayList<Long>();

		if (outlets != null && outlets.size() > 0) {
			outletsCard.getElement().getStyle().setDisplay(Display.BLOCK);

			int i = 0;

			for (Outlet o : outlets) {
				i++;
				if (o != null) {
					outletIds.add(o.getId());
					DealOutletWidget widget = new DealOutletWidget(o);
					outletsContainer.add(widget);
					if (i != outlets.size()) {
						HTMLPanel panel = new HTMLPanel("");
						panel.getElement().getStyle().setHeight(1, Unit.PX);
						panel.getElement().getStyle().setMarginTop(5, Unit.PX);
						panel.getElement().getStyle().setMarginBottom(5, Unit.PX);
						panel.getElement().getStyle().setBackgroundColor("#E2D6D6");
						outletsContainer.add(panel);
					}
				}
			}
		} else {
			outletsCard.getElement().getStyle().setDisplay(Display.NONE);
		}

		GMapsLibraryLoader.load(new Runnable() {

			@Override
			public void run() {
				renderMalls(outletIds);
			}
		}, GmapLibrary.values(), false);
	}

	private void renderMalls(Collection<Long> outletIds) {
		Collection<Mall> malls = App.getListingDataStore().getMallsByOutletIds(outletIds);

		if (malls != null && malls.size() > 0) {
			mallsCard.getElement().getStyle().setDisplay(Display.BLOCK);

			HTMLPanel panel = new HTMLPanel("");
			panel.getElement().getStyle().setHeight(1, Unit.PX);
			panel.getElement().getStyle().setMarginTop(5, Unit.PX);
			panel.getElement().getStyle().setMarginBottom(5, Unit.PX);
			panel.getElement().getStyle().setBackgroundColor("#E2D6D6");

			int i = 0;

			for (Mall mall : malls) {
				i++;
				if (mall != null) {
					DealMallWidget widget = new DealMallWidget(mall);
					mallsContainer.add(widget);
					mallWidgets.add(widget);
					if (i != malls.size()) {
						mallsContainer.add(panel);
					}
				}
			}
		} else {
			mallsCard.getElement().getStyle().setDisplay(Display.NONE);
		}
	}

	private int getCalulatedCoverImageHeight(com.softdive.madpiggy.app.client.model.Image img) {
		return (int) ((double) img.getHeight() / (img.getWidth() * 1.00) * Native.getWindowWidth());
	}

	public void onOrientationChange(ORIENTATION orientation) {
		if (advertisement != null) {
			com.softdive.madpiggy.app.client.model.Image img = ImageHelper.getCoverImage(advertisement, ImageType.ORIG);
			carouselHeight = getCalulatedCoverImageHeight(img);
			dealCoverImageCarousel.setHeight(carouselHeight + "px");
			for (int i = 0; i < imgs.size(); i++) {
				adjustImage(imgs.get(i), images.get(i));
			}
			
			for (DealMallWidget widget : mallWidgets) {
				widget.refresh();
			}
		}
	}

	public void setPresenter(Presenter presenter) {
	}

	private void addImagesToCarousel() {
		for (com.softdive.madpiggy.app.client.model.Image img : ImageHelper.getImages(advertisement, ImageType.ORIG)) {
			Image image = new Image();
			images.add(image);
			imgs.add(img);
			ImageLoaderQueue.IMAGE_LOADER_QUEUE.push(new ImageLoaderQueue.ImageHolder(image, AppConstant.MP_AD_URL
					+ advertisement.getId() + "/" + img.getFilename()));
			RootFlexPanel flexPanel = new RootFlexPanel();
			flexPanel.setJustification(Justification.CENTER);

			flexPanel.add(image);
			flexPanel.setWidth("100%");
			image.setWidth("100%");
			dealCoverImageCarousel.add(flexPanel);
			adjustImage(img, image);
		}
	}

	private void adjustImage(com.softdive.madpiggy.app.client.model.Image img, Image image) {
		if (img.getHeight() > img.getWidth()) {
			image.setHeight(carouselHeight + "px");
			double imageWidth = ((double) carouselHeight / img.getHeight()) * img.getWidth();
			image.setWidth(imageWidth + "px");
			double marginLeft = ((double) Native.getWindowWidth() - imageWidth) / 2;
			image.getElement().getStyle().setMarginLeft(marginLeft, Unit.PX);
		}
	}

	private Collection<Outlet> sortOutletsByDistance(Collection<Outlet> input) {
		if (input == null || input.size() == 0)
			return null;
		Outlet[] os = input.toArray(new Outlet[input.size()]);
		int n = os.length;
		Outlet temp = null;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (os[j - 1] != null && os[j] != null) {
					if (os[j - 1].getDistance() > os[j].getDistance()) {
						temp = os[j - 1];
						os[j - 1] = os[j];
						os[j] = temp;
					}
				}
			}
		}
		return Arrays.asList(os);
	}
	
}
