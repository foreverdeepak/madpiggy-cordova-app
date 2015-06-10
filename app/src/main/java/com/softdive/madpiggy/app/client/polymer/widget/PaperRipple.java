package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperRippleElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperTransitionendEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperTransitionendEventHandler;

public class PaperRipple extends PolymerWidget {

    public PaperRipple(String html) {
        this("paper-ripple", html);
    }
    
    public PaperRipple(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                PaperTransitionendEvent.NAME,
                new PaperTransitionendEvent.Listener() {

					@Override
					protected void handleEvent(PaperTransitionendEvent event) {
						 fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperTransitionendEvent(event));						
					}
           
        });

    }

    public PaperRippleElement getPolymerElement() {
        return (PaperRippleElement) getElement();
    }
    

    public double getInitialOpacity() {
        return getPolymerElement().initialOpacity();
    }
    public void setInitialOpacity(double value) {
        getElement().setAttribute("initialOpacity", String.valueOf(value));
    }
    public void setInitialOpacity(String initialOpacity) {
        getElement().setAttribute("initialOpacity", initialOpacity);
    }

    public double getOpacityDecayVelocity() {
        return getPolymerElement().opacityDecayVelocity();
    }
    public void setOpacityDecayVelocity(double value) {
        getElement().setAttribute("opacityDecayVelocity", String.valueOf(value));
    }
    public void setOpacityDecayVelocity(String opacityDecayVelocity) {
        getElement().setAttribute("opacityDecayVelocity", opacityDecayVelocity);
    }




    public HandlerRegistration addCoreTransitionendHandler(PaperTransitionendEventHandler handler) {
        return addHandler(handler, com.softdive.madpiggy.app.client.polymer.widget.event.PaperTransitionendEvent.TYPE);
    }

}
