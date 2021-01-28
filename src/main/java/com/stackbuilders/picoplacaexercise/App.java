package com.stackbuilders.picoplacaexercise;

import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        
        String placa = "";
        placa = JOptionPane.showInputDialog("Please enter your plate: ");
        System.out.println(placa);
    }
}
