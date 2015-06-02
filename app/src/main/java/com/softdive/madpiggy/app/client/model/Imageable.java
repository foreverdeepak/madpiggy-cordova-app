package com.softdive.madpiggy.app.client.model;

import java.util.Collection;

public abstract class Imageable extends Persistable {

	private Collection<Image> images;
	private String coverImage;

	public Collection<Image> getImages() {
		return images;
	}

	public void setImages(Collection<Image> images) {
		this.images = images;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
}
