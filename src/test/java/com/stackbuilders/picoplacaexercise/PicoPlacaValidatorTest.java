package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.stackbuilders.models.Date;
import com.stackbuilders.models.LicensePlate;
import com.stackbuilders.models.Schedule;
import com.stackbuilders.models.Time;
import com.stackbuilders.services.PicoPlacaValidator;

public class PicoPlacaValidatorTest {
	private PicoPlacaValidator validatorTest = new PicoPlacaValidator();
	
	
	@Test
	public void isTimeLessThanOtherTimeTest() {
		
		Time referenceTime = new Time(7,0);
		Time testTime = new Time(7,0);
		Time testTime2 = new Time(7,1);
		Time testTime3 = new Time(6,59);
		Time testTime4 = new Time(8,0);
		
		assertTrue(validatorTest.isTimeLessThanOtherTime(testTime, referenceTime));
		assertFalse(validatorTest.isTimeLessThanOtherTime(testTime2, referenceTime));
		assertTrue(validatorTest.isTimeLessThanOtherTime(testTime3, referenceTime));
		assertFalse(validatorTest.isTimeLessThanOtherTime(testTime4, referenceTime));
	
	}
	
	@Test
	public void isTimeInRestrictedPeriodTest() {
		
		Schedule testSchedule = new Schedule(new Time(7,0),new Time(9,30));
		Time testTime = new Time(7,0);
		Time testTime2 = new Time(7,1);
		Time testTime3 = new Time(9,30);
		Time testTime4 = new Time(9,31);
		Time testTime5 = new Time(9,29);
		Time testTime6 = new Time(6,59);
		Time testTime7 = new Time(8,30);
		
		assertTrue(validatorTest.isTimeInRestrictedPeriod(testSchedule, testTime));
		assertTrue(validatorTest.isTimeInRestrictedPeriod(testSchedule, testTime2));
		assertTrue(validatorTest.isTimeInRestrictedPeriod(testSchedule, testTime3));
		assertFalse(validatorTest.isTimeInRestrictedPeriod(testSchedule, testTime4));
		assertTrue(validatorTest.isTimeInRestrictedPeriod(testSchedule, testTime5));
		assertFalse(validatorTest.isTimeInRestrictedPeriod(testSchedule, testTime6));
		assertTrue(validatorTest.isTimeInRestrictedPeriod(testSchedule, testTime7));
	
	}
	
	@Test
	public void isRestrictedTimeTest() {
		Time testTime = new Time(7,0);
		Time testTime2 = new Time(6,59);
		Time testTime3 = new Time(7,1);
		
		Time testTime4 = new Time(9,30);
		Time testTime5 = new Time(9,29);
		Time testTime6 = new Time(9,31);
		
		Time testTime7 = new Time(16,0);
		Time testTime8 = new Time(15,59);
		Time testTime9 = new Time(16,1);
		
		Time testTime10 = new Time(19,30);
		Time testTime11 = new Time(19,29);
		Time testTime12 = new Time(19,31);
		
		assertTrue(validatorTest.isRestrictedTime(testTime));
		assertFalse(validatorTest.isRestrictedTime(testTime2));
		assertTrue(validatorTest.isRestrictedTime(testTime3));
		
		assertTrue(validatorTest.isRestrictedTime(testTime4));
		assertTrue(validatorTest.isRestrictedTime(testTime5));
		assertFalse(validatorTest.isRestrictedTime(testTime6));
		
		assertTrue(validatorTest.isRestrictedTime(testTime7));
		assertFalse(validatorTest.isRestrictedTime(testTime8));
		assertTrue(validatorTest.isRestrictedTime(testTime9));
		
		assertTrue(validatorTest.isRestrictedTime(testTime10));
		assertTrue(validatorTest.isRestrictedTime(testTime11));
		assertFalse(validatorTest.isRestrictedTime(testTime12));
	}
	
	@Test
	public void isRestrictedTest() {
		LicensePlate testLicensePlate = new LicensePlate("AAA","1234");
		Date testDate = new Date("Monday", new Time(8,0));
		Date testDate2 = new Date("Tuesday", new Time(8,0));
		Date testDate3 = new Date("Tuesday", new Time(9,31));
		
		Date testDate4 = new Date("Tuesday", new Time(16,0));
		Date testDate5 = new Date("Tuesday", new Time(19,31));
		
		assertFalse(validatorTest.isRestricted(testLicensePlate, testDate));
		assertTrue(validatorTest.isRestricted(testLicensePlate, testDate2));
		assertFalse(validatorTest.isRestricted(testLicensePlate, testDate3));
		assertTrue(validatorTest.isRestricted(testLicensePlate, testDate4));
		assertFalse(validatorTest.isRestricted(testLicensePlate, testDate5));
	}

}
