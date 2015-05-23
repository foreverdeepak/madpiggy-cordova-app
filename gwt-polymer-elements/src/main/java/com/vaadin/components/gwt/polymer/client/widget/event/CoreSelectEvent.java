package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreSelectEvent extends GwtEvent<CoreSelectEventHandler> {
    public static Type<CoreSelectEventHandler> TYPE = new Type<CoreSelectEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent nativeEvent;
    
    public CoreSelectEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreSelectEventHandler handler) {
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
