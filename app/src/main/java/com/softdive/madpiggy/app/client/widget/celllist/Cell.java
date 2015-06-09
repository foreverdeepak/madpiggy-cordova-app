package com.softdive.madpiggy.app.client.widget.celllist;


public interface Cell<T> {

	public CellWidget<T> createWidget();

	public boolean canBeSelected(T model);
}
