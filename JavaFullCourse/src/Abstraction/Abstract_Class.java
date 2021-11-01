/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/* 

Abstract class in Java*************************************

A class which is declared as abstract is known as an abstract class in Java.
It can have abstract and non-abstract methods (method with the body).
It needs to be extended and its method implemented. It cannot be instantiated.


An abstract class can have a data member, abstract method, method body (non-abstract method), 
constructor, and even main() method.



Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.


Rule: If there is an abstract method in a class, that class must be abstract.
Rule: If you are extending an abstract class that has an abstract method, 
       you must either provide the implementation of the method or make this class abstract.

 */


//  Abstract class having constructor, data member and methods
abstract class Bike
{  
   Bike()
   {   
       System.out.println("bike is created");
   }  
   abstract void run();
   
   void changeGear()
   {
       System.out.println("gear changed");
   }  
 }  

//Creating a Child class which inherits Abstract class  
 class Honda extends Bike
 {  
    void run()
    {
        System.out.println("running safely..");
    }  
 }


 
//Creating a Test class which calls abstract and non-abstract methods  
  
public class Abstract_Class 
{
    public static void main(String args[])
    {  
        Bike obj = new Honda();  
        obj.run();  
        obj.changeGear();  
    }  
}
 