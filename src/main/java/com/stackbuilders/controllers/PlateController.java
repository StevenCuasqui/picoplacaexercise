package com.stackbuilders.controllers;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.stackbuilders.models.LicensePlate;

public class PlateController {
	
	public LicensePlate userLicensePlate;
	
	public LicensePlate obtainUserPlate() {
		
		//Response obtained from Panel- null or data
    	String[] response = loadPlateView();
    	
    	if(response != null) {
    		
    		String sPlate1 = response[0];
            String sPlate2 = response[1];
            userLicensePlate = new LicensePlate();
            userLicensePlate.setLetters(sPlate1);
            userLicensePlate.setNumbers(sPlate2);
            return userLicensePlate;
    	}else {
    		System.out.println("Se ha cancelado");
    	}
		return userLicensePlate;
    }
	
	private String[] loadPlateView() {
		
		String[] data = null;
		
		JTextField plateSection1 = new JTextField(3);
    	JTextField plateSection2 = new JTextField(4);
    	
    	JPanel message = new JPanel();
    	message.add(new JLabel("License Plate:"));
    	message.add(plateSection1);
        message.add(new JLabel(" - "));
        message.add(plateSection2);
        
        int result = JOptionPane.showConfirmDialog(null, message, "Enter License Plate", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		
        if(result == JOptionPane.OK_OPTION) {
        	data = new String[]{plateSection1.getText(),plateSection2.getText()};
        }
        
		return data;
	}

}
