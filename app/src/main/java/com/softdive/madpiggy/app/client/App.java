package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Created by deepakc on 21/05/15.
 */
public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {

        TestView2 testView = new TestView2();
        RootPanel.get().add(testView);

    }
}
