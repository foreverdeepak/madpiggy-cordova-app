package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.softdive.madpiggy.app.client.AbstractPlace;

/**
 * Created by deepakc on 02/06/15.
 */
public class NearbyPlace extends AbstractPlace {

    private String tab;

    public NearbyPlace(String tab) {
        this.tab = tab;
    }

    public static class NearbyPlaceTokenizer implements PlaceTokenizer<NearbyPlace> {

        @Override
        public NearbyPlace getPlace(String token) {
            return new NearbyPlace(token);
        }

        @Override
        public String getToken(NearbyPlace place) {
            return place.tab;
        }
    }

    public String getTab() {
        return tab;
    }
}
