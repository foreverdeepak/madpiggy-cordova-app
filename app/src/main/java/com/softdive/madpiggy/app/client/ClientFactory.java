package com.softdive.madpiggy.app.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.softdive.madpiggy.app.client.api.AdApi;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.helper.Latlng;

/**
 * Created by deepakc on 02/06/15.
 */
public interface ClientFactory {

    EventBus getEventBus();

    PhoneGap getPhoneGap();

    AppHistoryObserver getHistoryObserver();

    PlaceController getPlaceController();

    User getUser();
    
    Widget getSpinner();
    
    AdApi getAdApi();
    
	public Latlng getCurrentLocation();

}
