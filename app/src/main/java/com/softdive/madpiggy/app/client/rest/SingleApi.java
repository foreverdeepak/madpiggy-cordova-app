package com.softdive.madpiggy.app.client.rest;

import java.util.Collection;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.Options;
import org.fusesource.restygwt.client.RestService;

import com.softdive.madpiggy.app.client.global.AppConstant;
import com.softdive.madpiggy.app.client.model.AdReview;
import com.softdive.madpiggy.app.client.model.Advertisement;
import com.softdive.madpiggy.app.client.model.Feedback;
import com.softdive.madpiggy.app.client.model.Kingdom;
import com.softdive.madpiggy.app.client.model.Mall;
import com.softdive.madpiggy.app.client.model.Notification;
import com.softdive.madpiggy.app.client.model.Outlet;
import com.softdive.madpiggy.app.client.model.OutletDealsWrapper;
import com.softdive.madpiggy.app.client.model.Preference;
import com.softdive.madpiggy.app.client.model.User;
import com.softdive.madpiggy.app.client.model.UserActivity;
import com.softdive.madpiggy.app.client.model.UserBadgeInfo;
import com.softdive.madpiggy.app.client.model.UserCheckInWrapper;
import com.softdive.madpiggy.app.client.model.UserProfile.ProfileType;
import com.softdive.madpiggy.app.client.model.UserVoucher;
import com.softdive.madpiggy.app.client.model.UserWallet;
import com.softdive.madpiggy.app.client.model.Voucher;
import com.softdive.madpiggy.app.client.model.helper.AdCriteria;
import com.softdive.madpiggy.app.client.model.helper.CouponCriteria;
import com.softdive.madpiggy.app.client.model.helper.CouponWrapper;
import com.softdive.madpiggy.app.client.model.helper.DealWrapper;
import com.softdive.madpiggy.app.client.model.helper.FavouritePreferences;
import com.softdive.madpiggy.app.client.model.helper.MallCriteria;
import com.softdive.madpiggy.app.client.model.helper.OutletCriteria;
import com.softdive.madpiggy.app.client.model.helper.PurchaseRecord;
import com.softdive.madpiggy.app.client.model.helper.UserActivityCriteria;
import com.softdive.madpiggy.app.client.model.helper.UserVo;
import com.softdive.madpiggy.app.client.model.helper.VoucherCriteria;

@Path(AppConstant.MP_WS_URL)
@Options(dispatcher=MadpiggyRestIntercepter.class)
public interface SingleApi extends RestService {

	@GET
	@Path("/ad/{id}")
	public void getAdById(@PathParam("id") long id, MethodCallback<Advertisement> callback);

	@POST
	@Path("/ad")
	public void getAdsByCriteria(AdCriteria adCriteria, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize,
			MethodCallback<Collection<Advertisement>> callback);

	@GET
	@Path("/ad/{id}/review")
	public void getAdReviews(@PathParam("id") long adId, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize,
			MethodCallback<Collection<AdReview>> callback);

	@POST
	@Path("/u/{userId}/pv")
	void purchaseVouchers(@PathParam("userId") long userId, Collection<PurchaseRecord> purchaseRecords,
			MethodCallback<Collection<PurchaseRecord>> callback);

	@GET
	@Path("/u/{userId}/voucher")
	public void getUserVouchers(@PathParam("userId") long userId, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize,
			MethodCallback<Collection<UserVoucher>> callback);

	@POST
	@Path("/v")
	public void getVouchersByCriteria(VoucherCriteria voucherCriteria, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize,
			MethodCallback<Collection<Voucher>> callback);

	@GET
	@Path("/v/{voucherId}")
	public void getVoucherById(@PathParam("voucherId") long voucherId, MethodCallback<Voucher> callback);

	@GET
	@Path("/u/{userId}/getUserLikes")
	public void getAdByUserLike(@PathParam("userId") long userId, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize,
			MethodCallback<Collection<Advertisement>> callback);

	@GET
	@Path("/k/{userId}/gubi")
	public void getUserBadgeInfo(@PathParam("userId") long userId, MethodCallback<UserBadgeInfo> callback);

	@GET
	@Path("/u/{userId}/totalPoints")
	public void getUserPoints(@PathParam("userId") long userId, MethodCallback<Long> callback);

