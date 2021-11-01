/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Input;

import java.util.Scanner;
 
 /*

In Scanner class if we call nextLine() method after any one of the seven nextXXX() method 
then the nextLine() does not read values from console and cursor will not come into console it will skip that step.
The nextXXX() methods are nextInt(), nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().

This problem occurs only for Scanner class, due to nextXXX() methods ignore leading newline character and
nextLine() only reads till first newline character. If we use one more call of nextLine() method
between nextXXX() and nextLine(), then this problem will not occur because nextLine() will consume 
the newline character. see ScannerProblemSolution class

point summary: 
    nextXXX() -> nextLine() -> nextLine()
    call next line two times to take string input nextLine 

*/
public class ScannerProblemSolution 
 {
     public static void main(String args[])
     {
         Scanner scn = new Scanner(System.in);
         System.out.println("Enter an integer");
         int a = scn.nextInt();
         
         scn.nextLine();
         
         System.out.println("Enter a String");
         String b = scn.nextLine();
         System.out.printf("You have entered:- "
                 + a + " " + "and name as " + b);
     }
}
