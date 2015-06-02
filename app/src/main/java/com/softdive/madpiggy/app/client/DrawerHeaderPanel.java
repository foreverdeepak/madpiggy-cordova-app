package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.place.shared.Place;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.softdive.madpiggy.app.client.element.event.CoreTapEvent;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.nearby.NearbyPlace;
import com.softdive.madpiggy.app.client.notification.NotificationPlace;
import com.vaadin.components.gwt.polymer.client.element.CoreMenuElement;
import com.vaadin.components.gwt.polymer.client.element.PaperItemElement;
import com.vaadin.components.gwt.polymer.client.widget.CoreHeaderPanel;

/**
 * Created by deepakc on 27/05/15.
 */
public class DrawerHeaderPanel extends Composite {
    interface DrawerHeaderPanelUiBinder extends UiBinder<CoreHeaderPanel, DrawerHeaderPanel> {
    }

    private static DrawerHeaderPanelUiBinder ourUiBinder = GWT.create(DrawerHeaderPanelUiBinder.class);

    @UiField SpanElement username;
    @UiField SpanElement email;

    @UiField PaperItemElement nearby;
    @UiField PaperItemElement map;
    @UiField PaperItemElement notifications;
    @UiField PaperItemElement checkin;
    @UiField PaperItemElement about;
    @UiField PaperItemElement logout;

    @UiField CoreMenuElement menu;

    public DrawerHeaderPanel() {
        initWidget(ourUiBinder.createAndBindUi(this));

        User user = App.get().getClientFactory().getUser();
        if(user != null) {
            username.setInnerText(user.getFullName());
            email.setInnerText(user.getPrimaryEmail());
        }

        nearby.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {
                goTo(Page.NEARBY);
            }
        });
        map.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {
                goTo(Page.NEARBY);
            }
        });
        notifications.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {
                goTo(Page.NOTIFICATIONS);
            }
        });
        checkin.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {
                goTo(Page.NEARBY);
            }
        });
        about.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {
                goTo(Page.NEARBY);
            }
        });
        logout.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {
                goTo(Page.NEARBY);
            }
        });
    }

    private void goTo(Page page) {
        Place place = null;
        switch (page) {
            case NEARBY:
                place = new NearbyPlace(null);
                break;
            case MAP:
                break;
            case NOTIFICATIONS:
                place = new NotificationPlace();
                break;
            case ABOUT:
                break;
            case CHECKIN:
                break;
            case LOGOUT:
                break;
        }
        final Place finalPlace = place;
        new Timer() {
            @Override
            public void run() {
                App.get().getClientFactory().getPlaceController().goTo(finalPlace);
            }
        }.schedule(350);
    }

    public void setSelected(Page page) {
        switch (page) {
            case NEARBY:
                menu.selected("0");
                break;
            case MAP:
                menu.selected("1");
                break;
            case NOTIFICATIONS:
                menu.selected("2");
                break;
            case ABOUT:
                menu.selected("3");
                break;
            case CHECKIN:
                menu.selected("4");
                break;
            case LOGOUT:
                menu.selected("5");
                break;
        }
    }

    /**
     * Created by deepakc on 02/06/15.
     */
    public static interface DrawableLayoutView {

        DrawerHeaderPanel getDrawerHeaderPanel();
    }
}