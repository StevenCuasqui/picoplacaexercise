package com.stackbuilders.picoplacaexercise;

import com.stackbuilders.controllers.PlateController;

public class App 
{
    public static void main( String[] args ){
    	
        PlateController userPlate = new PlateController();
        userPlate.obtainUserPlate();
        System.out.println(userPlate.userLicensePlate);
        
        
    	/*
    	1. Ask Plate
    	2. Ask Date
    	3. Show Rules
    	4. Show permission
    	*/
    	
    }
    
    
}
