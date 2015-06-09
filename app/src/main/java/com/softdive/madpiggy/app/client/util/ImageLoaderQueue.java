package com.softdive.madpiggy.app.client.util;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Image;

public interface ImageLoaderQueue {
	
	public static final ImageLoaderQueue IMAGE_LOADER_QUEUE = GWT.create(ImageLoaderQueue.class);
	
	void push(ImageHolder... holders);
	
	void clear();

	public static class ImageHolder {
		Image image;
		String url;
		String errorUrl;
		HandlerRegistration loadHandlerRegistration;
		HandlerRegistration errorHandlerRegistration;
		HandlerRegistration attachHandlerRegistration;
		
		public ImageHolder(Image image, String url) {
			this.image = image;
			this.url = url;
		}
		
		public ImageHolder(Image image, String url, String errorUrl) {
			this.image = image;
			this.url = url;
			this.errorUrl = errorUrl;
		}
		
	}
}
