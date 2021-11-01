/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/* 

When more than one classes inherit a same class then this is called hierarchical inheritance. 
For example class B, C and D extends a same class A. 

 ***********************

Hierarchical Inheritance Example
When two or more classes inherits a single class,
it is known as hierarchical inheritance. For example 
Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

 */
 
class A
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class B extends A
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class C extends A
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}
class D extends A
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
public class Hierarchical_Inheritance
{
  public static void main(String args[])
  {
     B obj1 = new B();
     C obj2 = new C();
     D obj3 = new D();
     //All classes can access the method of class A
     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
  }
}