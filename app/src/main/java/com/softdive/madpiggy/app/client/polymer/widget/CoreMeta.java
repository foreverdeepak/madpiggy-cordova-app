package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.core.client.JsArray;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.CoreMetaElement;

public class CoreMeta extends PolymerWidget {

    public CoreMeta(String html) {
        this("core-meta", html);
    }
    
    public CoreMeta(String tag, String html) {
        super(tag, html);

    }

    public CoreMetaElement getPolymerElement() {
        return (CoreMetaElement) getElement();
    }
    

    public String getType() {
        return getPolymerElement().type();
    }
    public void setType(String value) {
        getElement().setAttribute("type", String.valueOf(value));
    }
    


    public JsArray getList(){
        return getPolymerElement().list();
    }
    public void setList(JsArray value) {
        getPolymerElement().list(value);
    }


    public void byId(String id) {
        getPolymerElement().byId(id);
    }


}
