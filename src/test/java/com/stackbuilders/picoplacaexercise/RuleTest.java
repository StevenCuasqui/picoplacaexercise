package com.stackbuilders.picoplacaexercise;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.stackbuilders.models.Rule;

public class RuleTest 
{
	Rule ruleTest;
	@Before
	public void setUp() throws Exception{
		ruleTest = new Rule("Monday",new char[] {'1','2'});
	}
	
    @Test
    public void creationDayTest(){
    	Rule ruleTest = new Rule();
    	ruleTest.setDay("Monday");
        assertEquals(this.ruleTest.getDay(), ruleTest.getDay());
    }
    
    @Test
    public void creationDigitsTest(){
    	char[] digits = new char[] {'1','2'};
    	Rule ruleTest = new Rule();
    	ruleTest.setDigits(digits);
        assertArrayEquals(this.ruleTest.getDigits(), ruleTest.getDigits());
    }
}
