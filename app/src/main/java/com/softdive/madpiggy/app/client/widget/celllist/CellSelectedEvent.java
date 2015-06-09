package com.softdive.madpiggy.app.client.widget.celllist;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.EventTarget;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.TouchEvent;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.Window;

public class CellSelectedEvent extends GwtEvent<CellSelectedHandler> {

	private static final GwtEvent.Type<CellSelectedHandler> TYPE = new GwtEvent.Type<CellSelectedHandler>();
	private final int index;
	private ProvidesItem<? extends Object> providesItem;
	private Element touchTarget;

	public CellSelectedEvent(int index, ProvidesItem<? extends Object> providesItem) {
		this.index = index;
		this.providesItem = providesItem;
	}
	
	public CellSelectedEvent(int index, ProvidesItem<? extends Object> providesItem, Element touchTarget) {
		this.index = index;
		this.providesItem = providesItem;
		this.touchTarget = touchTarget;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<CellSelectedHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(CellSelectedHandler handler) {
		handler.onCellSelected(this);
	}

	public static GwtEvent.Type<CellSelectedHandler> getType() {
		return TYPE;
	}

	public int getIndex() {
		return index;
	}

	@SuppressWarnings("unchecked")
	public <T> T getItem() {
		return (T) providesItem.getItem(index);
	}
	
	public CellWidget<? extends Object> getWidget() {
		return (CellWidget<? extends Object>) providesItem.getWidget(index);
	}
	
	public boolean hasTouchElement(String attribute) {
		Element shallow = touchTarget;
		if(shallow != null) {
			String idxString = "";
			while ((shallow != null) && ((idxString = shallow.getAttribute(attribute)).length() == 0)) {
				shallow = shallow.getParentElement();
			}
			
			if (idxString.length() > 0) {
				return true;
			}
		}
		return false;
	}
}
