package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class PaperSelectEvent extends GwtEvent<PaperSelectEventHandler> {
    public static Type<PaperSelectEventHandler> TYPE = new Type<PaperSelectEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent nativeEvent;
    
    public PaperSelectEvent(com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<PaperSelectEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PaperSelectEventHandler handler) {
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
