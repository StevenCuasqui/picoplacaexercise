package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stackbuilders.models.Time;

public class TimeTest 
{
	Time timeTest;
	
	@Before
	public void setUp() throws Exception {
		timeTest = new Time(7,0);
	}
	
    @Test
    public void creationHourTest(){
    	Time testingTime = new Time();
    	testingTime.setHour(7);
        assertEquals(this.timeTest.getHour(),testingTime.getHour());
    }
    
    @Test
    public void creationMinuteTest(){
    	Time testingTime = new Time();
    	testingTime.setMinutes(0);
        assertEquals(this.timeTest.getMinutes(),testingTime.getMinutes());
    }
}
