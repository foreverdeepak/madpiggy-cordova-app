package com.softdive.madpiggy.app.client.detail;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.ui.client.widget.touch.TouchPanel;
import com.softdive.madpiggy.app.client.global.AppConstant;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.model.Image.ImageType;
import com.softdive.madpiggy.app.client.model.Outlet;
import com.softdive.madpiggy.app.client.model.helper.ImageHelper;
import com.softdive.madpiggy.app.client.util.Util;

public class DealOutletWidget extends Composite {
	
	private static final int SCALE_FACTOR = 100;
	@UiField Image outletImage;
	@UiField Label outletName;
	@UiField Label outletAddress;
	@UiField Label outletDistance;
	@UiField TouchPanel directionsTouch;

	private static DealOutletWidgetUiBinder uiBinder = GWT.create(DealOutletWidgetUiBinder.class);

	interface DealOutletWidgetUiBinder extends UiBinder<Widget, DealOutletWidget> {
	}

	public DealOutletWidget(Outlet outlet) {
		initWidget(uiBinder.createAndBindUi(this));
		
		render(outlet);
	}

	private void render(final Outlet outlet) {
		outletName.setText(outlet.getName());
		com.softdive.madpiggy.app.client.model.Image outletImg = ImageHelper.getCoverImage(outlet.getCompany(), ImageType.TINY);
		outletImage.setUrl(AppConstant.MP_C_URL + outlet.getCompany().getId() + "/" + outletImg.getFilename());
		outletImage.getElement().getStyle().setMargin(2, Unit.PX);
		outletImage.setWidth(SCALE_FACTOR+String.valueOf(Unit.PX));
		outletImage.setHeight(SCALE_FACTOR+String.valueOf(Unit.PX));
		outletAddress.setText(Util.prepareAddress(outlet.getAddress()));
		outletDistance.setText(Native.convertTo2decimalplaces(outlet.getDistance())+"KM");
		directionsTouch.addTapHandler(new TapHandler() {
			
			@Override
			public void onTap(TapEvent event) {
				Native.openExternalMap(outlet.getAddress().getLatitude(), outlet.getAddress().getLongitude());
			}
		});
	}
	
	

}
