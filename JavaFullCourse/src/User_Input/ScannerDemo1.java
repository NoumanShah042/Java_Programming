/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Input;

 
// Java program to read data of various types using Scanner class. 
import java.util.Scanner; 
public class ScannerDemo1 
{ 
	public static void main(String[] args) 
	{ 
		// Declare the object and initialize with 
		// predefined standard input object 
		Scanner sc = new Scanner(System.in); 

		// String input 
		String name = sc.nextLine(); 

		// Character input 
		char gender = sc.next().charAt(0); 

		// Numerical data input 
		// byte, short and float can be read 
		// using similar-named functions. 
		int age = sc.nextInt(); 
		long mobileNo = sc.nextLong(); 
		double cgpa = sc.nextDouble(); 

		// Print the values to check if the input was correctly obtained. 
		System.out.println("Name: "+name); 
		System.out.println("Gender: "+gender); 
		System.out.println("Age: "+age); 
		System.out.println("Mobile Number: "+mobileNo); 
		System.out.println("CGPA: "+cgpa); 
	} 
} 
/*


Input :

Geek
F
40
9876543210
9.9


Output :

Name: Geek
Gender: F
Age: 40
Mobile Number: 9876543210
CGPA: 9.9

*/