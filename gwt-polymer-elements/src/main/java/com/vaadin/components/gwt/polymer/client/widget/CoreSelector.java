package com.vaadin.components.gwt.polymer.client.widget;

import com.vaadin.components.gwt.polymer.client.PolymerWidget;
import com.vaadin.components.gwt.polymer.client.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.element.*;
import com.vaadin.components.gwt.polymer.client.webapi.widget.alias.*;
import com.vaadin.components.gwt.polymer.client.widget.event.*;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;

public class CoreSelector extends PolymerWidget {

    public CoreSelector(String html) {
        this("core-selector", html);
    }
    
    public CoreSelector(String tag, String html) {
        super(tag, html);

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreSelectEvent event) {
                fireEvent(new CoreSelectEvent(event));
            }
        });

        getPolymerElement().addEventListener(
                com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent.NAME,
                new com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent.Listener() {
            @Override
            protected void handleEvent(com.vaadin.components.gwt.polymer.client.element.event.CoreActivateEvent event) {
                fireEvent(new CoreActivateEvent(event));
            }
        });

    }

    public CoreSelectorElement getPolymerElement() {
        return (CoreSelectorElement) getElement();
    }
    

    public Object getSelected() {
        return getPolymerElement().selected();
    }
    public void setSelected(Object value) {
        getElement().setAttribute("selected", String.valueOf(value));
    }
    public void setSelected(String selected) {
        getElement().setAttribute("selected", selected);
    }

    public boolean isMulti() {
        return getPolymerElement().multi();
    }
    public void setMulti(boolean value) {
        getElement().setAttribute("multi", String.valueOf(value));
    }
    public void setMulti(String multi) {
        setBooleanAttribute("multi", true);
    }

    public String getValueattr() {
        return getPolymerElement().valueattr();
    }
    public void setValueattr(String value) {
        getElement().setAttribute("valueattr", String.valueOf(value));
    }
    

    public String getSelectedClass() {
        return getPolymerElement().selectedClass();
    }
    public void setSelectedClass(String value) {
        getElement().setAttribute("selectedClass", String.valueOf(value));
    }
    

    public String getSelectedProperty() {
        return getPolymerElement().selectedProperty();
    }
    public void setSelectedProperty(String value) {
        getElement().setAttribute("selectedProperty", String.valueOf(value));
    }
    

    public String getSelectedAttribute() {
        return getPolymerElement().selectedAttribute();
    }
    public void setSelectedAttribute(String value) {
        getElement().setAttribute("selectedAttribute", String.valueOf(value));
    }
    

    public Object getSelectedItem() {
        return getPolymerElement().selectedItem();
    }
    public void setSelectedItem(Object value) {
        getElement().setAttribute("selectedItem", String.valueOf(value));
    }
    public void setSelectedItem(String selectedItem) {
        getElement().setAttribute("selectedItem", selectedItem);
    }

    public Object getSelectedModel() {
        return getPolymerElement().selectedModel();
    }
    public void setSelectedModel(Object value) {
        getElement().setAttribute("selectedModel", String.valueOf(value));
    }
    public void setSelectedModel(String selectedModel) {
        getElement().setAttribute("selectedModel", selectedModel);
    }

    public double getSelectedIndex() {
        return getPolymerElement().selectedIndex();
    }
    public void setSelectedIndex(double value) {
        getElement().setAttribute("selectedIndex", String.valueOf(value));
    }
    public void setSelectedIndex(String selectedIndex) {
        getElement().setAttribute("selectedIndex", selectedIndex);
    }

    public String getExcludedLocalNames() {
        return getPolymerElement().excludedLocalNames();
    }
    public void setExcludedLocalNames(String value) {
        getElement().setAttribute("excludedLocalNames", String.valueOf(value));
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

    public String getItemsSelector() {
        return getPolymerElement().itemsSelector();
    }
    public void setItemsSelector(String value) {
        getElement().setAttribute("itemsSelector", String.valueOf(value));
    }
    

    public String getActivateEvent() {
        return getPolymerElement().activateEvent();
    }
    public void setActivateEvent(String value) {
        getElement().setAttribute("activateEvent", String.valueOf(value));
    }
    

    public boolean isNotap() {
        return getPolymerElement().notap();
    }
    public void setNotap(boolean value) {
        getElement().setAttribute("notap", String.valueOf(value));
    }
    public void setNotap(String notap) {
        setBooleanAttribute("notap", true);
    }


    public JsArray getItems(){
        return getPolymerElement().items();
    }
    public void setItems(JsArray value) {
        getPolymerElement().items(value);
    }


    public void selectPrevious(boolean wrapped) {
        getPolymerElement().selectPrevious(wrapped);
    }

    public void selectNext(boolean wrapped) {
        getPolymerElement().selectNext(wrapped);
    }


    public HandlerRegistration addCoreSelectHandler(CoreSelectEventHandler handler) {
        return addHandler(handler, CoreSelectEvent.TYPE);
    }

    public HandlerRegistration addCoreActivateHandler(CoreActivateEventHandler handler) {
        return addHandler(handler, CoreActivateEvent.TYPE);
    }

}