	@GET
	@Path("/u/{userId}")
	public void getUserByUserId(@PathParam("userId") long userId, MethodCallback<User> callback);

	@GET
	@Path("/u/{userId}/wallets")
	public void getWalletsByUserId(@PathParam("userId") long userId, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize,
			MethodCallback<Collection<UserWallet>> callback);

	@GET
	@Path("/u/{userId}/adNotifications")
	public void getUserNotifications(@PathParam("userId") long userId, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize,
			MethodCallback<Notification> callback);

	@GET
	@Path("/ad/tagWithPageSize")
	public void getAdTags(@QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize, MethodCallback<Collection<String>> callback);

	@POST
	@Path("/o")
	public void getOutletsByCriteria(OutletCriteria outletCriteria, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize,
			MethodCallback<Collection<Outlet>> callback);

	@POST
	@Path("/u/{userId}/{notificationId}/markRead")
	public void markNotificationRead(@PathParam("userId") long userId, @PathParam("notificationId") long notificationId, MethodCallback<Void> callback);

	@PUT
	@Path("/ad/{id}/review")
	public void createReview(@PathParam("id") long adId, AdReview adReview, MethodCallback<Void> callback);

	@POST
	@Path("/u/{userId}/push")
	public void pushUserActivity(@PathParam("userId") long userId, UserActivity activity, MethodCallback<UserWallet> callback);

	@POST
	@Path("/otp/{mobileNumber}")
	public void sendOtp(@PathParam("mobileNumber") String mobileNumber, MethodCallback<String> callback);

	@POST
	@Path("/usr/{username}")
	public void validateUser(@PathParam("username") String username, @FormParam("password") String password,
			@FormParam("profileType") ProfileType profileType, @HeaderParam("deviceId") String deviceId, MethodCallback<User> methodCallback);

	@POST
	@Path("/ugoc")
	public void getOrCreateUser(UserVo userVo, MethodCallback<User> callback);

	@PUT
	@Path("/f")
	public void submitFeedBack(Feedback feedback, MethodCallback<Void> callback);
	
	@POST
	@Path("/u/ua")
	public void getActivities(UserActivityCriteria criteria, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize, MethodCallback<Collection<UserActivity>> callback);
	
	@POST
	@Path("/u/{userId}")
	void updateUser(@PathParam("userId") long userId, User user, MethodCallback<Void> callback);
	
	@POST
	@Path("k/isun")
	void isUserNotificationExists(@QueryParam("userId") long userId,@QueryParam("adId") long adId, MethodCallback<Boolean> callback);
	
	@GET
	@Path("/ad/adsByMallId")
	void getAdsByMallId(@QueryParam("mallId") long mallId, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize, MethodCallback<Collection<Advertisement>> callback);

	@POST
	@Path("/cpn/gcbc")
	void getCouponByCriteria(CouponCriteria couponCriteria, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize, MethodCallback<Collection<CouponWrapper>> callback);
	
	@POST
	@Path("/u/gmbc")
	void getMallByCriteria(MallCriteria mallCriteria, @QueryParam("offset")int offset, @QueryParam("pageSize")int pageSize, MethodCallback<Collection<Mall>> callback);

	@POST
	@Path("/u/userCheckInHistory/{userId}")
	void getUserCheckInHistory(@PathParam("userId")long userId, MethodCallback<Collection<UserCheckInWrapper>> callback);
	
	@POST
	@Path("/m/ad")
	void getAdDealWrapperByCriteria(AdCriteria adCriteria, @QueryParam("offset") int offset, @QueryParam("pageSize") int pageSize, MethodCallback<DealWrapper> callback);


	@POST
	@Path("/u/{userId}/updatePref")
	public void updateFavourite(@PathParam("userId")long userId, FavouritePreferences preference, MethodCallback<Collection<Preference>> callback);

	@GET
	@Path("/k/{userId}")
	public void fetchMyKingdom(@PathParam("userId") long userId, MethodCallback<Kingdom> kingdomCallback);
	
	@GET
	@Path("/ad/o/{outletId}")
	public void getOutletDealsWrapper(@PathParam("outletId") long outletId, MethodCallback<OutletDealsWrapper> callback);
}
