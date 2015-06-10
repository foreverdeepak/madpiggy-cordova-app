package com.softdive.madpiggy.app.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.softdive.madpiggy.app.client.mallDetail.MallDetailPlace.MallDetailPlaceTokenizer;
import com.softdive.madpiggy.app.client.nearby.NearbyPlace;
import com.softdive.madpiggy.app.client.notification.NotificationPlace;
import com.softdive.madpiggy.app.client.signin.LoginPlace;

@WithTokenizers({NearbyPlace.NearbyPlaceTokenizer.class, NotificationPlace.NoticationPlaceTokenizer.class, LoginPlace.LoginPlaceTokenizer.class, MallDetailPlaceTokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
