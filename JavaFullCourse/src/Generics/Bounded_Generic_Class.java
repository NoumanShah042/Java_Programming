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
public class Bounded_Generic_Class {
    
    public static void main(String[] args) {
        
         //bounded types = 	you can create the objects of a generic class to have data 
	   //					of specific derived types ex.Number
	   
            MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
	    MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01); 
            
          // similar to arraylist class
         //  ArrayList<String> a =new ArrayList<>();
         //  HashMap<int ,String > ...
           
	   	   
	   System.out.println(myInt.getValue());
	   System.out.println(myDouble.getValue());
            
    }
}

//    we can only pass the Primitive types that extends number class i.e. integer, double , float , short etc. 

 class MyGenericClass <Thing extends Number, Thing2 extends Number>{

    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y){
            this.x = x;
            this.y = y;
    }

    public Thing2 getValue() {
            return y;

    }
}
 
