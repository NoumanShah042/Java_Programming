package P01_basicJava;

import java.util.Scanner;

public class JP_04_If_else {

	/*******************************
	 * Lecture:-8
	 * if & else Statement
	 * @throws Exception 
	 ********************************/
public static void main(String[] args) throws Exception {
	int time;	
	int a = 5;
	int b = 10;
	int c = 5;
	
	if (a==b) {
		System.out.println("a equal to b");
	
	}else if(a!=c){
		System.out.println("a is not equal to c ");
	}else {
		System.out.println(" a is not equal to b and equal to c");
		//throw new Exception("Error: a is not equal to b and equal to c");
	}
			
	/*
	 * some important operators 
	 * 1) = = -->Equal to 
	 * 2) ! = -->not equal to
	 * 3) > = --> greater than or equal
	 * 4) < = --> less than or equal to
	 * 5) < ----> less than
	 * 6) > ----> greater than
	 */

 //Another style of If and else
 // Syntax:-variable = (condition) ? expressionTrue :  expressionFalse;
	time = 20;
	if (time < 18) {
	  System.out.println("Good day.");
	} else {
	  System.out.println("Good evening.");
	}

	//You can simply write:

	time = 20;
	String result = (time < 18) ? "Good day." : "Good evening.";
	System.out.println(result);

	


}

}
