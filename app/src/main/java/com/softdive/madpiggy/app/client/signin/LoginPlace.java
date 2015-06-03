package com.softdive.madpiggy.app.client.signin;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.softdive.madpiggy.app.client.AbstractPlace;

/**
 * Created by deepakc on 02/06/15.
 */
public class LoginPlace extends AbstractPlace {


    public static class LoginPlaceTokenizer implements PlaceTokenizer<LoginPlace> {

        @Override
        public LoginPlace getPlace(String token) {
            return new LoginPlace();
        }

        @Override
        public String getToken(LoginPlace place) {
            return "";
        }
    }
}
