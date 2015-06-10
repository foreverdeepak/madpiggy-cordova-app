package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

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
