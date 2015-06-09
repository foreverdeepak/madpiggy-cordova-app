package com.softdive.madpiggy.app.client.model.helper;

import java.util.Collection;
import java.util.HashSet;

public class Category {
	
	private String name;
	private String parentCategory;
	private Collection<Category> children;
	private int level;
	private int sequenceId;
	
	public int getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(String parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Collection<Category> getChildren() {
		return children;
	}
	
	public void addChild(Category category) {
		if(children == null) {
			children = new HashSet<>();
		}
		children.add(category);
	}
	
	public void setChildren(Collection<Category> children) {
		this.children = children;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
