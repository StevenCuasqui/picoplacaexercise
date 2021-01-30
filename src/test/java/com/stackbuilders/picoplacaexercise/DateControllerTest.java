package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stackbuilders.controllers.DateController;
import com.stackbuilders.models.Date;
import com.stackbuilders.models.Time;

public class DateControllerTest {
	
	Date testDate;
	DateController testDateController;
	
	@Before
	public void setUp() throws Exception{
		testDate = new Date("Monday",new Time(7,0));
	}
	
	
	@Test
	public void setDateTest() {
		DateController testingDateController = new DateController();
		System.out.println("Try entering this date: Monday - 7:0");
		Date testingDate = testingDateController.obtainDate();
		assertEquals(testDate.toString(),testingDate.toString());
		
	}

}
