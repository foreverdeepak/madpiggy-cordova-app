package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreAnimationKeyframe extends PolymerWidget {

    public CoreAnimationKeyframe(String html) {
        this("core-animation-keyframe", html);
    }
    
    public CoreAnimationKeyframe(String tag, String html) {
        super(tag, html);

    }

    public CoreAnimationKeyframeElement getPolymerElement() {
        return (CoreAnimationKeyframeElement) getElement();
    }
    


    public double getOffset(){
        return getPolymerElement().offset();
    }
    public void setOffset(double value) {
        getPolymerElement().offset(value);
    }



}
