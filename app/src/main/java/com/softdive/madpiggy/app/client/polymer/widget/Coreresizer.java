package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.CoreresizerElement;

public class Coreresizer extends Coreresizable {

    public Coreresizer(String html) {
        this("CoreResizer", html);
    }
    
    public Coreresizer(String tag, String html) {
        super(tag, html);

    }

    public CoreresizerElement getPolymerElement() {
        return (CoreresizerElement) getElement();
    }
    


    public Object getResizerIsPeer(){
        return getPolymerElement().resizerIsPeer();
    }
    public void setResizerIsPeer(Object value) {
        getPolymerElement().resizerIsPeer(value);
    }


    public void resizerAttachedHandler() {
        getPolymerElement().resizerAttachedHandler();
    }

    public void resizerDetachedHandler() {
        getPolymerElement().resizerDetachedHandler();
    }

    public void notifyResize() {
        getPolymerElement().notifyResize();
    }

    public void resizeerShouldNotify() {
        getPolymerElement().resizeerShouldNotify();
    }


}
