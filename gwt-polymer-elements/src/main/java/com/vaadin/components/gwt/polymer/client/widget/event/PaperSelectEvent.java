package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperSelectEvent extends GwtEvent<PaperSelectEventHandler> {
    public static Type<PaperSelectEventHandler> TYPE = new Type<PaperSelectEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent nativeEvent;
    
    public PaperSelectEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperSelectEventHandler handler) {
        handler.onCoreSelect(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isSelected() {
        return getNativeEvent().getDetail().isSelected();
    }

    public Object getItem() {
        return getNativeEvent().getDetail().item();
    }
   
}
