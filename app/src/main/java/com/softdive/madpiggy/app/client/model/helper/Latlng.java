package com.softdive.madpiggy.app.client.model.helper;

import com.ait.toolkit.gmaps.client.base.LatLng;

public class Latlng {

	private double lat;
	private double lng;
	private LatLng googleLatlng;

	public Latlng(double lat, double lng) {
		this.lat = lat;
		this.lng = lng;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public LatLng getGoogleLatlng() {
		if (googleLatlng == null) {
			googleLatlng = new LatLng(lat, lng);
		}
		return googleLatlng;
	}

}
