package com.vaadin.components.gwt.polymer.client.element.event;

import com.vaadin.components.gwt.polymer.client.webapi.element.Event;
import com.vaadin.components.gwt.polymer.client.webapi.element.EventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreTransitionendEvent extends Event {

    static final String NAME = "core-transitionend";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        @JsProperty Object node();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(CoreTransitionendEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((CoreTransitionendEvent) event);
        }
    }
}
