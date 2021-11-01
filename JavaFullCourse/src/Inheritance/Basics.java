/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/*
 
Inheritance**********************************
 
Inheritance in Java is a mechanism in which one object acquires all the 
properties and behaviors of a parent object.
It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes that are built
upon existing classes. When you inherit from an existing class, you can reuse methods and
fields of the parent class. Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

Why use inheritance in java  ********************************

1)  For Method Overriding (so runtime polymorphism can be achieved).
2)  For Code Reusability.


Terms used in Inheritance  ********************************

Class: A class is a group of objects which have common properties.
         It is a template or blueprint from which objects are created.

Sub Class/Child Class: Subclass is a class which inherits the other class.
                      It is also called a derived class, extended class, or child class.
Super Class/Parent Class:  Superclass is the class from where a subclass inherits
                    the features. It is also called a base class or a parent class.

Reusability: As the name specifies, reusability is a mechanism which facilitates you
                to reuse the fields and methods of the existing class when you create a new class. 
               You can use the same fields and methods already defined in the previous class.



The syntax of Java Inheritance *************************

class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}  



extends keyword             *****************************
The extends keyword indicates that you are making a new class that derives from an existing class. 
The meaning of "extends" is to increase the functionality.

In the terminology of Java, a class which is inherited is called
a parent or superclass, and the new class is called child or subclass.




Types of inheritance in java  **********************

On the basis of class, there can be three types of inheritance in java:
single, multilevel and hierarchical.

In java programming, multiple and hybrid inheritance is supported through interface only.
We will learn about interfaces later.




Why multiple inheritance is not supported in java?    *************************************

To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. 
If A and B classes have the same method and you call it from child class object, there will be
ambiguity to call the method of A or B class.

Since compile-time errors are better than runtime errors, Java renders compile-time error 
if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

class A
{  
     void msg(){System.out.println("Hello");}  
}  
class B
{  
    void msg(){System.out.println("Welcome");}  
}  
class C extends A , B 
{                                //suppose if it were  
   
    public static void main(String args[])
   {  
      C obj=new C();  
      obj.msg();//Now which msg() method would be invoked?  
   }  
}

 */
public class Basics {
    
}
