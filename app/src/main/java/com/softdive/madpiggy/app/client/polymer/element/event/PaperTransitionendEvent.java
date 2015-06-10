package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperTransitionendEvent extends Event {

    static final String NAME = "core-transitionend";

    @Override
    @JsProperty
    Detail getDetail();

    @JsType
    interface Detail extends Event.Detail {

        @JsProperty Object node();

    }


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperTransitionendEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperTransitionendEvent) event);
        }
    }
}
