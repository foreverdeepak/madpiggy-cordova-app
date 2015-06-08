package com.softdive.madpiggy.app.client.widget.viewpager;

import com.google.gwt.user.client.ui.Widget;

public interface ViewPagerAdapter {
	
	Widget getWidget(int index);

	int getItemCount();

	void onItemSelected(int index);
}
