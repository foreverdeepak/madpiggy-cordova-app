package com.softdive.madpiggy.app.client.widget.celllist;

import com.google.gwt.user.client.ui.Composite;
import com.softdive.madpiggy.app.client.widget.celllist.staggered.StaggeredViewProps;

public abstract class CellWidget<T> extends Composite {
	
	protected CellSelectionObserver observer;
	protected int index;
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public void setObserver(CellSelectionObserver observer) {
		this.observer = observer;
	}
	
	public abstract void render(T model);
	
	public int getHeight() {
		return 0;
	}
	
	public void onPropertiesLoad(StaggeredViewProps props) {
		
	}
}
