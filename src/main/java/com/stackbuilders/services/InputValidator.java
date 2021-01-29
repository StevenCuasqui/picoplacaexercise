package com.stackbuilders.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.stackbuilders.models.Date;
import com.stackbuilders.models.LicensePlate;

public class InputValidator {
	private Pattern patternSection1;
	private Pattern patternSection2;
	private Matcher matcher1;
	private Matcher matcher2;
	
	public boolean plateValidation(LicensePlate testingPlate) {
		
		patternSection1 = Pattern.compile("^[A-Z]{3}$");
		patternSection2 = Pattern.compile("^\\d{3,4}$");
		
		matcher1 = patternSection1.matcher(testingPlate.getLetters());
		matcher2 = patternSection2.matcher(testingPlate.getNumbers());

		if(matcher1.find() && matcher2.find()) {
			return true;
		}
		return false;
	}
	
	public boolean dateValidation(Date testingDate) {
		return true;
	}
	

}
