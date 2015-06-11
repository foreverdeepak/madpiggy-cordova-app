package com.softdive.madpiggy.app.client.detail;

import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;

public interface AbstractDetailPresenter {

	void start(Widget parent, EventBus eventBus);
	
	void stop();
	
}
