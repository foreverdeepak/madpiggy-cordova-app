package com.softdive.madpiggy.app.client.polymer.element.event;

import com.google.gwt.core.client.js.JsType;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Event;
import com.softdive.madpiggy.app.client.polymer.webapi.element.EventListener;

@JsType
public interface PaperAnimatedPagesTransitionEndEvent extends Event {

    static final String NAME = "core-animated-pages-transition-end";


    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(PaperAnimatedPagesTransitionEndEvent event);

        @Override
        public void handleEvent(Event event) {
            handleEvent((PaperAnimatedPagesTransitionEndEvent) event);
        }
    }
}
