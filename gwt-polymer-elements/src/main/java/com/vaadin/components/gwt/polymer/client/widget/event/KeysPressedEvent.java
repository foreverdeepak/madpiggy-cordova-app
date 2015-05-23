package com.vaadin.components.gwt.polymer.client.widget.event;

import com.google.gwt.event.shared.GwtEvent;

public class KeysPressedEvent extends GwtEvent<KeysPressedEventHandler> {
    public static Type<KeysPressedEventHandler> TYPE = new Type<KeysPressedEventHandler>();
    
    private com.vaadin.components.gwt.polymer.client.element.event.KeysPressedEvent nativeEvent;
    
    public KeysPressedEvent(com.vaadin.components.gwt.polymer.client.element.event.KeysPressedEvent nativeEvent) {
        this.nativeEvent = nativeEvent;
    }
 
    public Type<KeysPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(KeysPressedEventHandler handler) {
        handler.onKeysPressed(this);
    }
    
    public com.vaadin.components.gwt.polymer.client.element.event.KeysPressedEvent getNativeEvent() {
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
