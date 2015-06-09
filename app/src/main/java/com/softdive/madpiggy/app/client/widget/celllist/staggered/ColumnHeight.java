package com.softdive.madpiggy.app.client.widget.celllist.staggered;

public class ColumnHeight {
	int index;
	int height;

	public ColumnHeight(int index, int height) {
		this.index = index;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public int getIndex() {
		return index;
	}
}
