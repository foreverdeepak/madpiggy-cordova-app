package com.softdive.madpiggy.app.client.detail;

import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.softdive.madpiggy.app.client.ClientFactory;

public class DealDetailPresenter implements AbstractDetailPresenter {

	private ItemData itemData;
	private ClientFactory clientFactory;
	
	public DealDetailPresenter(ClientFactory clientFactory, ItemData itemData) {
		this.clientFactory = clientFactory;
		this.itemData = itemData;
	}

	@Override
	public void start(Widget parent, EventBus eventBus) {
		// View Pager logic goes here
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}
