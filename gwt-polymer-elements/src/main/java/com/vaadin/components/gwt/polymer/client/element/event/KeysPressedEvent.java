package com.vaadin.components.gwt.polymer.client.element.event;

import com.vaadin.components.gwt.polymer.client.webapi.element.Event;
import com.vaadin.components.gwt.polymer.client.webapi.element.EventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface KeysPressedEvent extends Event {

    static final String NAME = "keys-pressed";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        @JsProperty boolean shift();

        @JsProperty boolean ctrl();

        @JsProperty boolean meta();

        @JsProperty boolean alt();

        @JsProperty String key();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(KeysPressedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((KeysPressedEvent) event);
        }
    }
}
