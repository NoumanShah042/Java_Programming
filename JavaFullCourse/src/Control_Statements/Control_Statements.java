package Control_Statements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Syed Nouman Rehman
 */
public class Control_Statements 
{
    
    public static void main(String[] args) {  
    //defining a variable  
    int number=13;  
    //Check if the number is divisible by 2 or not  
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    }  
}  
}
  class LeapYearExample 
  {   
      //    A year is leap, if it is divisible by 4 and 400. But, not by 100.
     public static void main(String[] args) 
    {    
        int year=2020;    
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))
        {  
            System.out.println("LEAP YEAR");  
        }  
        else
        {  
            System.out.println("COMMON YEAR");  
        }  
    }    
  }  


    class IfElseTernaryExample
    {    // if else using Using ternary operator  
        public static void main(String[] args) {    
            int number=13;    
            //Using ternary operator  
            String output=(number%2==0)?"even number":"odd number";    
            System.out.println(output);  
        }    
    }  