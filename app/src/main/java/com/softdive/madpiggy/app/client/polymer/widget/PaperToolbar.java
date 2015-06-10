package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreToolbarElement;

public class PaperToolbar extends PolymerWidget {

    public PaperToolbar(String html) {
        this("paper-toolbar", html);
    }
    
    public PaperToolbar(String tag, String html) {
        super(tag, html);

    }

    public CoreToolbarElement getPolymerElement() {
        return (CoreToolbarElement) getElement();
    }
    

    public String getJustify() {
        return getPolymerElement().justify();
    }
    public void setJustify(String value) {
        getElement().setAttribute("justify", String.valueOf(value));
    }
    

    public String getMiddleJustify() {
        return getPolymerElement().middleJustify();
    }
    public void setMiddleJustify(String value) {
        getElement().setAttribute("middleJustify", String.valueOf(value));
    }
    

    public String getBottomJustify() {
        return getPolymerElement().bottomJustify();
    }
    public void setBottomJustify(String value) {
        getElement().setAttribute("bottomJustify", String.valueOf(value));
    }
    




}
