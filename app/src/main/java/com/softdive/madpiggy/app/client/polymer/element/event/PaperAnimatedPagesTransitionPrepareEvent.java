package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperAnimatedPagesTransitionPrepareEvent extends Event {

    static final String NAME = "paper-animated-pages-transition-prepare";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperAnimatedPagesTransitionPrepareEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperAnimatedPagesTransitionPrepareEvent) event);
        }
    }
}
