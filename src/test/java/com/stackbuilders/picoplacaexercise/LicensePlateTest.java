package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stackbuilders.models.LicensePlate;

public class LicensePlateTest 
{
	LicensePlate testLicensePlate;
	
	@Before
	public void setUp() throws Exception{
		testLicensePlate = new LicensePlate("AAA","1234");
	}
	
    @Test
    public void creationLettersTest(){
    	LicensePlate testPlate = new LicensePlate();
    	testPlate.setLetters("AAA");
        assertEquals(testLicensePlate.getLetters(), testPlate.getLetters());
    }
    
    @Test
    public void creationNumbersTest(){
    	LicensePlate testPlate = new LicensePlate();
    	testPlate.setNumbers("1234");
        assertEquals(testLicensePlate.getNumbers(), testPlate.getNumbers());
    }
}
