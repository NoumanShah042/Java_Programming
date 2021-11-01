/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Statements;

/* 
Java Switch Statement******************************************

The Java switch statement executes one statement from multiple conditions. 
It is like if-else-if ladder statement. 

The switch statement works with
 byte, short, int, long, enum types, String and 
some wrapper types like Byte, Short, Int, and Long. 
Since Java 7, you can use strings in the switch statement.

In other words, the switch statement tests the equality of a variable against multiple values.

Points to Remember********************************
1) There can be one or N number of case values for a switch expression.
2) The case value must be of switch expression type only.
   The case value must be literal or constant. It doesn't allow variables.
3) The case values must be unique. In case of duplicate value, it renders compile-time error.
4) The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
5) Each case statement can have a break statement which is optional.
     When control reaches to the break statement, it jumps the control after the switch expression. 
     If a break statement is not found, it executes the next case.
6) The case value can have a default label which is optional.
 */
public class Switch_Statement {
    
    
    public static void main(String[] args)
    {  
        //Declaring a variable for switch expression  
        int number=20;  
        //Switch expression  
        switch(number)
        {  
            //Case statements  
            case 10:
            System.out.println("10");  
            break;  
            
            case 20: 
            System.out.println("20");  
            break;  
            
            case 30:
            System.out.println("30");  
            break; 
            
            //Default case statement  
            default:  //   The default keyword specifies some code to run if there is no case match:
            System.out.println("Not in 10, 20 or 30");  
            
           // Note that if the default statement is used as the last statement in a switch block,
           //it does not need a break.
        }  
    }  
    
}



//Java Program to demonstrate the example of Switch statement  
//where we are printing month name for the given number  

  class SwitchMonthExample {    
        public static void main(String[] args) 
        {    
            //Specifying month number  
            int month=7;
            
            String monthString="";  
            
            //Switch statement  
            switch(month)
            {    
            //case statements within the switch block  
            case 1: monthString="1 - January";  
            break;    
            case 2: monthString="2 - February";  
            break;    
            case 3: monthString="3 - March";  
            break;    
            case 4: monthString="4 - April";  
            break;    
            case 5: monthString="5 - May";  
            break;    
            case 6: monthString="6 - June";  
            break;    
            case 7: monthString="7 - July";  
            break;    
            case 8: monthString="8 - August";  
            break;    
            case 9: monthString="9 - September";  
            break;    
            case 10: monthString="10 - October";  
            break;    
            case 11: monthString="11 - November";  
            break;    
            case 12: monthString="12 - December";  
            break;    
            default:System.out.println("Invalid Month!");    
            }    
            //Printing month of the given number  
            System.out.println(monthString);  
        }    
}   


/*

Program to check Vowel or Consonant:

If the character is A, E, I, O, or U, it is vowel otherwise consonant. It is not case-sensitive.
*/
class SwitchVowelExample
{    
public static void main(String[] args) {    
    char ch='O';    
    switch(ch)  
    {  
        case 'a':   
            System.out.println("Vowel");  
            break;  
        case 'e':   
            System.out.println("Vowel");  
            break;  
        case 'i':   
            System.out.println("Vowel");  
            break;  
        case 'o':   
            System.out.println("Vowel");  
            break;  
        case 'u':   
            System.out.println("Vowel");  
            break;  
        case 'A':   
            System.out.println("Vowel");  
            break;  
        case 'E':   
            System.out.println("Vowel");  
            break;  
        case 'I':   
            System.out.println("Vowel");  
            break;  
        case 'O':   
            System.out.println("Vowel");  
            break;  
        case 'U':   
            System.out.println("Vowel");  
            break;  
        default:   
            System.out.println("Consonant");  
    }  
}    
}   