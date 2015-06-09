package com.softdive.madpiggy.app.client.dealslisting;

import java.util.Collection;

import com.google.gwt.user.client.ui.IsWidget;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.widget.celllist.HasCellSelectedHandler;

public interface DealListView extends IsWidget {

	void setPresenter(Presenter presenter);

	void render(Collection<Advertisement> ads, int index);

	HasCellSelectedHandler getList();
	
	void onOrientationChange();
	
	Collection<Advertisement> getModel();
	
	int getLowestColumnHeight();
	
	Advertisement getLatestAdvertisement();
	
	void showFooter();
	
	void hideFooter();

	public static interface Presenter {
		void loadMore();
	}
}
