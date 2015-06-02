package com.softdive.madpiggy.app.client.model;

import java.util.Date;

public class Image {

	private String name;
	private Source source;
	private Date created;
	private long foreignId;
	private long height;
	private long width;
	private ImageType imgType;
	private String filename;

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public long getWidth() {
		return width;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	public long getForeignId() {
		return foreignId;
	}

	public void setForeignId(long foreignId) {
		this.foreignId = foreignId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public ImageType getImgType() {
		return imgType;
	}

	public void setImgType(ImageType imgType) {
		this.imgType = imgType;
	}

	public String getFilename() {
		if (imgType == ImageType.ORIG) {
			filename = name;
		} else {
			filename = imgType.name() + '_' + name;
		}
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public static enum ImageType {
		THUMB(250, 250), TINY(100, 80), ORIG(0, 0), LARGE(750, 600);

		private int height;
		private int width;

		private ImageType(int width, int height) {
			this.height = height;
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public int getWidth() {
			return width;
		}
	}
}
