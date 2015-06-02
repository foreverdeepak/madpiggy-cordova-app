package com.softdive.madpiggy.app.client.model;

import java.util.Set;

public class Role {

	private String name;
	private Set<Permission> permissions;

	public Role(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}
}
