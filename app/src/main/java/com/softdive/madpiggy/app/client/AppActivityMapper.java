package com.softdive.madpiggy.app.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.softdive.madpiggy.app.client.nearby.NearbyActivity;
import com.softdive.madpiggy.app.client.nearby.NearbyPlace;
import com.softdive.madpiggy.app.client.notification.NotificationActivity;
import com.softdive.madpiggy.app.client.notification.NotificationPlace;

/**
 * Created by deepakc on 02/06/15.
 */
public class AppActivityMapper  implements ActivityMapper {

    private ClientFactory clientFactory;

    public AppActivityMapper(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(Place place) {
        if(place instanceof NearbyPlace) {
            return new NearbyActivity(clientFactory);
        }
        if(place instanceof NotificationPlace) {
            return new NotificationActivity(clientFactory);
        }
        return null;
    }
}
