package com.softdive.madpiggy.app.client.detail.deal;

import com.ait.toolkit.gmaps.client.GMapWidget;
import com.ait.toolkit.gmaps.client.base.LatLng;
import com.ait.toolkit.gmaps.client.core.GMapOptions;
import com.ait.toolkit.gmaps.client.events.handlers.MapReadyHandler;
import com.ait.toolkit.gmaps.client.overlays.Marker;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Overflow;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.ui.client.widget.touch.TouchPanel;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.model.Mall;

public class DealMallWidget extends Composite {

	@UiField Label mallName;
	@UiField Label mallAddress;
	@UiField HTMLPanel mapContainer;
	@UiField HTMLPanel description;
	@UiField TouchPanel mapTouch;

	private GMapWidget gMapWidget;
	private Mall mall;

	private static DealMallWidgetUiBinder uiBinder = GWT.create(DealMallWidgetUiBinder.class);

	interface DealMallWidgetUiBinder extends UiBinder<Widget, DealMallWidget> {
	}

	public DealMallWidget(final Mall mall) {
		this.mall = mall;
		initWidget(uiBinder.createAndBindUi(this));
		mallName.setText(mall.getMallName());
		initMap();
	}

	public void refresh() {
		mapContainer.clear();
		initMap();
	}

	public void initMap() {
		description.removeFromParent();
		gMapWidget = new GMapWidget();
		mapContainer.add(gMapWidget);
		gMapWidget.getElement().getStyle().setDisplay(Display.NONE);
		gMapWidget.getElement().getStyle().setOverflow(Overflow.VISIBLE);
		gMapWidget.getElement().getStyle().setHeight(10, Unit.EM);
		gMapWidget.setSize((Native.getWindowWidth() - 36) + "px", "10em");
		gMapWidget.addMapReadyHandler(new MapReadyHandler() {

			@Override
			public void onMapReady() {
				LatLng markerPosition = new LatLng(mall.getLatitude(), mall.getLongitude());
				gMapWidget.getElement().getStyle().setDisplay(Display.BLOCK);
				Marker marker = new Marker();
				marker.setPosition(markerPosition);
				marker.setMap(gMapWidget.getMap());
				gMapWidget.getMap().setZoom(12);
				GMapOptions mapOptions = new GMapOptions();
				mapOptions.setDisableDefaultUI(true);
				mapOptions.setDraggable(false);
				mapOptions.setScaleControl(false);
				mapOptions.setScrollWheel(false);
				gMapWidget.getMap().setOptions(mapOptions);
				gMapWidget.getMap().setCenter(markerPosition);
				gMapWidget.getMap().panBy(-200, -100);
				gMapWidget.getMap().triggerEvent("resize");
				gMapWidget.asWidget().getElement().appendChild(description.getElement());
				mapTouch.addTapHandler(new TapHandler() {
					
					@Override
					public void onTap(TapEvent event) {
						Native.openExternalMap(mall.getLatitude(), mall.getLongitude());
					}
				});
			}
		});
	}

}
