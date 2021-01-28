package com.stackbuilders.models;

public class Schedule {
	private Time start;
	private Time finish;
	
	public Schedule(Time start, Time finish) {
		super();
		this.start = start;
		this.finish = finish;
	}

	public Time getStart() {
		return start;
	}

	public void setStart(Time start) {
		this.start = start;
	}

	public Time getFinish() {
		return finish;
	}

	public void setFinish(Time finish) {
		this.finish = finish;
	}

	@Override
	public String toString() {
		return "[" + start + " - " + finish + "]";
	}
	
	

}
