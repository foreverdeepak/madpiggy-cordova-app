package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperCollapseOpenEvent extends GwtEvent<PaperCollapseOpenEventHandler> {
    public static Type<PaperCollapseOpenEventHandler> TYPE = new Type<PaperCollapseOpenEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent nativeEvent;
    
    public PaperCollapseOpenEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperCollapseOpenEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperCollapseOpenEventHandler handler) {
        handler.onCoreCollapseOpen(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreCollapseOpenEvent getNativeEvent() {
        return nativeEvent;
    }
   
}
