package com.softdive.madpiggy.app.client;

import java.util.logging.Logger;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.History;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.event.BackButtonPressedEvent;
import com.googlecode.gwtphonegap.client.event.BackButtonPressedHandler;
import com.googlecode.mgwt.dom.client.event.mouse.HandlerRegistrationCollection;
import com.googlecode.mgwt.mvp.client.history.HistoryHandler;
import com.googlecode.mgwt.mvp.client.history.HistoryObserver;

public class AppHistoryObserver implements HistoryObserver {

	protected static final Logger logger = Logger.getLogger(AppHistoryObserver.class.getName());

	private ClientFactory clientFactory;
	private static PhoneGap phoneGap;

	public AppHistoryObserver(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
		phoneGap = clientFactory.getPhoneGap();

		this.clientFactory.getPhoneGap().getEvent().getBackButton().addBackButtonPressedHandler(new BackButtonPressedHandler() {

			@Override
			public void onBackButtonPressed(BackButtonPressedEvent event) {
				AppHistoryObserver.back();
			}
		});

		exportHistoryBack();
	}

	public static native void exportHistoryBack() /*-{
		$wnd.madpiggyBack = $entry(@com.softdive.madpiggy.app.client.AppHistoryObserver::back());
	}-*/;

	public static void back() {
		History.back();
	}

	@Override
	public void onPlaceChange(Place place, HistoryHandler handler) {
		logger.info("onPlaceChange " + place.toString());
	}

	@Override
	public void onHistoryChanged(Place place, HistoryHandler handler) {
		logger.info("onHistoryChange " + place.toString());
	}

	@Override
	public void onAppStarted(Place place, HistoryHandler historyHandler) {

	}

	@Override
	public HandlerRegistration bind(EventBus eventBus, HistoryHandler historyHandler) {
		HandlerRegistrationCollection col = new HandlerRegistrationCollection();
		return col;
	}

}
