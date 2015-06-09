package com.softdive.madpiggy.app.client.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.logging.Logger;

import com.google.gwt.user.client.Timer;
import com.softdive.madpiggy.app.client.model.AdDto;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.Outlet;
import com.softdive.madpiggy.app.client.model.helper.DealOutlet;
import com.softdive.madpiggy.app.client.model.helper.DealWrapper;

public class ListingDataStore {

	public static final Logger logger = Logger.getLogger(ListingDataStore.class.getName());

	public static final String DEAL_WRAPPER_KEY = "DEAL_WRAPPER_KEY";

	public static DealWrapper masterData = null;
	private static LinkedHashMap<Long, Mall> mallMap = new LinkedHashMap<Long, Mall>();
	private static LinkedHashMap<Long, Outlet> outletMap = new LinkedHashMap<Long, Outlet>();
	private static LinkedHashMap<Long, Collection<Outlet>> dealOutletMap = new LinkedHashMap<Long, Collection<Outlet>>();
	private static LinkedHashMap<Long, Collection<Advertisement>> outletDealMap = new LinkedHashMap<Long, Collection<Advertisement>>();
	private static LinkedHashMap<Long, Collection<Long>> mallOutletMap = new LinkedHashMap<Long, Collection<Long>>();
	private static LinkedHashMap<Long, AdDto> dealMap = new LinkedHashMap<Long, AdDto>();
	private static ArrayList<Outlet> outlets = new ArrayList<Outlet>();
	
	public static void saveList(DealWrapper wrapper) {
		masterData = wrapper;
		new Timer() {
			
			@Override
			public void run() {
				if (masterData != null) {
					prepareData();
				}
			}
		}.schedule(100);
	}
	
	private static void prepareData() {
		
		if (masterData.getAdDtos() != null) {
			for (AdDto ad : masterData.getAdDtos()) {
				dealMap.put(ad.getAdvertisement().getId(), ad);
			}
		}
		
		if (masterData.getMalls() != null) {
			for (Mall mall : masterData.getMalls()) {
				mallMap.put(mall.getId(), mall);
			}
		}
		
		if (masterData.getOutlets() != null) {
			for (Outlet o : masterData.getOutlets()) {
				outletMap.put(o.getId(), o);

				if (mallOutletMap.get(o.getMallId()) == null) {
					Collection<Long> ids = new ArrayList<Long>();
					ids.add(o.getId());
					mallOutletMap.put(o.getMallId(), ids);
				} else {
					mallOutletMap.get(o.getMallId()).add(o.getId());
				}
			}
		}
		
		if (masterData.getDealOutletMapping() != null) {
			for (DealOutlet dealOutlet : masterData.getDealOutletMapping()) {
				Outlet o = outletMap.get(dealOutlet.getOutletId());
				if (o != null) {
					if (dealOutletMap.get(dealOutlet.getDealId()) == null) {
						Collection<Outlet> os = new ArrayList<Outlet>();
						os.add(o);
						dealOutletMap.put(dealOutlet.getDealId(), os);
					} else {
						dealOutletMap.get(dealOutlet.getDealId()).add(o);
					}
				}
			}
		}
		
		if (masterData.getDealOutletMapping() != null) {
			for (DealOutlet dealOutlet : masterData.getDealOutletMapping()) {
				AdDto ad = dealMap.get(dealOutlet.getDealId());
				if (ad != null) {
					if (outletDealMap.get(dealOutlet.getOutletId()) == null) {
						Collection<Advertisement> deals = new ArrayList<Advertisement>();
						deals.add(ad.getAdvertisement());
						outletDealMap.put(dealOutlet.getOutletId(), deals);
					} else {
						outletDealMap.get(dealOutlet.getOutletId()).add(ad.getAdvertisement());
					}
				}
			}
		}
		
		if (masterData.getOutlets() != null) {
			outlets = new ArrayList<Outlet>(masterData.getOutlets());
		}
		
	}

	public static void clearStore() {
		masterData = null;
		mallMap.clear();
		outletMap.clear();
		dealOutletMap.clear();
		outletDealMap.clear();
		dealMap.clear();
		mallOutletMap.clear();
		outlets.clear();
	}

	public static DealWrapper getList() {
		return masterData;
	}

	public static Collection<Advertisement> getDealsByCategory(String category) {
		DealWrapper wrapper = getList();
		if (wrapper != null && wrapper.getAdvertisements() != null && wrapper.getAdvertisements().size() != 0) {
			Collection<Advertisement> ads = new ArrayList<Advertisement>();
			for (Advertisement a : getList().getAdvertisements()) {
				logger.fine(category + "-" + a.getCategory());
				if (a != null && a.getCategory().toLowerCase().equals(category.toLowerCase())) {
					ads.add(a);
				}
			}
			return ads;
		}

		return null;

	}

	public static Collection<Outlet> getOutletsByDealId(long dealId) {
		return dealOutletMap.get(dealId);
	}

	public static Collection<Mall> getMallsByOutletIds(Collection<Long> outletIds) {

		DealWrapper wrapper = getList();
		
		Collection<Mall> malls = new ArrayList<Mall>();
		for (Outlet o : wrapper.getOutlets()) {
			if (outletIds.contains(o.getId())) {
				Mall m = mallMap.get(o.getMallId());
				if (m != null && !malls.contains(m)) {
					malls.add(mallMap.get(o.getMallId()));
				}
			}
		}

		return malls;
	}

	public static Collection<Advertisement> getDealsByOutletId(long outletId) {
		return outletDealMap.get(outletId);
	}
	
	public static AdDto getDealByDealId(long adId) {
		return dealMap.get(adId);
	}

	public static Outlet getOutletbyId(long outletId) {
		return outletMap.get(outletId);
	}
	
	public static Mall getMallbyId(long mallId) {
		return mallMap.get(mallId);
	}
	
	public static Collection<Advertisement> getDealsByMallId(long mallId) {
		Collection<Long> outletIds = mallOutletMap.get(mallId);
		Set<Advertisement> advertisements = new HashSet<Advertisement>();
		
		for (Long outletId : outletIds) {
			Collection<Advertisement> ads = getDealsByOutletId(outletId);
			if (ads != null && ads.size() > 0) {
				advertisements.addAll(ads);
			}
		}
		return advertisements;
	}
	
	public static Collection<Outlet> getOutlets(int offset, int pageSize) {
		if (pageSize > outlets.size()) {
			pageSize = outlets.size();
		}
		try {
			return outlets.subList(offset, pageSize);
		} catch (Exception e) {
			return null;
		}
	}

}
