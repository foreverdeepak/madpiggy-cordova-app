package com.softdive.madpiggy.app.client.jsinterop;

import com.google.gwt.user.client.Window;

public class Native {

	public static int getWindowWidth() {
		return Window.getClientWidth();
	}

	public static int getWindowHeight() {
		return Window.getClientHeight();
	}

	public static int getSmallestDimension() {
		if (getWindowHeight() < getWindowWidth()) {
			return getWindowHeight();
		}
		return getWindowWidth();
	}

	public static native String convertTo2decimalplaces(double distance) /*-{
		var num = distance;
		return num.toFixed(1) + "";
	}-*/;

	public static native void openExternalMap(double lat, double lng) /*-{
		$wnd.location.href = "maps://maps.apple.com/?q=" + lat + "," + lng;
	}-*/;
}
