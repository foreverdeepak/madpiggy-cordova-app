package com.softdive.madpiggy.app.client.model;

public class TimeRange {

	private Time startTime;
	private Time endTime;
	
	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return startTime.toString() + "-" + endTime.toString();
	}
	
	public static TimeRange fromString(String str) {
		if (str == null || str.trim().isEmpty()) return null;
		
		TimeRange range = new TimeRange();
		range.startTime = Time.fromString(str.substring(0, str.indexOf("-")));
		range.endTime = Time.fromString(str.substring(str.indexOf("-") +1));
		return range;
	}
}
