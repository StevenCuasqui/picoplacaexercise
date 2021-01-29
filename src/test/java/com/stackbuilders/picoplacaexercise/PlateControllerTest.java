package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stackbuilders.controllers.PlateController;
import com.stackbuilders.models.LicensePlate;

public class PlateControllerTest{
	
	LicensePlate testPlate;
	PlateController testPlateController;
	
	@Before
	public void setUp() throws Exception{
		testPlate = new LicensePlate("AAA","1234");
	}
	
	@Test
	public void setLicensePlateTest() {
		PlateController testPlateController = new PlateController();
		LicensePlate testingPlate = testPlateController.obtainUserPlate();
		assertEquals(testPlate.toString(), testingPlate.toString());
	}
	
}
