package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperOverlayOpenCompletedEvent extends Event {

    static final String NAME = "core-overlay-open-completed";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperOverlayOpenCompletedEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperOverlayOpenCompletedEvent) event);
        }
    }
}
