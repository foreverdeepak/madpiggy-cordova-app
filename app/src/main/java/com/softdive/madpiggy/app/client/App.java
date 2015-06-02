package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;

public class App implements EntryPoint {

	@Override
	public void onModuleLoad() {

		final PhoneGap phoneGap = GWT.create(PhoneGap.class);

		phoneGap.addHandler(new PhoneGapAvailableHandler() {

			@Override
			public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {
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
		TestView2 testView = new TestView2();
		RootPanel.get().add(testView);
	}
}
