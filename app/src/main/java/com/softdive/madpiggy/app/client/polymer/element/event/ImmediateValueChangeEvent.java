package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface ImmediateValueChangeEvent extends Event {

    static final String NAME = "immediate-value-change";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(ImmediateValueChangeEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((ImmediateValueChangeEvent) event);
        }
    }
}
