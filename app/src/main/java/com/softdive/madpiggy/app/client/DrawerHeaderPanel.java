package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.vaadin.components.gwt.polymer.client.widget.CoreHeaderPanel;

/**
 * Created by deepakc on 27/05/15.
 */
public class DrawerHeaderPanel extends Composite {
    interface DrawerHeaderPanelUiBinder extends UiBinder<CoreHeaderPanel, DrawerHeaderPanel> {
    }

    private static DrawerHeaderPanelUiBinder ourUiBinder = GWT.create(DrawerHeaderPanelUiBinder.class);

    public DrawerHeaderPanel() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}