package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreAnimationPropElement;

public class CoreAnimationProp extends PolymerWidget {

    public CoreAnimationProp(String html) {
        this("core-animation-prop", html);
    }
    
    public CoreAnimationProp(String tag, String html) {
        super(tag, html);

    }

    public CoreAnimationPropElement getPolymerElement() {
        return (CoreAnimationPropElement) getElement();
    }
    


    public String getName(){
        return getPolymerElement().name();
    }
    public void setName(String value) {
        getPolymerElement().name(value);
    }

    public Object getValue(){
        return getPolymerElement().value();
    }
    public void setValue(Object value) {
        getPolymerElement().value(value);
    }



}
