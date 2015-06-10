package com.softdive.madpiggy.app.client.nearby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.model.Outlet;
import com.softdive.madpiggy.app.client.model.Preference;
import com.softdive.madpiggy.app.client.model.helper.FavouritePreferences;
import com.softdive.madpiggy.app.client.model.helper.OutletWrapper;
import com.softdive.madpiggy.app.client.nearby.NearbyView.OutletsPresenter;
import com.softdive.madpiggy.app.client.outletlist.OutletList;
import com.softdive.madpiggy.app.client.outletlist.OutletListWidget;
import com.softdive.madpiggy.app.client.storage.user.UserConstants;
import com.softdive.madpiggy.app.client.widget.NotFound;
import com.softdive.madpiggy.app.client.widget.celllist.CellSelectedEvent;
import com.softdive.madpiggy.app.client.widget.celllist.CellSelectedHandler;

public class OutletsPresenterImpl implements OutletsPresenter, CellSelectedHandler {
	
	private ClientFactory clientFactory;
	private OutletList outletList;
	
	private Collection<Long> newLikedOutlets;
	private Collection<Long> newDisLikedOutlets;

	public OutletsPresenterImpl(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
		newLikedOutlets = new ArrayList<Long>();
		newDisLikedOutlets = new ArrayList<Long>();
	}

	@Override
	public Widget getWidget() {
		Collection<OutletWrapper> outlets = prepareOutlet(App.getListingDataStore().getList().getOutlets());
		
		if (outlets == null || outlets.size() == 0) {
    		return new NotFound("wallet-giftcard", "Nothing in Outlets",
					"Look Like we Don't Have Any Outlets in your nearby area. Please change your location in Settings and try again");
    	}
		
		outletList = new OutletList();
		outletList.render(outlets, 0);
		
		outletList.getList().addCellSelectedHandler(this);
		return outletList;
	}

	@Override
	public void onStop() {
		if (newLikedOutlets != null) {
			final List<Preference> likedPreferences = new ArrayList<Preference>();
			for (Long mallId : newLikedOutlets) {
				Preference preference = new Preference();
				preference.setName(UserConstants.FAV_OUTLETS);
				preference.setValue(String.valueOf(mallId));
				likedPreferences.add(preference);
			}
			List<Preference> disLikedPreferences = new ArrayList<Preference>();
			for (Long mallId : newDisLikedOutlets) {
				Preference preference = new Preference();
				preference.setName(UserConstants.FAV_OUTLETS);
				preference.setValue(String.valueOf(mallId));
				disLikedPreferences.add(preference);
			}

			FavouritePreferences favouritePreferences = new FavouritePreferences();
			favouritePreferences.setDisLikedPreference(disLikedPreferences);
			favouritePreferences.setLikedPreference(likedPreferences);
//			clientFactory.getUserApi().updateFavourite(clientFactory.getUser().getId(), favouritePreferences,
//					new MethodCallback<Collection<Preference>>() {
//
//						@Override
//						public void onSuccess(Method method, Collection<Preference> response) {
//							User user = clientFactory.getUser();
//							user.setPreferences(response);
//							clientFactory.updateUser(user);
//						}
//
//						@Override
//						public void onFailure(Method method, Throwable exception) {
//						}
//					});
		}
	}
	
	private Collection<OutletWrapper> prepareOutlet(Collection<Outlet> response) {
		Collection<OutletWrapper> outletList = new ArrayList<OutletWrapper>();
		Collection<Long> likedOutletIds = new ArrayList<>();

		for (Preference preference : clientFactory.getUser().getPreferences()) {
			if (preference.getName().equalsIgnoreCase(UserConstants.FAV_OUTLETS)) {
				likedOutletIds.add(Long.valueOf(preference.getValue()));
			}
		}
		for (Outlet outlet : response) {
			OutletWrapper outletWrapper = new OutletWrapper();
			outletWrapper.setOutlet(outlet);
			if (likedOutletIds.contains(outlet.getId())) {
				outletWrapper.setLiked(true);
			}
			outletList.add(outletWrapper);
		}
		return outletList;
	}

	@Override
	public void onCellSelected(CellSelectedEvent event) {
		OutletListWidget  outletWidget = (OutletListWidget) event.getWidget();
		if(event.hasTouchElement("direction")){
			driveToOutlet(outletWidget.getOutlet());
			return;
		}
		if (event.hasTouchElement("star")) {
			likeDislikeOutlet(event);
			return;
		}
		//clientFactory.getPlaceController().goTo(new OutletDetailPlace(outletWidget.getOutlet().getId()));
	}
	
	protected void driveToOutlet(Outlet outlet) {
		double outletLatitude = outlet.getAddress().getLatitude();
		double outletLongitude = outlet.getAddress().getLongitude();
		Native.openExternalMap(outletLatitude, outletLongitude);
	}
	
	protected void likeDislikeOutlet(CellSelectedEvent event) {
		OutletListWidget outletListWidget = (OutletListWidget) event.getWidget();
		if (outletListWidget.getFavImage().getClassName().equalsIgnoreCase("liked")) {
			outletListWidget.getFavImage().setClassName("dislike");
			newDisLikedOutlets.add(((OutletWrapper) event.getItem()).getOutlet()
					.getId());
			newLikedOutlets.remove(((OutletWrapper) event.getItem()).getOutlet()
					.getId());
		} else {
			outletListWidget.getFavImage().setClassName("liked");
			newLikedOutlets.add(((OutletWrapper) event.getItem()).getOutlet()
					.getId());
			newDisLikedOutlets.remove(((OutletWrapper) event.getItem()).getOutlet()
					.getId());
		}

	}


}
