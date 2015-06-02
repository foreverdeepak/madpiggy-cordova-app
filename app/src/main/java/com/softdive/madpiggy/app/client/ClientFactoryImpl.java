package com.softdive.madpiggy.app.client;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.softdive.madpiggy.app.client.model.User;

/**
 * Created by deepakc on 02/06/15.
 */
public class ClientFactoryImpl implements ClientFactory {

    private EventBus eventBus;
    private PhoneGap phoneGap;
    private PlaceController placeController;
    private AppHistoryObserver historyObserver;

    public ClientFactoryImpl(PhoneGap phoneGap) {
        this.phoneGap = phoneGap;
        this.eventBus = new SimpleEventBus();
        this.placeController = new PlaceController(eventBus);
        this.historyObserver = new AppHistoryObserver(this);
    }

    @Override
    public EventBus getEventBus() {
        return eventBus;
    }

    @Override
    public PhoneGap getPhoneGap() {
        return phoneGap;
    }

    @Override
    public AppHistoryObserver getHistoryObserver() {
        return historyObserver;
    }

    @Override
    public PlaceController getPlaceController() {
        return placeController;
    }

    @Override
    public User getUser() {
        return null;
    }
}
