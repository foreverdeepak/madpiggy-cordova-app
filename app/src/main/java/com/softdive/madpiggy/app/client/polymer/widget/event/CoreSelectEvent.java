package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class CoreSelectEvent extends GwtEvent<CoreSelectEventHandler> {
    public static Type<CoreSelectEventHandler> TYPE = new Type<CoreSelectEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent nativeEvent;
    
    public CoreSelectEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<CoreSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(CoreSelectEventHandler handler) {
        handler.onCoreSelect(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isSelected() {
        return getNativeEvent().getDetail().isSelected();
    }

    public Object getItem() {
        return getNativeEvent().getDetail().item();
    }
   
}
