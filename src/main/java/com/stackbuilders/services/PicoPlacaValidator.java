package com.stackbuilders.services;

import java.util.ArrayList;

import com.stackbuilders.models.Date;
import com.stackbuilders.models.LicensePlate;
import com.stackbuilders.models.Rule;
import com.stackbuilders.models.Schedule;
import com.stackbuilders.models.Time;

public class PicoPlacaValidator {
	
	public ArrayList<Rule> picoPlacaRules = new ArrayList<Rule>();
	public ArrayList<Schedule> picoPlacaSchedule = new ArrayList<Schedule>();

	public PicoPlacaValidator() {
		super();
		/*
		 Rules established in 2018, 
		 according https://ecuadorec.com/cual-es-el-horario-de-pico-y-placa-en-quito/
		 */
		Schedule morningSchedule = new Schedule(new Time(7,0), new Time(9,30));
		Schedule afternoonSchedule = new Schedule(new Time(16,0), new Time(19,30));
		picoPlacaSchedule.add(morningSchedule);
		picoPlacaSchedule.add(afternoonSchedule);
		
		Rule mondayPicoPlaca = new Rule("Monday",new char[] {'1','2'});
		Rule tuesdayPicoPlaca = new Rule("Tuesday",new char[] {'3','4'});
		Rule wednesdayPicoPlaca = new Rule("Wednesday",new char[] {'5','6'});
		Rule thursdayPicoPlaca = new Rule("Thursday",new char[] {'7','8'});
		Rule fridayPicoPlaca = new Rule("Friday",new char[] {'9','0'});
		picoPlacaRules.add(mondayPicoPlaca);
		picoPlacaRules.add(tuesdayPicoPlaca);
		picoPlacaRules.add(wednesdayPicoPlaca);
		picoPlacaRules.add(thursdayPicoPlaca);
		picoPlacaRules.add(fridayPicoPlaca);
		
	}
	
	public boolean isRestricted(LicensePlate candidatePlate, Date checkingDate ) {
		if(isRestrictedTime(checkingDate.getTime())) {
			//Check Date and last Digit
			
			for(Rule rule:picoPlacaRules) {
				
				if(rule.getDay() == checkingDate.getDay()) {
					for(char digit:rule.getDigits()) {
						
						//Get last Digit of Plate
						String numbersOfPlate = candidatePlate.getNumbers();
						char lastDigit = numbersOfPlate.charAt(numbersOfPlate.length() - 1);
						if(digit == lastDigit) {
							return true;
						}
					}
				}

			}
		}
		System.out.println("It is not a period of restriction");
		return false;
	}
	
	public boolean isRestrictedTime(Time actualTime) {
		
		for(Schedule periodOfRestriction:picoPlacaSchedule) {
			if(isTimeInRestrictedPeriod(periodOfRestriction,actualTime)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isTimeInRestrictedPeriod(Schedule period,Time actualTime) {
		
		if(actualTime.getHour() == period.getStart().getHour()) {
			//If hour is equal than start hour

			if(actualTime.getMinutes() >= period.getStart().getMinutes()) {
				//If minutes are greater or equal
				//Check if is less than finishHour
				return isTimeLessThanOtherTime(actualTime,period.getFinish());
			}
			
			//Minutes less than minutesStartHour
			return false;
		}else if(actualTime.getHour() > period.getStart().getHour()) {
			//If hour is greater than start hour
			return isTimeLessThanOtherTime(actualTime,period.getFinish()); 
		}
		//If hour is less than startHour
		return false;
	}
	
	public boolean isTimeLessThanOtherTime(Time testTime, Time limitTime) {
		
		if(testTime.getHour() == limitTime.getHour()) {
			//If hours are equal
			//Check minutes
			if(testTime.getMinutes() <= limitTime.getMinutes()) {
				//if minutes are less than minutes limit
				return true;
			}
			//Minutes greater
			return false;
			
		}else if(testTime.getHour() < limitTime.getHour()) {
			//if hour is less than hour limit
			return true;
		}
		
		//Hour greater than hour limitTime
		return false;
		
	}


}
