package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.vaadin.components.gwt.polymer.client.element.PaperItemElement;
import com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent;
import com.vaadin.components.gwt.polymer.client.widget.PaperMenuButton;

/**
 * Created by deepakc on 02/06/15.
 */
public class DefaultMenu extends Composite implements Menu {
    interface DefaultMenuUiBinder extends UiBinder<PaperMenuButton, DefaultMenu> {
    }

    private static DefaultMenuUiBinder ourUiBinder = GWT.create(DefaultMenuUiBinder.class);

    @UiField PaperItemElement inviteFriends;
    @UiField PaperItemElement refresh;

    public DefaultMenu() {
        initWidget(ourUiBinder.createAndBindUi(this));

        inviteFriends.addEventListener(CoreSelectEvent.NAME, new CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(CoreSelectEvent event) {

            }
        });
        refresh.addEventListener(CoreSelectEvent.NAME, new CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(CoreSelectEvent event) {

            }
        });

    }
}