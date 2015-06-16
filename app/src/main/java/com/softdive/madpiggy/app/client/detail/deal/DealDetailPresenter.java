package com.softdive.madpiggy.app.client.detail.deal;

import com.google.gwt.user.client.ui.FlowPanel;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.detail.AbstractDetailPresenter;
import com.softdive.madpiggy.app.client.detail.DetailView;
import com.softdive.madpiggy.app.client.detail.ItemData;
public class DealDetailPresenter implements AbstractDetailPresenter {

	private ItemData itemData;
	
	public DealDetailPresenter(ClientFactory clientFactory, ItemData itemData) {
		this.itemData = itemData;
	}

	@Override
	public void start(FlowPanel parent) {
		parent.clear();
		parent.add(new DetailView(itemData));
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}


}
