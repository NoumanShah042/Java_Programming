/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Statements;

/*

In Labelled Break Statement, we give a label/name to a loop.

When this break statement is encountered with the label/name of the loop,
it skips the execution of any statement after it and takes the control right out of this labelled loop.

And, the control goes to the first statement right after the loop.

 */


//Labelled break example with nested for loop

public class LabelledBreak
{
public static void main(String... ar)
{

int i ,j=0;
    loop2:
    for(  i=0;i<2;i++)
    {
         for( j=0;j<5;j++)
        {	
                if(j==2)
                {
                    break loop2;
                }    

                System.out.println("i = "+i);
                System.out.println("j = "+j);
        }
     }
    
    System.out.println("i = "+i);
    System.out.println("j = "+j);
    System.out.println("Out of the loop");

    } //main method ends

} //class ends


//Labelled break example with while loop
 
  class LabelledBreak2
{
public static void main(String... ar)
{

   int i=7;

    loop1:
    while(i<20)
    {	
        if(i==10)
        {
           break loop1;
        }
       
        System.out.println("i ="+i); 
        i++;
    }

System.out.println("Out of the loop");

} //main method ends

} //class ends