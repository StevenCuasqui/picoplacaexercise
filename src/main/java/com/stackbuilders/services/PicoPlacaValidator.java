package com.stackbuilders.services;

import java.util.ArrayList;

import com.stackbuilders.models.Rule;
import com.stackbuilders.models.Schedule;
import com.stackbuilders.models.Time;

public class PicoPlacaValidator {
	
	ArrayList<Rule> picoPlacaRules = new ArrayList<Rule>();
	ArrayList<Schedule> picoPlacaSchedule = new ArrayList<Schedule>();

	public PicoPlacaValidator() {
		super();
		/*
		 Rules established in 2018, 
		 according https://ecuadorec.com/cual-es-el-horario-de-pico-y-placa-en-quito/
		 */
		Schedule morningSchedule = new Schedule(new Time(7,0), new Time(9,30));
		Schedule afternoonSchedule = new Schedule(new Time(16,0), new Time(19,30));
		picoPlacaSchedule.add(morningSchedule);
		picoPlacaSchedule.add(afternoonSchedule);
		
		Rule mondayPicoPlaca = new Rule("Monday",new char[] {1,2});
		Rule tuesdayPicoPlaca = new Rule("Monday",new char[] {3,4});
		Rule wednesdayPicoPlaca = new Rule("Monday",new char[] {5,6});
		Rule thursdayPicoPlaca = new Rule("Monday",new char[] {7,8});
		Rule fridayPicoPlaca = new Rule("Monday",new char[] {9,0});
		picoPlacaRules.add(mondayPicoPlaca);
		picoPlacaRules.add(tuesdayPicoPlaca);
		picoPlacaRules.add(wednesdayPicoPlaca);
		picoPlacaRules.add(thursdayPicoPlaca);
		picoPlacaRules.add(fridayPicoPlaca);
		
	}


}
