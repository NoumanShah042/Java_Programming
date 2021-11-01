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
public class GenericClass2 {
     public static void main(String args[]) {
	   
         // generic class with two arguments argument
	   
	   MyGenericClass2<Integer,Integer > myInt = new MyGenericClass2<>(1 ,9);
	   MyGenericClass2<Double,Double> myDouble = new MyGenericClass2<>(3.14,2.00 );   
	   MyGenericClass2<Character ,Character> myChar = new MyGenericClass2<>('@','$');
	   MyGenericClass2<String ,Character> myString = new MyGenericClass2<>("Hello" ,'%');
	  
           
          // similar to arraylist class
         //  HashMap<String,String> countries = new HashMap<String,String>();
		
           
	   	   
	   System.out.println(myInt.getValue());
	   System.out.println(myDouble.getValue());
	  System.out.println(myChar.getValue());
	  System.out.println(myString.getValue());
   } 
}
class MyGenericClass2 <Thing,Thing2>
{

    Thing x;
    Thing2 y;
     

    MyGenericClass2(Thing x ,Thing2 y){
            this.x = x;
            this.y=y;
     }

    public Thing2 getValue() {
            return y;
     }
}