package com.softdive.madpiggy.app.client.model;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.Size;

public class Company extends Imageable {

	private long id;
	@Size(min = 1, max = 255) private String name;
	private String description;
	@Valid private Address headOffice;
	private Collection<Preference> preferences;
	private Country country;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(Address headOffice) {
		this.headOffice = headOffice;
	}

	public Collection<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(Collection<Preference> preferences) {
		this.preferences = preferences;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

}
