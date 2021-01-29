package com.stackbuilders.controllers;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.stackbuilders.models.Date;
import com.stackbuilders.models.Time;
import com.stackbuilders.services.InputValidator;

public class DateController {
	public Date actualDate;
	
	public Date obtainDate() {
		boolean indicator = false;
		do {
			String[] response = loadDateView();
			
			if(response != null) {
				String day = response[0];
				int hour = Integer.parseInt( response[1]);
				int minute = Integer.parseInt(response[2]);
				
				actualDate = new Date(day,new Time(hour, minute));
				
				InputValidator date = new InputValidator();
				if(date.dateValidation(actualDate)) {
					System.out.println("Valid Date");
					indicator = true;
	            	return actualDate;
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Date");
				}
				
				
			}else {
				indicator = true;
	    		System.out.println("Date input cancelled");
			}
		}while(!indicator);
		
		return null;
	}
	
	private String[] loadDateView() {
		
		String[] data = null;
		
		String[] daysWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		String[] hoursDay = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",
				"17","18","19","20","21","22","23"};
		String[] minutesHour = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",
				"17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36",
				"37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56",
				"57","58","59"};
		
		JComboBox days = new JComboBox(daysWeek);
		JComboBox hours = new JComboBox(hoursDay);
		JComboBox minutes = new JComboBox(minutesHour);
		
		JPanel message = new JPanel();
		message.add(new JLabel("Date:\n"));
		message.add(days);
		message.add(new JLabel("Hour:\n"));
		message.add(hours);
		message.add(new JLabel("minute:\n"));
		message.add(minutes);
		
	    
	    
		int result = JOptionPane.showConfirmDialog(null, message, "Enter License Plate", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(result == JOptionPane.OK_OPTION) {
        	data = new String[]{days.getSelectedItem().toString(),hours.getSelectedItem().toString(),minutes.getSelectedItem().toString()};
        }
		return data;
	}
}
