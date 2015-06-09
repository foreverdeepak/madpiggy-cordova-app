package com.softdive.madpiggy.app.client.dealslisting;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.softdive.madpiggy.app.client.AbstractPlace;

public class DealListPlace extends AbstractPlace {

	private DealType dealType;

	public DealListPlace(DealType dealType) {
		this.dealType = dealType;
	}

	public DealType getDealType() {
		return dealType;
	}

	public void setDealType(DealType dealType) {
		this.dealType = dealType;
	}

	public static class DealListTokenizer implements PlaceTokenizer<DealListPlace> {

        @Override
        public DealListPlace getPlace(String token) {
            return new DealListPlace(DealType.getType(token));
        }

        @Override
        public String getToken(DealListPlace place) {
            return place.getDealType().getToken();
        }
    }

	public enum DealType {
		EDEAL("EDEAL"), INSTORE("INSTORE"), SEARCH("SEARCH");

		DealType(String token) {
			this.token = token;
		}

		private String token;

		public String getToken() {
			return token;
		}

		public static DealType getType(String token) {
			for (DealType type : DealType.values()) {
				if (type.getToken().equals(token)) {
					return type;
				}
			}
			return INSTORE;
		}

	}

}
