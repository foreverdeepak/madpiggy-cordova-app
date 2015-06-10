package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreAnimationGroupElement;

public class CoreAnimationGroup extends PolymerWidget {

    public CoreAnimationGroup(String html) {
        this("core-animation-group", html);
    }
    
    public CoreAnimationGroup(String tag, String html) {
        super(tag, html);

    }

    public CoreAnimationGroupElement getPolymerElement() {
        return (CoreAnimationGroupElement) getElement();
    }
    


    public Object getTarget(){
        return getPolymerElement().target();
    }
    public void setTarget(Object value) {
        getPolymerElement().target(value);
    }

    public double getDuration(){
        return getPolymerElement().duration();
    }
    public void setDuration(double value) {
        getPolymerElement().duration(value);
    }

    public String getType(){
        return getPolymerElement().type();
    }
    public void setType(String value) {
        getPolymerElement().type(value);
    }



}
