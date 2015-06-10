package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreStyleElement;

public class CoreStyle extends PolymerWidget {

    public CoreStyle(String html) {
        this("core-style", html);
    }
    
    public CoreStyle(String tag, String html) {
        super(tag, html);

    }

    public CoreStyleElement getPolymerElement() {
        return (CoreStyleElement) getElement();
    }
    

    public String getId() {
        return getPolymerElement().id();
    }
    public void setId(String value) {
        getElement().setAttribute("id", String.valueOf(value));
    }
    

    public String getRef() {
        return getPolymerElement().ref();
    }
    public void setRef(String value) {
        getElement().setAttribute("ref", String.valueOf(value));
    }
    

    public Object getList() {
        return getPolymerElement().list();
    }
    public void setList(Object value) {
        getElement().setAttribute("list", String.valueOf(value));
    }
    public void setList(String list) {
        getElement().setAttribute("list", list);
    }




}
