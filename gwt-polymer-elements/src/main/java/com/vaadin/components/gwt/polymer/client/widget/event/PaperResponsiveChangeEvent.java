package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperResponsiveChangeEvent extends GwtEvent<PaperResponsiveChangeEventHandler> {
    public static Type<PaperResponsiveChangeEventHandler> TYPE = new Type<PaperResponsiveChangeEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent nativeEvent;
    
    public PaperResponsiveChangeEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperResponsiveChangeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperResponsiveChangeEventHandler handler) {
        handler.onCoreResponsiveChange(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreResponsiveChangeEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isNarrow() {
        return getNativeEvent().getDetail().narrow();
    }
   
}
