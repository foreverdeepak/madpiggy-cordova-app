package com.softdive.madpiggy.app.client;

import com.googlecode.gwtphonegap.client.PhoneGap;

/**
 * Created by deepakc on 02/06/15.
 */
public final class App {

    private static App app;
    private ClientFactory clientFactory;

    public App(PhoneGap phoneGap) {
        clientFactory = new ClientFactoryImpl(phoneGap);
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
}
