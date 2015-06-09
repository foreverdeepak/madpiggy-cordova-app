package com.softdive.madpiggy.app.client.global;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public interface GlobalResources extends ClientBundle {

	GlobalResources INSTANCE = GWT.create(GlobalResources.class);

	@Source("invite_friends_kingdom.png")
	@ImageOptions(preventInlining=true)
	public ImageResource inviteFriends();

	@Source("king_blue.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getKingdomHeader();

	@Source("kingdom.png")
	@ImageOptions(preventInlining=true)
	public ImageResource viewKingdom();

	@Source("choose_your_parent.png")
	@ImageOptions(preventInlining=true)
	public ImageResource joinKingom();

	@Source("right.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getRightImage();

	@Source("user.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource getUserImage();

	@Source("map.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource getMap();

	@Source("call_new.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getCallButton();

	@Source("chat_new.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getChatButton();

	@Source("like_new.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getLikeButton();

	@Source("cart.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getBuyButton();

	@Source("get_direction.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getDirection();

	@Source("edit.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getEditImage();

	@Source("right.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getRightIcon();

	@Source("BRONZE.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getBronzeBadge();

	@Source("GOLD.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getGoldBadge();

	@Source("SILVER.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getSilverBadge();

	@Source("PLATINUM.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getPlatinumBadge();

	@Source("fb_ic.png")
	public ImageResource getFBImage();

	@Source("PLATINUM.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getTestImage();

	@Source("ic_drawer.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getDrawer();

	@Source("mp_location.png")
	@ImageOptions(preventInlining=true)
	public ImageResource mapLocation();

	@Source("find_deal.png")
	@ImageOptions(preventInlining=true)
	public ImageResource Findeal();

	@Source("earn_reward.png")
	@ImageOptions(preventInlining=true)
	public ImageResource earnReward();

	@Source("earn_reward.png")
	@ImageOptions(preventInlining=true)
	public ImageResource searchWhatYouWant();

	@Source("kingdom.png")
	@ImageOptions(preventInlining=true)
	public ImageResource kingdom();

	@Source("dr.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource getDebit();

	@Source("cr.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource getCredit();

	@Source("new_blur.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getBgImage();

	@Source("mp_location.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getLocationImage();

	@Source("loading.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource getLoadingImage();

	@Source("search_what_u_like.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getSearchImage();

	@Source("kingdom.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getGoogle();

	@Source("loading.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource getMobile();
	
	@Source("piggy_points_small.png")
	@ImageOptions(preventInlining=true)
	public ImageResource getPiggyPointsImage();
	
	@Source("view_kingdom.png")
	@ImageOptions(preventInlining=true)
	public ImageResource viewFriends();
	
	@Source("fbimg.png")
	@ImageOptions(preventInlining=true)
	public ImageResource fbImage();
	
	@Source("taketour_1.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource takeTour1();

	@Source("taketour_2.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource takeTour2();

	@Source("taketour_3.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource takeTour3();

	@Source("taketour_4.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource takeTour4();

	@Source("taketour_5.jpg")
	@ImageOptions(preventInlining=true)
	public ImageResource takeTour5();
	
	@Source("320-new.jpg")
	public ImageResource homeScreenIphone4();
	
	@Source("768-1024.jpg")
	public ImageResource homeScreenIpad();
	
	@Source("madpiggy-logo.png")
	public ImageResource homeLogo();
	
	@Source("exclusive.png")
	public ImageResource exclusiveImage();

	
}