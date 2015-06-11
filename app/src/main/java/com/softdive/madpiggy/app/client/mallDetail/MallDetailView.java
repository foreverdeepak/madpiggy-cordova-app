package com.softdive.madpiggy.app.client.mallDetail;

import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent.ORIENTATION;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.softdive.madpiggy.app.client.AbstractPlace;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.UserActivity.Activity;
import com.softdive.madpiggy.app.client.widget.celllist.HasCellSelectedHandler;

public interface MallDetailView extends IsWidget {

	void setPresenter(Presenter presenter);

	void setMall(Mall mall);

	void onOrientationChange(ORIENTATION orientation);

	void clear();

	FlexPanel getParentContainer();
	
	HasCellSelectedHandler getList();
	
	public static interface Presenter {

		void goTo(AbstractPlace place);

		void earn(Activity activity, long addId);
		
	}

	Mall getMall();
}
