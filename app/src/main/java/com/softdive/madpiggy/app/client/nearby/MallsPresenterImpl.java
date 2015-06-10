package com.softdive.madpiggy.app.client.nearby;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import com.google.gwt.user.client.ui.Widget;
import com.softdive.madpiggy.app.client.App;
import com.softdive.madpiggy.app.client.ClientFactory;
import com.softdive.madpiggy.app.client.jsinterop.Native;
import com.softdive.madpiggy.app.client.malllist.MallList;
import com.softdive.madpiggy.app.client.malllist.MallWidget;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.Preference;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.helper.FavouritePreferences;
import com.softdive.madpiggy.app.client.model.helper.MallWrapper;
import com.softdive.madpiggy.app.client.storage.user.UserConstants;
import com.softdive.madpiggy.app.client.widget.NotFound;
import com.softdive.madpiggy.app.client.widget.celllist.CellSelectedEvent;
import com.softdive.madpiggy.app.client.widget.celllist.CellSelectedHandler;

/**
 * Created by deepakc on 10/06/15.
 */
public class MallsPresenterImpl implements NearbyView.MallsPresenter, CellSelectedHandler {
	
	public final Logger logger = Logger.getLogger(MallsPresenterImpl.class.getName());

    private ClientFactory clientFactory;
    private MallList mallListView;
    
    private List<Long> newLikedMalls;
	private List<Long> newDisLikedMalls;

    public MallsPresenterImpl(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
        newLikedMalls = new ArrayList<Long>();
		newDisLikedMalls = new ArrayList<Long>();
    }

    @Override
    public Widget getWidget() {
    	Collection<MallWrapper> malls = prepareMall(App.getListingDataStore().getList().getMalls());
    	
    	if (malls == null || malls.size() == 0) {
    		return new NotFound("wallet-giftcard", "Nothing in Malls",
					"Look Like we Don't Have Any Malls in your nearby area. Please change your location in Settings and try again");
    	}
    	
    	mallListView = new MallList();
    	mallListView.render(malls, 0);
    	
    	mallListView.getList().addCellSelectedHandler(this);
        return mallListView;
    }
    
    private Collection<MallWrapper> prepareMall(Collection<Mall> response) {
    	
    	if (response == null || response.size() == 0) {
    		return null;
    	}

		Collection<Long> likedMallIds = new ArrayList<>();

		for (Preference preference : clientFactory.getUser().getPreferences()) {
			if (preference.getName().equalsIgnoreCase(UserConstants.FAV_MALLS)) {
				likedMallIds.add(Long.valueOf(preference.getValue()));
			}
		}

		Collection<MallWrapper> malls = new ArrayList<>();
		for (Mall mall : response) {
			MallWrapper mallWrapper = new MallWrapper();
			mallWrapper.setMall(mall);
			if (likedMallIds.contains(mall.getId())) {
				logger.fine("MallID: " + mall.getId());
				mallWrapper.setLiked(true);
			}
			malls.add(mallWrapper);
		}
		return malls;
	}

	@Override
	public void onStop() {
		if (newLikedMalls != null) {
			final List<Preference> likedPreferences = new ArrayList<Preference>();
			for (Long mallId : newLikedMalls) {
				Preference preference = new Preference();
				preference.setName(UserConstants.FAV_MALLS);
				preference.setValue(String.valueOf(mallId));
				likedPreferences.add(preference);
			}
			List<Preference> disLikedPreferences = new ArrayList<Preference>();
			for (Long mallId : newDisLikedMalls) {
				Preference preference = new Preference();
				preference.setName(UserConstants.FAV_MALLS);
				preference.setValue(String.valueOf(mallId));
				disLikedPreferences.add(preference);
			}

			FavouritePreferences favouritePreferences = new FavouritePreferences();
			favouritePreferences.setDisLikedPreference(disLikedPreferences);
			favouritePreferences.setLikedPreference(likedPreferences);
			clientFactory.getUserApi().updateFavourite(clientFactory.getUser().getId(), favouritePreferences,
					new MethodCallback<Collection<Preference>>() {

						@Override
						public void onSuccess(Method method, Collection<Preference> response) {
							User user = clientFactory.getUser();
							user.setPreferences(response);
							clientFactory.updateUser(user);
						}

						@Override
						public void onFailure(Method method, Throwable exception) {

						}
					});
		}
	}

	@Override
	public void onCellSelected(CellSelectedEvent event) {

		if (event.hasTouchElement("direction")) {
			MallWidget mallWidget = (MallWidget) event.getWidget();
			driveToOutlet(mallWidget.getMallWrapper().getMall());
			return;
		}

		if (event.hasTouchElement("star")) {
			likeDislikeMall(event);
			return;
		}
	}
	
	private void driveToOutlet(Mall mall) {
		double lat = mall.getLatitude();
		double lng = mall.getLongitude();
		Native.openExternalMap(lat, lng);
	}
	
	protected void likeDislikeMall(CellSelectedEvent event) {
		MallWidget mallWidget = (MallWidget) event.getWidget();
		if (mallWidget.getFavImage().getClassName().equalsIgnoreCase("liked")) {
			mallWidget.getFavImage().setClassName("dislike");
			newDisLikedMalls.add(((MallWrapper) event.getItem()).getMall().getId());
			newLikedMalls.remove(((MallWrapper) event.getItem()).getMall().getId());
		} else {
			mallWidget.getFavImage().setClassName("liked");
			newLikedMalls.add(((MallWrapper) event.getItem()).getMall().getId());
			newDisLikedMalls.remove(((MallWrapper) event.getItem()).getMall().getId());
		}
	}
}
