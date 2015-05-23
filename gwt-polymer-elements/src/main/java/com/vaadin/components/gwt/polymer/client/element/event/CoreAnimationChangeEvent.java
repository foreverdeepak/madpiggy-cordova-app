package com.vaadin.components.gwt.polymer.client.element.event;

import com.vaadin.components.gwt.polymer.client.webapi.element.Event;
import com.vaadin.components.gwt.polymer.client.webapi.element.EventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreAnimationChangeEvent extends Event {

    static final String NAME = "core-animation-change";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(CoreAnimationChangeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((CoreAnimationChangeEvent) event);
        }
    }
}
