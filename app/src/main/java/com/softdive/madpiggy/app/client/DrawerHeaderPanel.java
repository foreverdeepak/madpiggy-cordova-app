package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.vaadin.components.gwt.polymer.client.element.PaperItemElement;
import com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent;
import com.vaadin.components.gwt.polymer.client.element.event.CoreTapEvent;
import com.vaadin.components.gwt.polymer.client.widget.CoreHeaderPanel;

/**
 * Created by deepakc on 27/05/15.
 */
public class DrawerHeaderPanel extends Composite {
    interface DrawerHeaderPanelUiBinder extends UiBinder<CoreHeaderPanel, DrawerHeaderPanel> {
    }

    private static DrawerHeaderPanelUiBinder ourUiBinder = GWT.create(DrawerHeaderPanelUiBinder.class);

    @UiField PaperItemElement inbox;

    public DrawerHeaderPanel() {
        initWidget(ourUiBinder.createAndBindUi(this));

        inbox.addEventListener(CoreTapEvent.NAME, new CoreTapEvent.Listener() {
            @Override
            protected void handleEvent(CoreTapEvent event) {
                Window.alert("Inbox");
            }
        });
    }
}