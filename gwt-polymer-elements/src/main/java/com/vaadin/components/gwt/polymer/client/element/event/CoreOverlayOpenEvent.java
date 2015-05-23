package com.vaadin.components.gwt.polymer.client.element.event;

import com.vaadin.components.gwt.polymer.client.webapi.element.Event;
import com.vaadin.components.gwt.polymer.client.webapi.element.EventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreOverlayOpenEvent extends Event {

    static final String NAME = "core-overlay-open";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        @JsProperty boolean detail();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(CoreOverlayOpenEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((CoreOverlayOpenEvent) event);
        }
    }
}
