/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Input;
/*

Sometimes, we have to check if the next value we read is of a certain type or if the input
has ended (EOF marker encountered).

Then, we check if the scanner’s input is of the type we want with the help
of hasNextXYZ() functions where XYZ is the type we are interested in.
The function returns true if the scanner has a token of that type, otherwise false.
For example, in the below code, we have used hasNextInt(). To check for a string,
we use hasNextLine(). Similarly, to check for a single character, we use hasNext().charAt(0).

Let us look at the code snippet to read some numbers from console and print their mean.

*/



// Java program to read some values using Scanner 
// class and print their mean. 
import java.util.Scanner; 

public class ScannerDemo2 
{ 
	public static void main(String[] args) 
	{ 
		// Declare an object and initialize with 
		// predefined standard input object 
		Scanner sc = new Scanner(System.in); 

		// Initialize sum and count of input elements 
		int sum = 0, count = 0; 

		// Check if an int value is available 
		while (sc.hasNextInt()) 
		{ 
			// Read an int value 
			int num = sc.nextInt(); 
			sum += num; 
			count++; 
		} 
		int mean = sum / count; 
		System.out.println("Mean: " + mean); 
	} 
} 
