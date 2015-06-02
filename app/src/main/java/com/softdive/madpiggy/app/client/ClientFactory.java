package com.softdive.madpiggy.app.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.softdive.madpiggy.app.client.model.User;

/**
 * Created by deepakc on 02/06/15.
 */
public interface ClientFactory {

    EventBus getEventBus();

    PhoneGap getPhoneGap();

    AppHistoryObserver getHistoryObserver();

    PlaceController getPlaceController();

    User getUser();
}
