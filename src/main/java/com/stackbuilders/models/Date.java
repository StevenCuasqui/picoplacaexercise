package com.stackbuilders.models;

public class Date {
	private String day;
	private Time time;
	
	public Date() {
		super();
	}
	
	public Date(String day, Time time) {
		super();
		this.day = day;
		this.time = time;
	}

	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Day=" + day + "/ Time=" + time;
	}
	
	

}
