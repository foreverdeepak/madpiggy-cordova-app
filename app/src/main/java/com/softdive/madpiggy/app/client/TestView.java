package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.vaadin.components.gwt.polymer.client.Polymer;
import com.vaadin.components.gwt.polymer.client.element.PaperTabElement;
import com.vaadin.components.gwt.polymer.client.element.PaperTabsElement;
import com.vaadin.components.gwt.polymer.client.element.PaperToastElement;
import com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent;
import com.vaadin.components.gwt.polymer.client.element.event.CoreTransitionendEvent;
import com.vaadin.components.gwt.polymer.client.widget.ViewFragment;
import com.vaadin.components.gwt.polymer.client.widget.ViewPager;

/**
 * Created by deepakc on 21/05/15.
 */
public class TestView extends Composite {
    interface TestViewUiBinder extends UiBinder<HTMLPanel, TestView> {
    }

    private static TestViewUiBinder ourUiBinder = GWT.create(TestViewUiBinder.class);

    @UiField
    ViewPager viewPager;

    @UiField
    PaperToastElement toast;

    public TestView() {
        initWidget(ourUiBinder.createAndBindUi(this));

    }
}