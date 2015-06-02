package com.softdive.madpiggy.app.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;
import com.googlecode.mgwt.mvp.client.history.MGWTPlaceHistoryHandler;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.softdive.madpiggy.app.client.nearby.NearbyPlace;

public class AppEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {

		final PhoneGap phoneGap = GWT.create(PhoneGap.class);

		phoneGap.addHandler(new PhoneGapAvailableHandler() {

			@Override
			public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {
				App.init(phoneGap);
				onModuleLoadInternal();
			}
		});

		phoneGap.addHandler(new PhoneGapTimeoutHandler() {

			@Override
			public void onPhoneGapTimeout(PhoneGapTimeoutEvent event) {
			}
		});

		phoneGap.initializePhoneGap();
	}

	private void onModuleLoadInternal() {
		MGWT.applySettings(new MGWTSettings());

		ClientFactory clientFactory = App.get().getClientFactory();

		SimplePanel display = new SimplePanel();
		AppActivityMapper appActivityMapper = new AppActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(appActivityMapper, clientFactory.getEventBus());
		activityManager.setDisplay(display);

		AppPlaceHistoryMapper historyMapper = GWT.create(AppPlaceHistoryMapper.class);
		MGWTPlaceHistoryHandler historyHandler = new MGWTPlaceHistoryHandler(historyMapper,clientFactory.getHistoryObserver());
		historyHandler.register(clientFactory.getPlaceController(), clientFactory.getEventBus(), new NearbyPlace(null));

		RootPanel.get().add(display);
		historyHandler.handleCurrentHistory();

	}
}
