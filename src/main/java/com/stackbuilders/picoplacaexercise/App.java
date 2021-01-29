package com.stackbuilders.picoplacaexercise;

import com.stackbuilders.controllers.DateController;
import com.stackbuilders.controllers.PlateController;

public class App 
{
    public static void main( String[] args ){
    	/*
    	1. Ask Plate
    	2. Ask Date
    	3. Show Rules
    	4. Show permission
    	*/
    	
        PlateController userPlate = new PlateController();
        userPlate.obtainUserPlate();
        
        System.out.println(userPlate.userLicensePlate);
        
        DateController userDate = new DateController();
        userDate.obtainDate();
        
        System.out.println(userDate.actualDate);
        
    	
    	
    }
    
    
}
