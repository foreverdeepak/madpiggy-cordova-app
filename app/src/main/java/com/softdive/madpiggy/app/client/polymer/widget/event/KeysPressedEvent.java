package com.softdive.madpiggy.app.client.polymer.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class KeysPressedEvent extends GwtEvent<KeysPressedEventHandler> {
    public static Type<KeysPressedEventHandler> TYPE = new Type<KeysPressedEventHandler>();
    
    private com.softdive.madpiggy.app.client.polymer.element.event.KeysPressedEvent nativeEvent;
    
    public KeysPressedEvent(com.softdive.madpiggy.app.client.polymer.element.event.KeysPressedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<KeysPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(KeysPressedEventHandler handler) {
        handler.onKeysPressed(this);
    }
    
    public com.softdive.madpiggy.app.client.polymer.element.event.KeysPressedEvent getNativeEvent() {
        return nativeEvent;
    }

    public boolean isShift() {
        return getNativeEvent().getDetail().shift();
    }

    public boolean isCtrl() {
        return getNativeEvent().getDetail().ctrl();
    }

    public boolean isMeta() {
        return getNativeEvent().getDetail().meta();
    }

    public boolean isAlt() {
        return getNativeEvent().getDetail().alt();
    }

    public String getKey() {
        return getNativeEvent().getDetail().key();
    }
   
}
