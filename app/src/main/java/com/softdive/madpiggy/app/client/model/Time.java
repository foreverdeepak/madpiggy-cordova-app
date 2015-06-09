package com.softdive.madpiggy.app.client.model;


public class Time {
	private int hours;
	private int minutes;
	private Meridiem meridiem;
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public Meridiem getMeridiem() {
		return meridiem;
	}

	public void setMeridiem(Meridiem meridiem) {
		this.meridiem = meridiem;
	}

	@Override
	public String toString() {
		if(meridiem == null) return null;
		StringBuilder builder = new StringBuilder();
		if(hours < 10) {
			builder.append("0");
		} 
		builder.append(hours);
		builder.append(":");
		
		if(minutes < 10) {
			builder.append("0");
		}
		builder.append(minutes);
		builder.append(" ");
		builder.append(meridiem.name());
		
		return builder.toString();
	}
	
	public static Time fromString(String str) {
		if(str == null) return null;
		Time time = new Time();
		time.hours = Integer.valueOf(str.substring(0, 2));
		time.minutes = Integer.valueOf(str.substring(3, 5));
		time.meridiem = Meridiem.valueOf(str.substring(6,8));
		
		return time;
	}
	
	public static enum Meridiem {
		AM, PM
	}
	
}
