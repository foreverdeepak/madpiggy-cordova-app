package com.softdive.madpiggy.app.client.notification;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.softdive.madpiggy.app.client.BaseActivity;
import com.softdive.madpiggy.app.client.ClientFactory;

/**
 * Created by deepakc on 02/06/15.
 */
public class NotificationActivity extends BaseActivity {

    public NotificationActivity(ClientFactory clientFactory) {
        super(clientFactory);
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);
        NotificationView notificationView = new NotificationViewImpl();
        panel.setWidget(notificationView);
    }
}
