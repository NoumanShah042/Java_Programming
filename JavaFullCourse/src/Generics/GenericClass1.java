/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Syed Nouman Rehman
 */
public class GenericClass1 {
     public static void main(String args[]) {
	   
         // generic class with single argument
	   
	   MyGenericClass1<Integer > myInt = new MyGenericClass1<>(1 );
	   MyGenericClass1<Double> myDouble = new MyGenericClass1<>(3.14 );   
	   MyGenericClass1<Character > myChar = new MyGenericClass1<>('@');
	   MyGenericClass1<String > myString = new MyGenericClass1<>("Hello" );
	  
           
          // similar to arraylist class
         //  ArrayList<String> a =new ArrayList<>();
           
	   	   
	   System.out.println(myInt.getValue());
	   System.out.println(myDouble.getValue());
	  System.out.println(myChar.getValue());
	  System.out.println(myString.getValue());
   } 
}
class MyGenericClass1 <Thing>
{

    Thing x;
     

    MyGenericClass1(Thing x ){
            this.x = x;
     }

    public Thing getValue() {
            return x;
     }
}