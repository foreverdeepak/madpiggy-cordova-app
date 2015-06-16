package com.softdive.madpiggy.app.client.detail;


import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.detail.deal.DealDetailViewImpl;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.storage.ListingDataStore;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPager;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPagerAdapter;

public class DetailView extends Composite implements ViewPagerAdapter {

	private static DetailViewUiBinder uiBinder = GWT.create(DetailViewUiBinder.class);
	
	@UiField FlexPanel parentContainer;
	private ItemData iteamData;
	private ListingDataStore listDataStorage;
	
	interface DetailViewUiBinder extends UiBinder<Widget, DetailView> {
	}

	public DetailView(ItemData itemData) {
		this.iteamData = itemData;
		initWidget(uiBinder.createAndBindUi(this));
		listDataStorage = App.getListingDataStore();
		ViewPager viewPager = new ViewPager();
		viewPager.setAdapter(this);
		viewPager.setShowCarouselIndicator(false);
		parentContainer.add(viewPager);
		parentContainer.setHeight(Native.getWindowHeight()+String.valueOf(Unit.PX));
		parentContainer.setWidth(Native.getWindowWidth()+String.valueOf(Unit.PX));
	}

	@Override
	public Widget getWidget(int index) {
		return new DealDetailViewImpl(listDataStorage.getAdByAdId(iteamData.getItemIds()[index]).getAdvertisement());
	}

	@Override
	public int getItemCount() {
		return iteamData.getItemIds().length;
	}

	@Override
	public void onItemSelected(int index) {

	}

}
