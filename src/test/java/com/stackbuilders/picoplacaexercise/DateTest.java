package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stackbuilders.models.Date;
import com.stackbuilders.models.Time;

public class DateTest {
	
	Date testDate;
	
	@Before
	public void setUp() throws Exception{
		testDate = new Date("Monday", new Time(7,0));
	}
	
	@Test
	public void creationDayDate() {
		Date testingDate = new Date();
		testingDate.setDay("Monday");
		assertEquals(testDate.getDay(),testingDate.getDay());
	}
	
	@Test
	public void creationTimeDate() {
		Date testingDate = new Date();
		testingDate.setTime(new Time(7,0));
		assertEquals(testDate.getTime().toString(), testingDate.getTime().toString());
	}

}
