package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.PaperAutogrowTextareaElement;

public class PaperAutogrowTextarea extends PolymerWidget {

    public PaperAutogrowTextarea(String html) {
        this("paper-autogrow-textarea", html);
    }
    
    public PaperAutogrowTextarea(String tag, String html) {
        super(tag, html);

    }

    public PaperAutogrowTextareaElement getPolymerElement() {
        return (PaperAutogrowTextareaElement) getElement();
    }
    

    public Object getTarget() {
        return getPolymerElement().target();
    }
    public void setTarget(Object value) {
        getElement().setAttribute("target", String.valueOf(value));
    }
    public void setTarget(String target) {
        getElement().setAttribute("target", target);
    }

    public double getRows() {
        return getPolymerElement().rows();
    }
    public void setRows(double value) {
        getElement().setAttribute("rows", String.valueOf(value));
    }
    public void setRows(String rows) {
        getElement().setAttribute("rows", rows);
    }

    public double getMaxRows() {
        return getPolymerElement().maxRows();
    }
    public void setMaxRows(double value) {
        getElement().setAttribute("maxRows", String.valueOf(value));
    }
    public void setMaxRows(String maxRows) {
        getElement().setAttribute("maxRows", maxRows);
    }



    public void update() {
        getPolymerElement().update();
    }


}
