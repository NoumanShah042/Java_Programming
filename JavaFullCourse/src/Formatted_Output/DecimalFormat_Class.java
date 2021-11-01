/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formatted_Output;
import java.text.DecimalFormat; 
/*

Value	        Pattern   	Output	       Explanation
123456.789	###,###.###	123,456.789	The pound sign (#) denotes a digit, the comma is a placeholder for the grouping separator, and the period is a placeholder for the decimal separator.
123456.789	###.##          123456.79       The value has three digits to the right of the decimal point, but the pattern has only two. The format method handles this by rounding up.
123.78	        000000.000 	000123.780      The pattern specifies leading and trailing zeros, because the 0 character is used instead of the pound sign (#).
12345.67	$###,###.###	$12,345.67	The first character in the pattern is the dollar sign ($). Note that it immediately precedes the leftmost digit in the formatted output.
 */

// Java program to demonstrate working of DecimalFormat 
public class DecimalFormat_Class 
{
    public static void main(String args[]) 
    { 
	double num = 123.4567; 

	// prints only numeric part of a floating number 
	DecimalFormat ft = new DecimalFormat("####");  // num = 123
	System.out.println("Without fraction part: num = " + ft.format(num)); 

        
	// this will print it upto 2 decimal places 
	ft = new DecimalFormat("#.##");   //   num = 123.46
	System.out.println("Formatted to Give precison: num = " + ft.format(num)); 

	// automatically appends zero to the rightmost part of decimal 
	// instead of #,we use digit 0 
	ft = new DecimalFormat("#.000000"); //  num = 123.456700
	System.out.println("appended zeroes to right: num = " + ft.format(num)); 

	// automatically appends zero to the leftmost of decimal number 
	// instead of #,we use digit 0 
	ft = new DecimalFormat("00000.00");  //  num = 00123.46
	System.out.println("formatting Numeric part : num = "+ft.format(num)); 

	// formatting money in dollars 
	double income = 23456.789; 
	ft = new DecimalFormat("$###,###.##");    // $23,456.79
	System.out.println("your Formatted Dream Income : " + ft.format(income)); 
   } 
} 
/*

Output:

Without fraction part: num = 123
Formatted to Give precison: num = 123.46
appended zeroes to right: num = 123.456700
formatting Numeric part : num = 00123.46
your Formatted Dream Income : $23,456.79


*/



 class DecimalFormatDemo {

   static public void customFormat(String pattern, double value ) 
   {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
      String output = myFormatter.format(value);
      System.out.println(value + "  " + pattern + "  " + output);
   }

   static public void main(String[] args) {

      customFormat("###,###.###", 123456.789);
      customFormat("###.##", 123456.789);
      customFormat("000000.000", 123.78);
      customFormat("$###,###.###", 12345.67);  
   }
}
/*

The output is:

123456.789  ###,###.###  123,456.789
123456.789  ###.##  123456.79
123.78  000000.000  000123.780
12345.67  $###,###.###  $12,345.67

*/
