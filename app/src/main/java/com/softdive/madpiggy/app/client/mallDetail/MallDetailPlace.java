package com.softdive.madpiggy.app.client.mallDetail;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.softdive.madpiggy.app.client.AbstractPlace;
public class MallDetailPlace extends AbstractPlace {

	private long mallId;

	public MallDetailPlace(long mallId) {
		this.mallId = mallId;
	}

	public static class MallDetailPlaceTokenizer implements PlaceTokenizer<MallDetailPlace> {

		
		@Override
		public MallDetailPlace getPlace(String token) {
			return new MallDetailPlace(Long.valueOf(token));
		}

		@Override
		public String getToken(MallDetailPlace place) {
			return String.valueOf(place.getMallId());
		}

	}

	public long getMallId() {
		return mallId;
	}
}
