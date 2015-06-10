package com.softdive.madpiggy.app.client.nearby;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.dealslisting.DealListView;
import com.softdive.madpiggy.app.client.dealslisting.DealListViewImpl;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.tab.Tab;
import com.softdive.madpiggy.app.client.widget.NotFound;

/**
 * Created by deepakc on 10/06/15.
 */
public class DealsPresenterImpl implements NearbyView.DealsPresenter {

    private ClientFactory clientFactory;
    private DealListView dealListView;

    public DealsPresenterImpl(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public Widget getWidget(Tab tab) {
    	Collection<Advertisement> ads = new ArrayList<Advertisement>();
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
    		return new NotFound("wallet-giftcard", "Nothing in "+tab.getName(),
					"Look Like we Don't Have Any Deals in your nearby area. Please change your location in Settings and try again");
    	}
    	
    	dealListView = new DealListViewImpl();
    	dealListView.render(ads, 0);
    	
        return dealListView.asWidget();
    }

	@Override
	public void onStop() {
		// TODO call server to save liked deals
	}

}
