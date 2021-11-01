package Objects_and_Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class method_chaining {
    public static void main(String[] args) {
		
		// method chaining = 	a common syntax for invoking multiple method calls in OOP
		//						condense code into less lines
		
		String name = "      bro";
		
		//name = name.concat(" code   ");
		//name = name.toUpperCase();
		//name = name.trim();
		
		name = name.concat("code").toUpperCase().trim();
		
		System.out.println(name);
			
	}
}
