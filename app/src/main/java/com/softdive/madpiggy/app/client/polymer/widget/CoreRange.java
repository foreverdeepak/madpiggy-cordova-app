package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreRangeElement;

public class CoreRange extends PolymerWidget {

    public CoreRange(String html) {
        this("core-range", html);
    }
    
    public CoreRange(String tag, String html) {
        super(tag, html);

    }

    public CoreRangeElement getPolymerElement() {
        return (CoreRangeElement) getElement();
    }
    

    public double getValue() {
        return getPolymerElement().value();
    }
    public void setValue(double value) {
        getElement().setAttribute("value", String.valueOf(value));
    }
    public void setValue(String value) {
        getElement().setAttribute("value", value);
    }

    public double getMin() {
        return getPolymerElement().min();
    }
    public void setMin(double value) {
        getElement().setAttribute("min", String.valueOf(value));
    }
    public void setMin(String min) {
        getElement().setAttribute("min", min);
    }

    public double getMax() {
        return getPolymerElement().max();
    }
    public void setMax(double value) {
        getElement().setAttribute("max", String.valueOf(value));
    }
    public void setMax(String max) {
        getElement().setAttribute("max", max);
    }

    public double getStep() {
        return getPolymerElement().step();
    }
    public void setStep(double value) {
        getElement().setAttribute("step", String.valueOf(value));
    }
    public void setStep(String step) {
        getElement().setAttribute("step", step);
    }

    public double getRatio() {
        return getPolymerElement().ratio();
    }
    public void setRatio(double value) {
        getElement().setAttribute("ratio", String.valueOf(value));
    }
    public void setRatio(String ratio) {
        getElement().setAttribute("ratio", ratio);
    }




}
