package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.EntityElement;

public class Entity extends PolymerWidget {

    public Entity(String html) {
        this("Entity", html);
    }
    
    public Entity(String tag, String html) {
        super(tag, html);

    }

    public EntityElement getPolymerElement() {
        return (EntityElement) getElement();
    }
    




}
