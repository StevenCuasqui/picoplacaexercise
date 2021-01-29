package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.stackbuilders.models.LicensePlate;
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

}
