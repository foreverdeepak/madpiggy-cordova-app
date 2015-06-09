package com.softdive.madpiggy.app.client.tab;

public class Tab {

	private String id;
	private String name;
	private TabType tabType;
	
	public Tab(String name, TabType tabType) {
		setName(name);
		setTabType(tabType);
	}

	public String getId() {
		if (id == null || id.trim().isEmpty()) {
			id = name;
		}
		return id;
	}

	public void setId(String id) {
		this.id = id.toUpperCase();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	public TabType getTabType() {
		return tabType;
	}

	public void setTabType(TabType tabType) {
		this.tabType = tabType;
	}

	public static enum TabType {
		DEALS, OUTLETS, MALLS, CATEGORY
	}

}
