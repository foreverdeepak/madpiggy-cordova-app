package com.softdive.madpiggy.app.client.notification;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.softdive.madpiggy.app.client.AbstractPlace;

/**
 * Created by deepakc on 02/06/15.
 */
public class NotificationPlace extends AbstractPlace {


    public static class NoticationPlaceTokenizer implements PlaceTokenizer<NotificationPlace> {

        @Override
        public NotificationPlace getPlace(String token) {
            return new NotificationPlace();
        }

        @Override
        public String getToken(NotificationPlace place) {
            return "";
        }
    }
}
