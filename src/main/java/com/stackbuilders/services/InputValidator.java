package com.stackbuilders.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.stackbuilders.models.Date;
import com.stackbuilders.models.LicensePlate;

public class InputValidator {
	private Pattern patternSection;
	private Matcher matcher;
	
	public boolean plateValidation(LicensePlate testingPlate) {
		
		patternSection = Pattern.compile("^[A-Z]{3}$");
		matcher = patternSection.matcher(testingPlate.getLetters());
		
		if(matcher.find()) {
			
			patternSection = Pattern.compile("^\\d{3,4}$");
			matcher = patternSection.matcher(testingPlate.getNumbers());
			
			if(matcher.find()) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean dateValidation(Date testingDate) {
		
		patternSection = Pattern.compile("^(Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday)$");
		matcher = patternSection.matcher(testingDate.getDay());
		
		if(matcher.find()) {
			
			if((testingDate.getTime().getHour() >= 0) && (testingDate.getTime().getHour() <= 23 )) {
				if((testingDate.getTime().getMinutes() >= 0) && (testingDate.getTime().getMinutes() <= 59) ){
					return true;
				}
			
			}
			
		}
		return false;
	}
	

}
