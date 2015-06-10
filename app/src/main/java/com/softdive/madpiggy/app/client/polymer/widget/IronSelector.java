package com.softdive.madpiggy.app.client.polymer.widget;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.softdive.madpiggy.app.client.polymer.PolymerWidget;
import com.softdive.madpiggy.app.client.polymer.element.IronMenuElement;
import com.softdive.madpiggy.app.client.polymer.element.IronSelectorElement;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperActivateEvent;
import com.softdive.madpiggy.app.client.polymer.element.event.PaperSelectEvent;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperActivateEventHandler;
import com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEventHandler;

public class IronSelector extends PolymerWidget {

	public IronSelector(String html) {
		this("iron-selector", html);
	}

	public IronSelector(String tag, String html) {
		super(tag, html);

		getPolymerElement().addEventListener(PaperSelectEvent.NAME,
				new PaperSelectEvent.Listener() {

					@Override
					protected void handleEvent(PaperSelectEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEvent(
								event));

					}
				});

		getPolymerElement().addEventListener(PaperActivateEvent.NAME,
				new PaperActivateEvent.Listener() {

					@Override
					protected void handleEvent(PaperActivateEvent event) {
						fireEvent(new com.softdive.madpiggy.app.client.polymer.widget.event.PaperActivateEvent(
								event));

					}
				});

	}

	public IronSelectorElement getPolymerElement() {
		return (IronSelectorElement) getElement();
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

	public JsArray getItems() {
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

	public HandlerRegistration addCoreSelectHandler(
			PaperSelectEventHandler handler) {
		return addHandler(
				handler,
				com.softdive.madpiggy.app.client.polymer.widget.event.PaperSelectEvent.TYPE);
	}

	public HandlerRegistration addCoreActivateHandler(
			PaperActivateEventHandler handler) {
		return addHandler(
				handler,
				com.softdive.madpiggy.app.client.polymer.widget.event.PaperActivateEvent.TYPE);
	}

}
