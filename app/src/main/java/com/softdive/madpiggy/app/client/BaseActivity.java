package com.softdive.madpiggy.app.client;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

/**
 * Created by deepakc on 02/06/15.
 */
public abstract class BaseActivity extends MGWTAbstractActivity {

    protected ClientFactory clientFactory;
    protected AcceptsOneWidget mainPanel;

    public BaseActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);
        this.mainPanel = panel;
    }
}
