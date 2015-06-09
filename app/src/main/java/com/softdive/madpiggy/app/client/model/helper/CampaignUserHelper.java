package com.softdive.madpiggy.app.client.model.helper;

import java.util.ArrayList;
import java.util.Collection;

import com.softdive.madpiggy.app.client.model.User;

public class CampaignUserHelper {
	Collection<User> fbShareUser;
	Collection<User> gPlusShareUser;
	Collection<User> notifiedUser;
	Collection<User> participateUser;

	public Collection<User> getFbShareUser() {
		if (fbShareUser == null) {
			return new ArrayList<User>();
		}
		return fbShareUser;
	}

	public void setFbShareUser(Collection<User> fbShareUser) {
		this.fbShareUser = fbShareUser;
	}

	public Collection<User> getgPlusShareUser() {
		if (gPlusShareUser == null) {
			return new ArrayList<User>();
		}
		return gPlusShareUser;
	}

	public void setgPlusShareUser(Collection<User> gPlusShareUser) {
		this.gPlusShareUser = gPlusShareUser;
	}

	public Collection<User> getNotifiedUser() {
		if (notifiedUser == null) {
			return new ArrayList<User>();
		}
		return notifiedUser;
	}

	public void setNotifiedUser(Collection<User> notifiedUser) {
		this.notifiedUser = notifiedUser;
	}

	public Collection<User> getParticipateUser() {
		if (participateUser == null) {
			return new ArrayList<User>();
		}
		return participateUser;
	}

	public void setParticipateUser(Collection<User> participateUser) {
		this.participateUser = participateUser;
	}

}
