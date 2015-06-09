package com.softdive.madpiggy.app.client.widget.celllist;

public interface ProvidesItem<T> {

	T getItem(int key);
	
	CellWidget<T> getWidget(int key);

}
