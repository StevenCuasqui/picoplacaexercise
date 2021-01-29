package com.stackbuilders.models;

import java.util.Arrays;

public class Rule {
	private String day;
	private char[] digits;
	
	public Rule() {
		super();
	}

	public Rule(String day, char[] digits) {
		super();
		this.day = day;
		this.digits = digits;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public char[] getDigits() {
		return digits;
	}

	public void setDigits(char[] digits) {
		this.digits = digits;
	}

	@Override
	public String toString() {
		return " [" + day + ", (" + Arrays.toString(digits) + ")]";
	}
	
	

}
