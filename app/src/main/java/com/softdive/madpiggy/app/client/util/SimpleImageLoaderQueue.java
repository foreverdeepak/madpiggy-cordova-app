package com.softdive.madpiggy.app.client.util;

import com.google.gwt.event.dom.client.ErrorEvent;
import com.google.gwt.event.dom.client.ErrorHandler;
import com.softdive.madpiggy.app.client.global.GlobalResources;


public class SimpleImageLoaderQueue implements ImageLoaderQueue {

	@Override
	public void push(ImageHolder... holders) {
		for (final ImageHolder imageHolder : holders) {
			imageHolder.image.getElement().getStyle().setBackgroundImage("url("+GlobalResources.INSTANCE.getLoadingImage().getSafeUri().asString()+")");
			imageHolder.errorHandlerRegistration = imageHolder.image.addErrorHandler(new ErrorHandler() {
				
				@Override
				public void onError(ErrorEvent event) {
					if (imageHolder.errorUrl != null) {
						imageHolder.image.setUrl(imageHolder.errorUrl);
					} else {
						imageHolder.image.setUrl(GlobalResources.INSTANCE.getLoadingImage().getSafeUri());
					}
				}
			});
			imageHolder.image.setUrl(imageHolder.url);
		}
	}

	@Override
	public void clear() {

	}

}
