package Formatted_Output;

/*
    Formatted output in Java

   Sometimes in Competitive programming, it is essential to print the output in a 
   given specified format. Most users are familiar with printf function in C. 
   Let us see discuss how we can format the output in Java:

   Formatting output using System.out.printf()
 */

/*

right justified i.e show extra spaces on right  (by default)
left justified i.e show extra spaces on left

 */

//  System.out.format() is equivalent to printf() and can also be used.
public class Java_printf {
    public static void main(String[] args) {

        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        //  % means format specifier followed by combinations of 

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        //System.out.printf("%b",myBoolean);
        //System.out.printf("%c",myChar);
        //System.out.printf("%s",myString);
        //System.out.printf("%d",myInt);
        //System.out.printf("%f",myDouble);



        //[width]
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s",myString);  //  here width = 10 with right justified by default
         System.out.printf("\nHello %-10s",myString);//  - for left justified
        System.out.println("\n");


        //[precision]
        // sets number of digits of precision when outputting floating-point values
         // System.out.printf("You have this much money %f",myDouble);
         // System.out.printf("\nYou have this much money %.1f",myDouble);         //  set to 1 decimal places 
         // System.out.printf("\nYou have this much money %.2f",myDouble);        //  set to 2 decimal places 




        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify     
                     // System.out.printf("Hello %-10s nomi",myString); // empty space comes left
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

    System.out.printf("You have this much money %,f",myDouble);
    System.out.printf("\nYou have this much money %20f",myDouble);   //by default right justified i.e show extra spaces on right 
    System.out.printf("\nYou have this much money %-20f",myDouble);   // left justified
     System.out.printf("\nYou have this much money %+f",myDouble);   //  output a plus ( + ) or minus ( - ) sign for a numeric value
     System.out.printf("\nYou have this much money %020f",myDouble);   //   numeric values are zero-padded with 20 width
    System.out.println("\n");
} 	
}


class printASCII
{

    public static void main(String[] args) {
        for (int i=0;i<=127;i++)
        {
            System.out.printf("%d : %c  \n",i,i);
         
        }
    }

}


// A Java program to demonstrate working of printf() in Java 

class JavaFormatter1 
{ 
public static void main(String args[]) 
{ 
	int x = 100; 
	System.out.printf("Printing simple integer: x = %d\n", x); 

	// this will print it upto 2 decimal places 
	System.out.printf("Formatted with precison: PI = %.2f\n", Math.PI); 

	float n = 5.2f; 

	// automatically appends zero to the rightmost part of decimal 
	System.out.printf("Formatted to specific width: n = %.4f\n", n); 

	n = 2324435.3f; 

	// here number is formatted from right margin and occupies a 
	// width of 20 characters 
	System.out.printf("Formatted to right margin: n = %20.4f\n", n); 
} 
} 
/*
Output:
Printing simple integer: x = 100
Formatted with precison: PI = 3.14
Formatted to specific width: n = 5.2000
Formatted to right margin: n =         2324435.2500

*/