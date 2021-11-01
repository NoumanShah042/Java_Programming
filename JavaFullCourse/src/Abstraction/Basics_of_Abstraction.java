/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/*

Before learning the Java abstract class, let's understand the abstraction in Java first.



Abstraction in Java   ****************************

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details,
 for example, sending SMS where you type the text and send the message.
  You don't know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.

Ways to achieve Abstraction  ***************************
 
Abstraction can be achieved with either abstract classes or interfaces 

1) Abstract class (0 to 100%)
2) Interface (100%)



Why And When To Use Abstract Classes and Methods? ********************************

To achieve security - hide certain details and only show the important details of an object.



*/
// **************************************************************************
// **************************************************************************

//
// The abstract keyword is a non-access modifier, used for classes and methods:
//
// Abstract class: is a restricted class that cannot be used to create objects 
//     (to access it, it must be inherited from another class).
//
//  Abstract method: can only be used in an abstract class, and it does not 
//   have a body. The body is provided by the subclass (inherited from).
// 



/* 

We can’t instantiate an interface and Abstract class in java. But we can make reference of it that refers
 to the Object of its implementing class .


Abstract class    *************************                   	 Interface

1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods declaration. 
			                                         Since Java 8, it can have default and static methods also.
                                                                 Since Java 9, we can have private methods in an interface.


2) Abstract class doesn't support multiple inheritance.	         Interface supports multiple inheritance.

3) Abstract class can have final, non-final,                     Interface has only static and final variables.
    static and non-static variables.	             
           
4) Abstract class can provide the implementation of interface.	 Interface can't provide the implementation of abstract class.

5) The abstract keyword is used to declare abstract class.	 The interface keyword is used to declare interface.

6) An abstract class can extend another Java class and           An interface can extend another Java interface only.
    implement multiple Java interfaces.	

7) An abstract class can be extended using keyword "extends".  	 An interface can be implemented using keyword "implements".

8) A Java abstract class can have class members                  Members of a Java interface are public by default.
    like private, protected, etc.
	
 
Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).











*/
public class Basics_of_Abstraction {
    
}
