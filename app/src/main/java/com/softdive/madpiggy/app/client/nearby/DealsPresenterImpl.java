package com.softdive.madpiggy.app.client.nearby;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.dealslisting.DealListView;
import com.softdive.madpiggy.app.client.dealslisting.DealListViewImpl;
import com.softdive.madpiggy.app.client.dealslisting.DealWidget;
import com.softdive.madpiggy.app.client.detail.AbstractDetailPresenter;
import com.softdive.madpiggy.app.client.detail.DealDetailPresenter;
import com.softdive.madpiggy.app.client.detail.ItemData;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.helper.MallWrapper;
import com.softdive.madpiggy.app.client.tab.Tab;
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
	public DealsPresenterImpl(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
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
    	AbstractDetailPresenter abstractDetailPresenter =  new DealDetailPresenter(clientFactory, itemData);
    	final DealWidget dealWidget = (DealWidget) event.getWidget();
    	if (event.hasTouchElement("backButton")) {
			//Window.scrollTo(0, scrollTop);
			dealWidget.endAnimation();
		} else {
			dealWidget.startAnimation(itemData);
		}
    	
    }

	@Override
	public void onStop() {
		// TODO call server to save liked deals
	}

}
