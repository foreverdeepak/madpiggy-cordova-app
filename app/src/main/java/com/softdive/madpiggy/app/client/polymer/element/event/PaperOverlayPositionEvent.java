package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperOverlayPositionEvent extends Event {

    static final String NAME = "core-overlay-position";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        @JsProperty Object target();

        @JsProperty Object sizingTarget();

        @JsProperty Object opened();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperOverlayPositionEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperOverlayPositionEvent) event);
        }
    }
}
