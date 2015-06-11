package com.softdive.madpiggy.app.client.detail;

public class ItemData {

	private long selected;
	private long[] itemIds;

	public void setSelected(long selected) {
		this.selected = selected;

	}

	public void initialize(long[] itemIds) {
		this.itemIds = itemIds;
	}

	public long getSelected() {
		return selected;
	}

	public long[] getItemIds() {
		return itemIds;
	}

}
