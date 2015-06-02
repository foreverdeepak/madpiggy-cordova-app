package com.softdive.madpiggy.app.client.model;

import com.softdive.madpiggy.app.client.model.UserProfile.ProfileType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class User extends Persistable {

	
	private long id;
	private String fname;
	private String lname;;
	private String primaryEmail;
	private String primaryMobileNumber;
	private Date dob;
	private String about;
	private Gender gender;
	private Address address;
	private String gcmId;
	private Collection<Preference> preferences;
	private Collection<RoleType> unverifiedRoles;
	private Collection<RoleType> verifiedRoles;
	private Collection<RoleType> licencedRoles;
	private Collection<RoleType> allRoles;
	private Collection<UserProfile> profiles;
	private UserProfile activeProfile;
	private int childrenCount;
	private String authToken;
	private boolean isNetworkJoined;
	private Boolean dealNotification;
	private Boolean campaignNotification;
	private String iosToken;
	
	
	public Boolean getDealNotification() {
		return dealNotification;
	}

	public void setDealNotification(Boolean dealNotification) {
		this.dealNotification = dealNotification;
	}

	public Boolean getCampaignNotification() {
		return campaignNotification;
	}

	public void setCampaignNotification(Boolean campaignNotification) {
		this.campaignNotification = campaignNotification;
	}

	public boolean isNetworkJoined() {
		return isNetworkJoined;
	}

	public void setNetworkJoined(boolean isNetworkJoined) {
		this.isNetworkJoined = isNetworkJoined;
	}

	private String fullName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPrimaryEmail() {
		if(primaryEmail == null) {
			Collection<UserProfile> profiles = this.getProfiles();
			if(profiles != null) {
				for (UserProfile userProfile : profiles) {
					if(userProfile.getProfileType() == ProfileType.EMAIL) {
						primaryEmail = userProfile.getProfileId();
					}
				}
			}
		}
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getPrimaryMobileNumber() {
		if(primaryMobileNumber == null) {
			Collection<UserProfile> profiles = this.getProfiles();
			if(profiles != null) {
				for (UserProfile userProfile : profiles) {
					if(userProfile.getProfileType() == ProfileType.MOBILE) {
						primaryMobileNumber = userProfile.getProfileId();
					}
				}
			}
		}
		return primaryMobileNumber;
	}

	public void setPrimaryMobileNumber(String primaryMobileNumber) {
		this.primaryMobileNumber = primaryMobileNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getGcmId() {
		return gcmId;
	}

	public void setGcmId(String gcmId) {
		this.gcmId = gcmId;
	}

	public Collection<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(Collection<Preference> preferences) {
		this.preferences = preferences;
	}

	public Collection<RoleType> getUnverifiedRoles() {
		if(unverifiedRoles == null || unverifiedRoles.size() == 0) {
			unverifiedRoles = new ArrayList<>();
			unverifiedRoles.add(RoleType.PUBLIC_USER);
		}
		return unverifiedRoles;
	}
	
	public void setUnverifiedRoles(Collection<RoleType> unverifiedRoles) {
		if(unverifiedRoles == null || unverifiedRoles.size() == 0) {
			unverifiedRoles = new ArrayList<>();
			unverifiedRoles.add(RoleType.PUBLIC_USER);
		}
		this.unverifiedRoles = unverifiedRoles;
	}


	public Collection<RoleType> getVerifiedRoles() {
		if(verifiedRoles == null || verifiedRoles.size() == 0) {
			verifiedRoles = new ArrayList<>();
			verifiedRoles.add(RoleType.PUBLIC_USER);
		}
		return verifiedRoles;
	}
	
	public void setVerifiedRoles(Collection<RoleType> verifiedRoles) {
		if(verifiedRoles == null || verifiedRoles.size() == 0) {
			verifiedRoles = new ArrayList<>();
			verifiedRoles.add(RoleType.PUBLIC_USER);
		}
		this.verifiedRoles = verifiedRoles;
	}
	
	public Collection<RoleType> getLicencedRoles() {
		return licencedRoles;
	}
	
	public void setLicencedRoles(Collection<RoleType> licencedRoles) {
		this.licencedRoles = licencedRoles;
	}
	
	public Collection<RoleType> getAllRoles() {
		if (allRoles != null) {
			return allRoles;
		}
		allRoles = new HashSet<RoleType>();
		allRoles.addAll(getVerifiedRoles());
		allRoles.addAll(getUnverifiedRoles());
		if(licencedRoles != null) {
			allRoles.addAll(licencedRoles);
		}
		
		if(allRoles.size() > 1) {
			allRoles.remove(RoleType.PUBLIC_USER);
		}
		return allRoles;
	}
	
	public void setAllRoles(Collection<RoleType> allRoles) {
		this.allRoles = allRoles;
	}
	
	public Collection<UserProfile> getProfiles() {
		return profiles;
	}

	public void setProfiles(Collection<UserProfile> profiles) {
		this.profiles = profiles;
	}

	public UserProfile getActiveProfile() {
		if(activeProfile == null && getProfiles() !=null && getProfiles().size() > 0) {
			activeProfile = getProfiles().iterator().next();
		}
		return activeProfile;
	}

	public void setActiveProfile(UserProfile activeProfile) {
		this.activeProfile = activeProfile;
	}

	public String getFullName() {
		if(fullName == null) {
			if(fname != null) {
				fullName = getFname() + ' ' + (getLname() != null ? getLname(): "");
			}
			if(fullName == null && getActiveProfile() != null) {
				fullName = getActiveProfile().getProfileId();
			}
		}
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public static enum Gender {
		MALE, FEMALE, COMPLICATED
	}
	
	public int getChildrenCount() {
		return childrenCount;
	}
	
	public void setChildrenCount(int childrenCount) {
		this.childrenCount = childrenCount;
	}
	
	public String getAuthToken() {
		return authToken;
	}
	
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gcmId == null) ? 0 : gcmId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (gcmId == null) {
			if (other.gcmId != null)
				return false;
		} else if (!gcmId.equals(other.gcmId))
			return false;
		return true;
	}

	public String getIosToken() {
		return iosToken;
	}

	public void setIosToken(String iosToken) {
		this.iosToken = iosToken;
	}
}
