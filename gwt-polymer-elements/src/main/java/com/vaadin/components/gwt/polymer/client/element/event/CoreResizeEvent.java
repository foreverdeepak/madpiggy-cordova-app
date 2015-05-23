package com.vaadin.components.gwt.polymer.client.element.event;

import com.vaadin.components.gwt.polymer.client.webapi.element.Event;
import com.vaadin.components.gwt.polymer.client.webapi.element.EventListener;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface CoreResizeEvent extends Event {

    static final String NAME = "core-resize";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(CoreResizeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((CoreResizeEvent) event);
        }
    }
}
