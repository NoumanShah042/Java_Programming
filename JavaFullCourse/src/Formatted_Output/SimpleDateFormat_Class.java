/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formatted_Output;
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date;
/**
 *
 * @author Syed Nouman Rehman
 */
public class SimpleDateFormat_Class {
    
public static void main(String args[]) throws ParseException 
{ 
	// Formatting as per given pattern in the argument 
	SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy"); 
	String str = ft.format(new Date()); 
	System.out.println("Formatted Date : " + str); 

	// parsing a given String 
	str = "02/18/1995"; 
	ft = new SimpleDateFormat("MM/dd/yyyy"); 
	Date date = ft.parse(str); 

	// this will print the date as per parsed string 
	System.out.println("Parsed Date : " + date); 
} 


}
// Java program to demonstrate working of SimpleDateFormat 
 

 