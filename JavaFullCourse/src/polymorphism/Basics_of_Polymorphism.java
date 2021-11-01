/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/*

 
Polymorphism in Java    *******************************************************************

Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.


Types of polymorphism in Java:  *******************************************************************

1) compile-time polymorphism and
2)  runtime polymorphism.


We can perform polymorphism in java by method overloading and method overriding.
If you overload a static method in Java, it is the example of compile time polymorphism.
Here, we will focus on runtime polymorphism in java.



Runtime Polymorphism in Java  *******************************************************************

Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

 
Upcasting   ***************************************
If the reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:

class A{}  
class B extends A{}  
A a=new B();//upcasting  


For upcasting, we can use the reference variable of class type or an interface type. For Example:

interface I{}  
class A{}  
class B extends A implements I{}  
Here, the relationship of B class would be:

B IS-A A
B IS-A I
B IS-A Object

Since Object is the root class of all classes in Java, so we can write B IS-A Object.


Java Runtime Polymorphism with Data Member   ************************************

Rule: Runtime polymorphism can't be achieved by data members.

A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

In the example given below, both the classes have a data member speedlimit.
We are accessing the data member by the reference variable of Parent class which 
refers to the subclass object. Since we are accessing the data member which is not overridden,
hence it will access the data member of the Parent class always.


class Bike{  
 int speedlimit=90;  
}  
class Honda3 extends Bike{  
 int speedlimit=150;  
  
 public static void main(String args[]){  
  Bike obj=new Honda3();  
  System.out.println(obj.speedlimit);//90  
}  
}

 */

 
public class Basics_of_Polymorphism {
    
    
}

