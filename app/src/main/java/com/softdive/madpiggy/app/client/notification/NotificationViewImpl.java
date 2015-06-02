package com.softdive.madpiggy.app.client.notification;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.softdive.madpiggy.app.client.DrawerHeaderPanel;
import com.softdive.madpiggy.app.client.Page;

/**
 * Created by deepakc on 02/06/15.
 */
public class NotificationViewImpl extends Composite implements NotificationView {
    interface NotificationViewImplUiBinder extends UiBinder<HTMLPanel, NotificationViewImpl> {
    }

    private static NotificationViewImplUiBinder ourUiBinder = GWT.create(NotificationViewImplUiBinder.class);

    private Presenter presenter;

    @UiField
    DrawerHeaderPanel drawerHeaderPanel;

    public NotificationViewImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
        drawerHeaderPanel.setSelected(Page.NOTIFICATIONS);

    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public DrawerHeaderPanel getDrawerHeaderPanel() {
        return drawerHeaderPanel;
    }
}