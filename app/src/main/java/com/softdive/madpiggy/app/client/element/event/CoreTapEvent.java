package com.softdive.madpiggy.app.client.element.event;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.components.gwt.polymer.client.webapi.element.Event;
import com.vaadin.components.gwt.polymer.client.webapi.element.EventListener;

@JsType
public interface CoreTapEvent extends Event {

    static final String NAME = "tap";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        @JsProperty boolean isSelected();

        @JsProperty Object item();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(CoreTapEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((CoreTapEvent) event);
        }
    }
}
