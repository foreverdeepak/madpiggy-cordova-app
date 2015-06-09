package com.softdive.madpiggy.app.client.util;

import org.fusesource.restygwt.client.JsonEncoderDecoder;

import com.google.gwt.core.client.GWT;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Kingdom;
import com.softdive.madpiggy.app.client.model.helper.DealListCriteria;
import com.softdive.madpiggy.app.client.model.helper.DealWrapper;
import com.softdive.madpiggy.app.client.model.helper.PreferenceWrapper;

public interface JSONEncoderDecoder {
	
	public static final AdvertisementJSONEncoderDecoder ADVERTISEMENT_ENCODER_DECODER = GWT.create(AdvertisementJSONEncoderDecoder.class);
	public static final DealListCriteriaJSONEncoderDecoder DEAL_LIST_CRITERIA_ENCODER_DECODER = GWT.create(DealListCriteriaJSONEncoderDecoder.class);
	public static final KingdomJSONEncoderDecoder KINGDOM_ENCODER_DECODER = GWT.create(KingdomJSONEncoderDecoder.class);
	public static final PreferenceEncoderDecoder PREFERENCE_ENCODER_DECODER = GWT.create(PreferenceEncoderDecoder.class);
	public static final DealWrapperEncoderDecoder DEAL_WRAPPER_ENCODER_DECODER = GWT.create(DealWrapperEncoderDecoder.class);
	
	interface AdvertisementJSONEncoderDecoder extends JsonEncoderDecoder<Advertisement> {}
	
	interface DealListCriteriaJSONEncoderDecoder extends JsonEncoderDecoder<DealListCriteria> {}
	
	interface KingdomJSONEncoderDecoder extends JsonEncoderDecoder<Kingdom>{}
	
	interface PreferenceEncoderDecoder extends JsonEncoderDecoder<PreferenceWrapper>{}
	
	interface DealWrapperEncoderDecoder extends JsonEncoderDecoder<DealWrapper>{}

}
