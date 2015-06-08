package com.softdive.madpiggy.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPager;
import com.vaadin.components.gwt.polymer.client.element.PaperTabsElement;
import com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent;


/**
 * Created by deepakc on 25/05/15.
 */
public class TestView2 extends Composite {
    interface TestView2UiBinder extends UiBinder<HTMLPanel, TestView2> {
    }

    private static TestView2UiBinder ourUiBinder = GWT.create(TestView2UiBinder.class);

    @UiField FlexPanel flexPanel;
    @UiField PaperTabsElement paperTabsElement;

    public TestView2() {
        initWidget(ourUiBinder.createAndBindUi(this));

        final ViewPager carousel = new ViewPager();
        carousel.setShowCarouselIndicator(false);

        for (int i = 1; i <=9; i++) {
            ScrollPanel scrollPanel = new ScrollPanel();
            scrollPanel.setHeight(Window.getClientHeight() -128 + "px");
            scrollPanel.getElement().getStyle().setWidth(100, Style.Unit.PCT);
            FlowPanel flowPanel3 = new FlowPanel();
            flowPanel3.getElement().getStyle().setWidth(100, Style.Unit.PCT);
            flowPanel3.add(new HTML("top"));

            for (int j = 0; j < 200; j++) {
                HTML html = new HTML("Slide: " + (i));
                flowPanel3.add(html);
            }
            flowPanel3.add(new HTML("bottom"));
            scrollPanel.add(flowPanel3);
            //carousel.add(scrollPanel);
        }
        carousel.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);

        flexPanel.add(carousel);
        new Timer() {
            @Override
            public void run() {
                carousel.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
            }
        }.schedule(350);


        paperTabsElement.addEventListener(CoreSelectEvent.NAME, new CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(CoreSelectEvent event) {
                Integer index = Integer.parseInt(paperTabsElement.selected().toString());
                carousel.setSelectedPage(index.intValue());
            }
        });

        carousel.addSelectionHandler(new SelectionHandler<Integer>() {
            @Override
            public void onSelection(SelectionEvent<Integer> event) {
                paperTabsElement.selected(event.getSelectedItem() + "");
            }
        });
    }
}