/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*

java.util.Scanner class is a simple text scanner which can parse primitive types and strings.
It internally uses regular expressions to read different types.

 

Java.io.BufferedReader class reads text from a character-input stream, buffering characters 
so as to provide for the efficient reading of sequence of characters

Following are differences between above two.
Issue with Scanner when nextLine() is used after nextXXX() 
Try to guess the output of following code : 
 */
public class Scanner_VS_BufferReader {
    
}
// Code using Scanner Class

class UsingScanner
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scn.nextInt();
		System.out.println("Enter a String");
		String b = scn.nextLine();
		System.out.printf("You have entered: "
				+ a + " " + "and name as " + b);
	}
}

// Code using Buffer Class

class UsingBuffer
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter a String");
		String b = br.readLine();
		System.out.printf("You have entered:- " + a + " and name as " + b);
	}
}


/*
Other differences:
 

1) BufferedReader is synchronous while Scanner is not. BufferedReader should be used 
   if we are working with multiple threads.

2) BufferedReader has significantly larger buffer memory than Scanner.

3) The Scanner has a little buffer (1KB char buffer) as opposed to the 
   BufferedReader (8KB byte buffer), but it’s more than enough.

4) BufferedReader is a bit faster as compared to scanner because scanner does parsing
        of input data and BufferedReader simply reads sequence of characters.


*/