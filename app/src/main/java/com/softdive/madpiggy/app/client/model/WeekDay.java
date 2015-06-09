package com.softdive.madpiggy.app.client.model;

import java.util.ArrayList;
import java.util.Collection;

public enum WeekDay {
	SUNDAY(1, "Sun"), MONDAY(2, "Mon"), TUESDAY(3, "Tue"), WEDNESDAY(4, "Wed"), THURSDAY(5, "Thu"), FRIDAY(6, "Fri"), SATURDAY(7, "Sat");
	
	private static WeekDay[] weekDays = WeekDay.values();
	
	int day;
	String dayname;
	
	private WeekDay(int day, String dayname) {
		this.day = day;
		this.dayname = dayname;
	}
	
	public static Collection<WeekDay> getApplicableDays(String applicableDays) {
		if(applicableDays == null) return null;
		Collection<WeekDay> wd = new ArrayList<WeekDay>();
		for (WeekDay weekDay : weekDays) {
			if(applicableDays.contains(weekDay.name())) {
				wd.add(weekDay);
			}
		}
		return wd;
	}
	
	public String getDayname() {
		return dayname;
	}

	public static String toString(Collection<WeekDay> weekDays) {
		if(weekDays == null) return null;
		StringBuilder builder = new StringBuilder();
		for (WeekDay weekDay : weekDays) {
			builder.append(weekDay.name());
		}
		return builder.toString();
	}
	
	public static WeekDay toWeekDay(int day) {
		return weekDays[day -1];
	}
}
