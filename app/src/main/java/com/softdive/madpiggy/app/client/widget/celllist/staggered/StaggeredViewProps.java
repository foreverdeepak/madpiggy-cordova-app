package com.softdive.madpiggy.app.client.widget.celllist.staggered;

import java.util.logging.Logger;

import com.googlecode.mgwt.ui.client.MGWT;
import com.softdive.madpiggy.app.client.jsinterop.Native;

public final class StaggeredViewProps {
	
	private final static Logger logger = Logger.getLogger("StaggeredViewProps");
	
	public int windowWidth;
	public int windowHeight;
	public int columnCount;
	public int itemMargin;
	public int containerWidth;
	public int itemWidth;

	public StaggeredViewProps() {
		windowWidth = Native.getWindowWidth();
		windowHeight = Native.getWindowHeight();

		/*int screenWidth = Native.getWindowWidth();
		if (screenWidth <= 400) {
			columnCount = 2;
		} else if (screenWidth > 400 && screenWidth <= 800) {
			columnCount = 3;
		} else if (screenWidth > 800 && screenWidth <= 1000) {
			columnCount = 4;
		} else {
			columnCount = 5;
		}*/
		
		columnCount = getColumnCount();

		itemMargin = windowWidth / 100;
		itemMargin = 10;
		itemWidth = (windowWidth / columnCount) - 2 * itemMargin;
/*		if (itemMargin < 10) {
		} else {
			itemWidth = (windowWidth / columnCount) - 3 * itemMargin;
		}*/
		columnCount = windowWidth / itemWidth;
		containerWidth = ((itemWidth + itemMargin) * columnCount) - itemMargin;
	
		logger.info("windowWidth:" + windowWidth + " windowHeight:" + windowHeight + " columnCount:" + columnCount + " itemWidth:" + itemWidth);
		
	}
	
	private int getColumnCount() {
		int orientationFactor = 0;
		//if LANDSCAPE
		if (Native.getWindowWidth() > Native.getWindowHeight()) {
			orientationFactor = orientationFactor + 1;
		}
		if (MGWT.getFormFactor().isPhone()) {
			return 2 + orientationFactor;
		}
		if (MGWT.getFormFactor().isTablet()) {
			return 3 + orientationFactor;
		}
		if (MGWT.getFormFactor().isDesktop()) {
			if (orientationFactor > 0) {
				orientationFactor ++;
			}
			return 3 + orientationFactor;
		}
		return 0;
	}
}
