package com.softdive.madpiggy.app.client;

import com.googlecode.gwtphonegap.client.PhoneGap;
import com.softdive.madpiggy.app.client.storage.ListingDataStore;

/**
 * Created by deepakc on 02/06/15.
 */
public final class App {

    private static App app;
    private ClientFactory clientFactory;
    private static ListingDataStore listingDataStore;

    public App(PhoneGap phoneGap) {
        clientFactory = new ClientFactoryImpl(phoneGap);
        listingDataStore = new ListingDataStore();
    }

    public static App get() {
        return app;
    }

    public ClientFactory getClientFactory() {
        return clientFactory;
    }

    public static void init(PhoneGap phoneGap) {
        app = new App(phoneGap);
    }
    
    public static ListingDataStore getListingDataStore() {
		return listingDataStore;
	}
}
