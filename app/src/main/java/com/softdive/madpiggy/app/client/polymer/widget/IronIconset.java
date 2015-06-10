package com.softdive.madpiggy.app.client.polymer.widget;

import com.softdive.madpiggy.app.client.polymer.element.IronIconsetElement;
import com.softdive.madpiggy.app.client.polymer.webapi.element.Element;


public class IronIconset extends CoreMeta {

    public IronIconset(String html) {
        this("iron-iconset", html);
    }
    
    public IronIconset(String tag, String html) {
        super(tag, html);

    }

    public IronIconsetElement getPolymerElement() {
        return (IronIconsetElement) getElement();
    }
    

    public String getSrc() {
        return getPolymerElement().src();
    }
    public void setSrc(String value) {
        getElement().setAttribute("src", String.valueOf(value));
    }
    

    public double getWidth() {
        return getPolymerElement().width();
    }
    public void setWidth(double value) {
        getElement().setAttribute("width", String.valueOf(value));
    }
    public void setWidth(String width) {
        getElement().setAttribute("width", width);
    }

    public String getIcons() {
        return getPolymerElement().icons();
    }
    public void setIcons(String value) {
        getElement().setAttribute("icons", String.valueOf(value));
    }
    

    public double getIconSize() {
        return getPolymerElement().iconSize();
    }
    public void setIconSize(double value) {
        getElement().setAttribute("iconSize", String.valueOf(value));
    }
    public void setIconSize(String iconSize) {
        getElement().setAttribute("iconSize", iconSize);
    }

    public double getOffsetX() {
        return getPolymerElement().offsetX();
    }
    public void setOffsetX(double value) {
        getElement().setAttribute("offsetX", String.valueOf(value));
    }
    public void setOffsetX(String offsetX) {
        getElement().setAttribute("offsetX", offsetX);
    }

    public double getOffsetY() {
        return getPolymerElement().offsetY();
    }
    public void setOffsetY(double value) {
        getElement().setAttribute("offsetY", String.valueOf(value));
    }
    public void setOffsetY(String offsetY) {
        getElement().setAttribute("offsetY", offsetY);
    }



    public void getOffset(Object icon, String theme) {
        getPolymerElement().getOffset(icon, theme);
    }

    public void applyIcon(Element element, Object icon, double scale) {
        getPolymerElement().applyIcon(element, icon, scale);
    }


}
