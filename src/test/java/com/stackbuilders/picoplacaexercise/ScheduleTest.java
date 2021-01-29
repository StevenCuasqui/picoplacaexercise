package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stackbuilders.models.Schedule;
import com.stackbuilders.models.Time;

public class ScheduleTest 
{
	
	Schedule testSchedule;
	
	@Before
	public void setUp() throws Exception{
		testSchedule = new Schedule(new Time(7,0), new Time(23,30));
	}
	
    @Test
    public void creationStartTest(){
    	Time startTime = new Time(7,0);
    	Schedule testingSchedule = new Schedule();
    	testingSchedule.setStart(startTime);
        assertEquals(this.testSchedule.getStart().toString(), testingSchedule.getStart().toString());
    }
    
    @Test
    public void creationFinishTest(){
    	Time finishTime = new Time(23,30);
    	Schedule testingSchedule = new Schedule();
    	testingSchedule.setFinish(finishTime);
        assertEquals(this.testSchedule.getFinish().toString(), testingSchedule.getFinish().toString());
    }
}
