package com.softdive.madpiggy.app.client.detail;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.storage.ListingDataStore;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPager;
import com.softdive.madpiggy.app.client.widget.viewpager.ViewPagerAdapter;

public class DetailPagerViewImpl extends Composite implements DetailViewPager, ViewPagerAdapter{
    interface DetailViewUiBinder extends UiBinder<HTMLPanel, DetailPagerViewImpl> {
    }

    private static DetailViewUiBinder ourUiBinder = GWT.create(DetailViewUiBinder.class);

    @UiField FlexPanel flexPanel;

    public DetailPagerViewImpl(ItemData itemData) {
        initWidget(ourUiBinder.createAndBindUi(this));
        final ViewPager carousel = new ViewPager();
        carousel.setShowCarouselIndicator(false);
        carousel.setAdapter(this);
        ListingDataStore dataStore = App.getListingDataStore();
        for (long id : itemData.getItemIds()) {
        		carousel.getElement().appendChild(new DealDetailWidget(dataStore.getAdByAdId(id).getAdvertisement()).getElement());
        }	
        carousel.getElement().getStyle().setVisibility(Style.Visibility.HIDDEN);

        flexPanel.add(carousel);
        new Timer() {
            @Override
            public void run() {
                carousel.getElement().getStyle().setVisibility(Style.Visibility.VISIBLE);
            }
        }.schedule(350);


    

        carousel.addSelectionHandler(new SelectionHandler<Integer>() {
            @Override
            public void onSelection(SelectionEvent<Integer> event) {
             //   paperTabsElement.selected(event.getSelectedItem() + "");
            }
        });
    }

	@Override
	public void setSelected(long id) {
		
	}


	@Override
	public Widget getWidget(int index) {
		return this;
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void onItemSelected(int index) {
		
	}
}
