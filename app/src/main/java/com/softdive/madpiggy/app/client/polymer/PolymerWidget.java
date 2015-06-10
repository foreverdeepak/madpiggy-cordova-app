package com.softdive.madpiggy.app.client.polymer;



import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.HTMLPanel;

public class PolymerWidget extends HTMLPanel {

    public PolymerWidget(String tag, String html) {
        super(tag, html);
        //Polymer.ensureHTMLImport(tag);
    }

    public PolymerWidget(String tag, SafeHtml safeHtml) {
        super(tag, safeHtml.asString());
    }

    public void setHorizontal(boolean horizontal) {
        setBooleanAttribute("horizontal", horizontal);
    }
    public void setHorizontal(String horizontal) {
        setBooleanAttribute("horizontal", true);
    }
    
    public void setLayout(boolean layout) {
        setBooleanAttribute("layout", layout);
    }
    public void setLayout(String layout) {
        setBooleanAttribute("layout", true);
    }

    public void setCenter(boolean center) {
        setBooleanAttribute("center", center);
    }
    public void setCenter(String center) {
        setBooleanAttribute("center", true);
    }

    public void setFlex(boolean flex) {
        setBooleanAttribute("flex", flex);
    }
    public void setFlex(String flex) {
        setBooleanAttribute("flex", true);
    }

    public void setSelfEnd(boolean selfEnd) {
        setBooleanAttribute("self-end", selfEnd);
    }
    public void setSelfEnd(String selfEnd) {
        setBooleanAttribute("self-end", true);
    }
    

    public void setDisabled(boolean disabled) {
        setBooleanAttribute("disabled", disabled);
    }
    public void setDisabled(String disabled) {
        setBooleanAttribute("disabled", true);
    }
    
    
    public void setAriaLabel(String ariaLabel) {
        getElement().setAttribute("ariaLabel", ariaLabel);
    }


    public void setCenterCenter(String centerCenter) {
        getElement().setAttribute("center-center", centerCenter);
    }
    

    public void setBooleanAttribute(String name, boolean value) {
        if (value) {
            getElement().setAttribute(name, "");
        } else {
            getElement().removeAttribute(name);
        }
    }

    // TODO: Remove this hack for paper-radio-button
    public void setName(String value) {
        getElement().setAttribute("name", value);
    }

    // TODO: Remove this hack for paper-tabs
    public void setLink(String link) {
        getElement().setAttribute("link", link);
    }

    // TODO: Remove this hacks for paper-button
    public void setActive(String active) {
        getElement().setAttribute("active", active);
    }
    public void setToggle(String toggle) {
        getElement().setAttribute("toggle", toggle);
    }
    public void setNoink(String noink) {
        getElement().setAttribute("noink", noink);
    }
    public void setDismissive(String dismissive) {
        getElement().setAttribute("dismissive", dismissive);
    }
    public void setAffirmative(String affirmative) {
        getElement().setAttribute("affirmative", affirmative);
    }
    public void setAutofocus(String autofocus) {
        getElement().setAttribute("autofocus", autofocus);
    }

    // TODO: Remove this hacks for paper-menu-button
    public void setLabel(String label) {
        getElement().setAttribute("label", label);
    }

    public HandlerRegistration addClickHandler(ClickHandler handler) {
        return addDomHandler(handler, ClickEvent.getType());
    }

    public void setDrawer(String drawer) {
        getElement().setAttribute("drawer", drawer);
    }

    public String getDrawer() {
        return getElement().getAttribute("drawer");
    }
}
