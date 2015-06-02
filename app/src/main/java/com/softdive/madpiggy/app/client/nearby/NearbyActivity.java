package com.softdive.madpiggy.app.client.nearby;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.softdive.madpiggy.app.client.BaseActivity;
import com.softdive.madpiggy.app.client.ClientFactory;
import org.apache.bcel.generic.NEW;

/**
 * Created by deepakc on 02/06/15.
 */
public class NearbyActivity extends BaseActivity {

    public NearbyActivity(ClientFactory clientFactory) {
        super(clientFactory);
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);
        NearbyView nearbyView = new NearbyViewImpl();
        panel.setWidget(nearbyView);
    }
}
