package com.softdive.madpiggy.app.client;

import org.fusesource.restygwt.client.Defaults;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.geolocation.Geolocation;
import com.googlecode.gwtphonegap.client.geolocation.GeolocationCallback;
import com.googlecode.gwtphonegap.client.geolocation.Position;
import com.googlecode.gwtphonegap.client.geolocation.PositionError;
import com.softdive.madpiggy.app.client.api.AdApi;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.helper.Latlng;
import com.softdive.madpiggy.app.client.rest.SingleApi;
import com.softdive.madpiggy.app.client.storage.user.UserStorage;
import com.softdive.madpiggy.app.client.widget.Spinner;

/**
 * Created by deepakc on 02/06/15.
 */
public class ClientFactoryImpl implements ClientFactory {

    private EventBus eventBus;
    private PhoneGap phoneGap;
    private PlaceController placeController;
    private AppHistoryObserver historyObserver;
    private Spinner spinner;
    private AdApi adApi;
	private SingleApi singleApi;
	private Geolocation geolocation;

    public ClientFactoryImpl(PhoneGap phoneGap) {
        this.phoneGap = phoneGap;
        this.eventBus = new SimpleEventBus();
        this.placeController = new PlaceController(eventBus);
        this.historyObserver = new AppHistoryObserver(this);
        initGeolocation();
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
        return UserStorage.USER_STORAGE.retrieveSavedUser();
    }

	@Override
	public Widget getSpinner() {
		if (spinner == null) {
			spinner = new Spinner();
		}
		return spinner;
	}
	
	private SingleApi getSingleApi() {
		if (singleApi == null) {
			Defaults.setDateFormat(null);
			Defaults.setServiceRoot(GWT.getHostPageBaseURL());
			singleApi = GWT.create(SingleApi.class);
		}
		return singleApi;
	}

	@Override
	public AdApi getAdApi() {
		if (adApi == null) {
			adApi = new AdApi(getSingleApi());
		}
		return adApi;
	}
	
	public void initGeolocation() {
		if (geolocation == null) {
			geolocation = GWT.create(Geolocation.class);
		}
		geolocation.getCurrentPosition(new GeolocationCallback() {

			@Override
			public void onSuccess(Position p) {
				UserStorage.USER_STORAGE.updateUserLocation(new Latlng(p.getCoordinates().getLatitude(), p.getCoordinates().getLongitude()));
			}

			@Override
			public void onFailure(PositionError error) {
			}

		});
	}

	@Override
	public Latlng getCurrentLocation() {
		initGeolocation();
		return UserStorage.USER_STORAGE.getUserLocation();
	}
}
