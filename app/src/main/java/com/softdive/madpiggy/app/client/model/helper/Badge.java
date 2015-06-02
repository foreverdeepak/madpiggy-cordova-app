package com.softdive.madpiggy.app.client.model.helper;

public enum Badge {
	BRONZE(1), SILVER(2), GOLD(3), PLATINUM(4);

	Badge(Integer level) {
		this.setLevel(level);
	}

	private Integer level;

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public static Badge getBadgeByLevel(Integer l) {
		for (Badge be : Badge.values()) {
			if (be.getLevel() == l) {
				return be;
			}
		}
		return null;
	}
}