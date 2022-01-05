 
package DataTypes;

/*

A binary literal is a number that is represented in 0s and 1s (binary digits).
Java allows you to express integral types (byte, short, int, and long) in a binary number system. 
To specify a binary literal, add the prefix 0b or 0B to the integral value(any one 0B or 0b) .
So, we can express binary digits in a program by assigning them to variables, and the output 
of those variables after executing the program will be decimal digits.

we can use underscore in between of literal
int i= 0B100_00_00_00_00;
System.out.println(i); 


*/

// Java Program to Illustrate Use of Binary Literals 
public class BinaryLiterals {
    public static void main(String[] args) 
	{ 
		// Byte type Binary Literal ******************************
		byte a1 = 0b011; 

		// The b can be lower or upper case 
		byte a2 = 0B101; 
		System.out.println("Binary Literal in Byte----->"); 
		System.out.println("a1 = " + a1 + ", " + "a2 = " + a2);  //  a1 = 3, a2 = 5 

		// Short type Binary Literal ******************************
		short b1 = 0b101; 

		// The b can be lower or upper case 
		short b2 = 0B111; 
		System.out.println("Binary Literal in Short----->"); 
		System.out.println("b1 = " + b1 + ", " + "b2 = " + b2);     //  b1 = 5, b2 = 7

		// Int type Binary literal ******************************
		int c1 = 0b011; 
                int c2 = 0B111; 
                int c4= 0B10000000000;
                int c3= 0B100_00_00_00_00; //  we can use underscore for readabilitty
                  
		System.out.println( "Binary Literal in Integer----->"); 
		System.out.println("c1 = " + c1 + ", "
						+ "c2 = " + c2+
                                                 ", c3 = " + c3+
                                                ", c4 = " + c4);   // c1 = 3, c2 = 7, c3 = 1024, c4 = 1024

		// Long type Binary literal  ******************************
		long d1 = 0b0000011111100011; 

		// The b can be lower or upper case 
		long d2 = 0B0000011111100001; 

		System.out.println("Binary Literal in Long----->"); 
		System.out.println("d1 = " + d1 + ", "  + "d2 = " + d2); 
	} 
}


   

// operations on binary literals
  class Example2 { 
	public static void main(String[] args) 
	{ 
		byte n1 = 3; // Decimal number 
		byte n2 = 0b011; // Binary of 3 
		byte n3 = -0b111; // Negative binary number (decimal -7 )
		byte n4 = 0b1101;   //  decimal of 13

		System.out.println("n1 = " + n1); 
		System.out.println("n2 = " + n2); 
		System.out.println("n3 = " + n3); 
		System.out.println("n4 = " + n4); 

		// Checking if the decimal and binary digits are 
		// equal 
		System.out.println("is n1 and n2 equal: " + (n1 == n2)); 
                
                
		// Adding 1 to a binary digit 
		System.out.println("n2 + 1 = " + (n2 + 1)); 

		// Adding 1 to a negative binary digit 
		System.out.println("n3 + 1 = " + (n3 + 1)); 

		// Multiplying 2 with a binary digit 
		System.out.println("n4 x 2 = " + (n4 * 2)); 
	} 
}
