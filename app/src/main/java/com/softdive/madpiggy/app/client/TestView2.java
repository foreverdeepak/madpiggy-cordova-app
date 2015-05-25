package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.components.gwt.polymer.client.webapi.element.Element;

/**
 * Created by deepakc on 25/05/15.
 */
public class TestView2 extends Composite {
    interface TestView2UiBinder extends UiBinder<HTMLPanel, TestView2> {
    }

    private static TestView2UiBinder ourUiBinder = GWT.create(TestView2UiBinder.class);

    public TestView2() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }


}