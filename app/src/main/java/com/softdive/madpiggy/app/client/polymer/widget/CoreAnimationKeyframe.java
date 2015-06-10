package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreAnimationKeyframeElement;

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
