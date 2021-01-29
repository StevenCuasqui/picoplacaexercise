package com.stackbuilders.models;

public class Time {
	private int hour;
	private int minutes;
	
	public Time() {
		super();
	}

	public Time(int hour, int minutes) {
		super();
		this.hour = hour;
		this.minutes = minutes;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return hour + ":" + minutes;
	}
	
	

}
