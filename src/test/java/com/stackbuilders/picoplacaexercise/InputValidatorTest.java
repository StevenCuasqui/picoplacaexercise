package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.stackbuilders.models.Date;
import com.stackbuilders.models.LicensePlate;
import com.stackbuilders.models.Time;
import com.stackbuilders.services.InputValidator;

public class InputValidatorTest {
	private InputValidator validationTest = new InputValidator();
	
	@Test
	public void plateValidationTest() {
		LicensePlate testPlate1 = new LicensePlate("AAA","1234");
		LicensePlate testPlate2 = new LicensePlate("AAA","123");
		
		LicensePlate testPlate3 = new LicensePlate("AAAA","1234");
		LicensePlate testPlate4 = new LicensePlate("AA","1234");
		LicensePlate testPlate5 = new LicensePlate("AAA","12345");
		LicensePlate testPlate6 = new LicensePlate("AAA","12");
		LicensePlate testPlate7 = new LicensePlate("AAAAAA","123456");
				
		assertTrue(validationTest.plateValidation(testPlate1));
		assertTrue(validationTest.plateValidation(testPlate2));
		assertFalse(validationTest.plateValidation(testPlate3));
		assertFalse(validationTest.plateValidation(testPlate4));
		assertFalse(validationTest.plateValidation(testPlate5));
		assertFalse(validationTest.plateValidation(testPlate6));
		assertFalse(validationTest.plateValidation(testPlate7));
	}
	
	@Test
	public void dateValidationTest() {
	Date testDate1 = new Date("Monday", new Time(7,0));
	Date testDate2 = new Date("Tuesday", new Time(12,5));
	Date testDate3 = new Date("Wednesday", new Time(1,10));
	Date testDate4 = new Date("Thursday", new Time(5,0));
	Date testDate5 = new Date("Friday", new Time(23,59));
	Date testDate6 = new Date("Saturday", new Time(0,59));
	Date testDate7 = new Date("Sunday", new Time(23,0));
	
	Date testDate8 = new Date("Sundy", new Time(23,0));
	Date testDate9 = new Date("sunday", new Time(23,0));
	Date testDate10 = new Date("Sunday", new Time(24,0));
	Date testDate11 = new Date("Sunday", new Time(23,60));
	
	assertTrue(validationTest.dateValidation(testDate1));
	assertTrue(validationTest.dateValidation(testDate2));
	assertTrue(validationTest.dateValidation(testDate3));
	assertTrue(validationTest.dateValidation(testDate4));
	assertTrue(validationTest.dateValidation(testDate5));
	assertTrue(validationTest.dateValidation(testDate6));
	assertTrue(validationTest.dateValidation(testDate7));
	assertFalse(validationTest.dateValidation(testDate8));
	assertFalse(validationTest.dateValidation(testDate9));
	assertFalse(validationTest.dateValidation(testDate10));
	assertFalse(validationTest.dateValidation(testDate11));
	}

}
