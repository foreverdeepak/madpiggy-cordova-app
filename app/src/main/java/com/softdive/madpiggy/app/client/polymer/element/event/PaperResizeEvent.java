package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperResizeEvent extends Event {

    static final String NAME = "core-resize";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperResizeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperResizeEvent) event);
        }
    }
}
