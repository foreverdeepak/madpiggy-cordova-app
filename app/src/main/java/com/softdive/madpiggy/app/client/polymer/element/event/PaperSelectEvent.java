package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperSelectEvent extends Event {

    static final String NAME = "core-select";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        @JsProperty boolean isSelected();

        @JsProperty Object item();

    }

    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperSelectEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperSelectEvent) event);
        }
    }
}
