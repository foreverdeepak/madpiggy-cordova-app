package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.softdive.madpiggy.app.client.polymer.element.PaperItemElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent;
import com.softdive.madpiggy.app.client.polymer.widget.PaperMenuButton;

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

        inviteFriends.addEventListener(PaperSelectEvent.NAME, new PaperSelectEvent.Listener() {
            @Override
            protected void handleEvent(PaperSelectEvent event) {

            }
        });
        refresh.addEventListener(PaperSelectEvent.NAME, new PaperSelectEvent.Listener() {
            @Override
            protected void handleEvent(PaperSelectEvent event) {

            }
        });

    }
}