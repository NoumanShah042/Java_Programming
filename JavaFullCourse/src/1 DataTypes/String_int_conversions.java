/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

/* 

     String to Integer Conversion  *****************************************
     int i = Integer.parseInt("123");
     int i = Integer.valueOf("123");

    Integer to String conversion  *****************************************
     Integer.toString(int)    
     String.valueOf(int) 



    //How to convert numeric string = "000000081" into Integer value = 81
    int i = Integer.parseInt("000000081");
     System.out.println("i: " + i);




 */
public class String_int_conversions {
    public static void main(String[] args) 
    {
            int i =  Integer.valueOf("123");
            
          String a = String.valueOf(12) ;
           
          System.out.println(i);
          System.out.println(a);
            
    }
}
