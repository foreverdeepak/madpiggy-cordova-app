package com.softdive.madpiggy.app.client.model;

import java.util.ArrayList;
import java.util.Collection;

public class Kingdom {

	private String name;
	private String badge;
	private long userId;
	private long pointsEarned;
	private Collection<Kingdom> children = new ArrayList<Kingdom>();
	private boolean isParent;

	public boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(boolean isParent) {
		this.isParent = isParent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Collection<Kingdom> getChildren() {
		return children;
	}

	public void setChildren(Collection<Kingdom> children) {
		this.children = children;
	}

	public long getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(long pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
}
