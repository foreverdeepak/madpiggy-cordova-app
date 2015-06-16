package com.softdive.madpiggy.app.client.detail.deal;

import java.util.Collection;

import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent.ORIENTATION;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.AbstractPlace;
import com.softdive.madpiggy.app.client.model.AdReview;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.UserActivity.Activity;
import com.softdive.madpiggy.app.client.widget.celllist.HasCellSelectedHandler;

public interface DealDetailView extends IsWidget {


	void setDeal(Advertisement advertisement);
	
	FlexPanel getParentContainer();

	public void render(Collection<AdReview> reviews, int index);
	
	public void clear();
	
	public HasCellSelectedHandler getList();

	public static interface Presenter {

		void goTo(AbstractPlace outletPlace);

		void earn(Activity activity, long addId);
		
	}
	void onOrientationChange(ORIENTATION orientation);

}

