package com.softdive.madpiggy.app.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.softdive.madpiggy.app.client.nearby.NearbyPlace;
import com.softdive.madpiggy.app.client.notification.NotificationPlace;

@WithTokenizers({NearbyPlace.NearbyPlaceTokenizer.class, NotificationPlace.NoticationPlaceTokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
