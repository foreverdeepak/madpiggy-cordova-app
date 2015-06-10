package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperAnimationFinishEvent extends Event {

    static final String NAME = "core-animation-finish";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperAnimationFinishEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperAnimationFinishEvent) event);
        }
    }
}
