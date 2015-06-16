package com.softdive.madpiggy.app.client.nearby;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.dealslisting.DealListView;
import com.softdive.madpiggy.app.client.dealslisting.DealListViewImpl;
import com.softdive.madpiggy.app.client.detail.ItemData;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.tab.Tab;
import com.softdive.madpiggy.app.client.tab.Tab.TabType;
import com.softdive.madpiggy.app.client.widget.NotFound;
import com.softdive.madpiggy.app.client.widget.celllist.CellSelectedEvent;
import com.softdive.madpiggy.app.client.widget.celllist.CellSelectedHandler;

/**
 * Created by deepakc on 10/06/15.
 */
public class DealsPresenterImpl implements NearbyView.DealsPresenter,
		CellSelectedHandler {

	private ClientFactory clientFactory;
	private DealListView dealListView;
	private long[] ids;
	
	private NearbyView.Presenter nearbyPresenter;
	
	public DealsPresenterImpl(ClientFactory clientFactory, NearbyView.Presenter presenter) {
		this.clientFactory = clientFactory;
		this.nearbyPresenter = presenter;
	}

    @Override
    public Widget getWidget(Tab tab) {
    	Collection<Advertisement> ads = new ArrayList<Advertisement>();
    	dealListView = new DealListViewImpl();
    	switch (tab.getTabType()) {
		case DEALS:
			ads = App.getListingDataStore().getList().getAdvertisements();
			break;

		case CATEGORY:
			ads = App.getListingDataStore().getAdsByCategory(tab.getName());
			break;

		default:
			break;
		}

		if (ads == null || ads.size() == 0) {
			return new NotFound(
					"wallet-giftcard",
					"Nothing in " + tab.getName(),
					"Look Like we Don't Have Any Deals in your nearby area. Please change your location in Settings and try again");
		}
		ids = new long[ads.size()];
		int i = 0;
		for (Advertisement advertisement : ads) {
			ids[i++] = advertisement.getId();
		}
		dealListView.render(ads, 0);
		dealListView.getList().addCellSelectedHandler(this);
		return dealListView.asWidget();
	}

	@Override
    public void onCellSelected(CellSelectedEvent event) {
		ItemData itemData =  new ItemData();
		itemData.setSelected(((Advertisement) event.getItem()).getId());
		itemData.initialize(ids);
		nearbyPresenter.showDetailView(TabType.DEALS, itemData);
    }

	@Override
	public void onStop() {
		// TODO call server to save liked deals
	}

}
