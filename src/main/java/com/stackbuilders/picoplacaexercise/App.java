package com.stackbuilders.picoplacaexercise;

import javax.swing.JOptionPane;

import com.stackbuilders.controllers.DateController;
import com.stackbuilders.controllers.PlateController;
import com.stackbuilders.models.Date;
import com.stackbuilders.models.LicensePlate;
import com.stackbuilders.services.PicoPlacaValidator;

public class App 
{
    public static void main( String[] args ){
    	
    	/*
    	1. Ask Plate
    	2. Ask Date
    	3. Show Rules
    	4. Show permission
    	*/
    	 int indicator= 0;       
        
        do {
        	PlateController userPlate = new PlateController();
            LicensePlate plate = userPlate.obtainUserPlate();
            
            
            String message = "No inputs";
            
            if(plate != null) {
            	DateController userDate = new DateController();
                Date date = userDate.obtainDate();
                PicoPlacaValidator picoPlacaCheck = new PicoPlacaValidator();
                
                if(date!=null) {
                	if(picoPlacaCheck.isRestricted(plate, date)) {
                    	message = "Car with RESTRICTION!";
                    }else {
                    	message = "Car with out problem";
                    }	
                }else {
                	message = "No date provided";
                }
                
            }else {
            	message = "No license plate entered";
            }

            JOptionPane.showMessageDialog(null, message);
            
            indicator = JOptionPane.showConfirmDialog(null, "Check other License Plate?");
        }while(indicator == 0);
    	
    }   
    
}
