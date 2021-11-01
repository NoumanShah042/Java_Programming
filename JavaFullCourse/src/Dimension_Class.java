
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 

method	******  explanation
equals(Object o)	     checks whether the two dimension object are equal or not.
getHeight()	    returns the height of the dimension object
getWidth()	returns the width of the dimension object
getSize()	returns the size of dimension object.
hashCode()	returns the hashcode for dimension.
setSize(Dimension d)	set size of the object to specified dimension
setSize(double width, double height)	set the height and width to specified double value
setSize(int width, int height)	set the height and width to specified integer value

 */
public class Dimension_Class {
 
    public static void main(String[] args) {
        
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width =  (int)screenSize.getWidth();
        int height = (int) screenSize.getHeight();
         System.out.println(width);
         System.out.println(height);
                 
    }
}

// Java Program to show the functions 
// of dimension class(Integer precision) 
 
class dimen { 

    // output 
//    Dimension d and d1 are equal = false
//    Dimension d and d1 are equal = true
//    Hashcode of Dimension d = 1860
//    Dimesnion d Height = 30.0 Width= 30.0
//    Dimesnion d1 Height = 30.0 Width= 20.0
//    Dimesnion d2 Height = 30.0 Width= 20.0
    
	// Main Method 
	public static void main(String args[]) 
	{ 

		// create dimension 
		Dimension d = new Dimension(); 
		Dimension d1 = new Dimension(20, 30); 
		Dimension d2 = new Dimension(d1); 

		// set height and width of dimension d 
		d.setSize(30, 30); 

		// equating dimensions 
		System.out.println("Dimension d and d1 " + 
					"are equal = " + d.equals(d1)); 
					
		System.out.println("Dimension d and d1 " + 
				"are equal = " + d1.equals(d2)); 

		// print hashcode 
		System.out.println("Hashcode of Dimension " + 
							"d = " + d.hashCode()); 

		// display dimension 
		display(d, "Dimesnion d"); 
		display(d1, "Dimesnion d1"); 
		display(d2, "Dimesnion d2"); 
	} 

	// display dimension 
	public static void display(Dimension d, String s) 
	{ 
		System.out.println(s +" Height = " + d.getHeight() + 
								" Width= " + d.getWidth()); 
	} 
} 

