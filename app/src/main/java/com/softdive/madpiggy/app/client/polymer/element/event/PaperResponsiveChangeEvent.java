package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperResponsiveChangeEvent extends Event {

    static final String NAME = "core-responsive-change";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        @JsProperty boolean narrow();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperResponsiveChangeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperResponsiveChangeEvent) event);
        }
    }
}
