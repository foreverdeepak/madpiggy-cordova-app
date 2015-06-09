package com.softdive.madpiggy.app.client.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Logger;

import com.google.gwt.event.dom.client.ErrorEvent;
import com.google.gwt.event.dom.client.ErrorHandler;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.user.client.Timer;
import com.softdive.madpiggy.app.client.global.GlobalResources;

public class DefaultImageLoaderQueue implements ImageLoaderQueue {
	
	protected static final Logger logger = Logger.getLogger(DefaultImageLoaderQueue.class.getName());

	private static final int DEFAULT_PARALLEL_LOAD_SIZE = 5;

	private Queue<ImageHolder> waitQueue = new LinkedList<ImageLoaderQueue.ImageHolder>();
	private List<ImageHolder> runningQueue = new ArrayList<ImageLoaderQueue.ImageHolder>(DEFAULT_PARALLEL_LOAD_SIZE);

	private Timer timer;
	
	@Override
	public void push(ImageHolder... holders) {
		for (final ImageHolder imageHolder : holders) {
			setPlaceHolder(imageHolder);
			waitQueue.add(imageHolder);
		}
		if(timer == null || !timer.isRunning()) {
			startTimer();
		}
	}
	
	private void load() {
		for(int i = 0; i < DEFAULT_PARALLEL_LOAD_SIZE; i++) {
			ImageHolder holder = waitQueue.poll();
			if(holder == null) break;
			runningQueue.add(holder);
		}
		
		for (final ImageHolder imageHolder : runningQueue) {
			addHandlers(imageHolder);
		}
	}

	private void addHandlers(final ImageHolder imageHolder) {
		imageHolder.loadHandlerRegistration = imageHolder.image.addLoadHandler(new LoadHandler() {
			
			@Override
			public void onLoad(LoadEvent event) {
				remove(imageHolder);
			}
		});
		
		imageHolder.errorHandlerRegistration = imageHolder.image.addErrorHandler(new ErrorHandler() {
			
			@Override
			public void onError(ErrorEvent event) {
				remove(imageHolder);
				if (imageHolder.errorUrl != null) {
					imageHolder.image.setUrl(imageHolder.errorUrl);
				} else {
					imageHolder.image.setUrl(GlobalResources.INSTANCE.getLoadingImage().getSafeUri());
				}
			}
		});
		
		imageHolder.image.setUrl(imageHolder.url);
	}
	
	private void startTimer() {
		if (timer != null) {
			timer.cancel();
			timer = null;
		}

		timer = new Timer() {

			@Override
			public void run() {
				load();
			}
		};
		timer.schedule(150);
	}

	private void remove(ImageHolder holder) {
		holder.errorHandlerRegistration.removeHandler();
		holder.loadHandlerRegistration.removeHandler();
		waitQueue.remove(holder);
		runningQueue.remove(holder);
		
		if(runningQueue.size() == 0 && waitQueue.size() != 0) {
			load();
		} else if(runningQueue.size() == 0 && waitQueue.size() == 0) {
			startTimer();
		}
	}
	
	private void setPlaceHolder(ImageHolder imageHolder) {
		imageHolder.image.getElement().getStyle().setBackgroundImage("url("+GlobalResources.INSTANCE.getLoadingImage().getSafeUri().asString()+")");
	}

	@Override
	public void clear() {
		//clear timer
		if (timer != null) {
			timer.cancel();
			timer = null;
		}

		//remove handlers
		for (final ImageHolder holder : runningQueue) {
			if (holder.loadHandlerRegistration!= null) {
				holder.loadHandlerRegistration.removeHandler();
			}
			
			if(holder.errorHandlerRegistration != null) {
				holder.errorHandlerRegistration.removeHandler();
			}
			
			if(holder.attachHandlerRegistration != null) {
				holder.attachHandlerRegistration.removeHandler();
			}
			
			holder.attachHandlerRegistration = holder.image.addAttachHandler(new Handler() {
				
				@Override
				public void onAttachOrDetach(AttachEvent event) {
					addHandlers(holder);
				}
			});
			
		}
		for (final ImageHolder holder : waitQueue) {
			if (holder.loadHandlerRegistration!= null) {
				holder.loadHandlerRegistration.removeHandler();
			}
			if(holder.errorHandlerRegistration != null) {
				holder.errorHandlerRegistration.removeHandler();
			}
			
			if(holder.attachHandlerRegistration != null) {
				holder.attachHandlerRegistration.removeHandler();
			}
			
			holder.attachHandlerRegistration = holder.image.addAttachHandler(new Handler() {
				
				@Override
				public void onAttachOrDetach(AttachEvent event) {
					addHandlers(holder);
				}
			});
		}
		
		//clear queues
		runningQueue.clear();
		waitQueue.clear();
	}
}
