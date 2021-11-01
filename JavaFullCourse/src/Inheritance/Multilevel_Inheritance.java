/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/*

When a class extends a class, which extends anther class then this is called multilevel inheritance.
For example class C extends class B and class B extends class A then this type of 
inheritance is known as multilevel inheritance.

*/
class Car
{
   public Car()
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
class Maruti extends Car
{
   public Maruti()
   {
	System.out.println("Class Maruti");
   }
   public void brand()
   {
	System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}

 class Maruti800 extends Maruti{

   public Maruti800()
   {
	System.out.println("Maruti Model: 800");
   }
   public void speed()
   {
	System.out.println("Max: 80Kmph");
   }
  
}
public class Multilevel_Inheritance 
{
     public static void main(String args[])
   {
	 Maruti800 obj=new Maruti800();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
}



//  another example


class X
{
   public void methodX()
   {
     System.out.println("Class X method");
   }
}

class Y extends X
{
    public void methodY()
    {
    System.out.println("class Y method");
    }
}
class Z extends Y
{
   public void methodZ()
   {
     System.out.println("class Z method");
   }
   public static void main(String args[])
   {
     Z obj = new Z();
     obj.methodX(); //calling grand parent class method
     obj.methodY(); //calling parent class method
     obj.methodZ(); //calling local method
  }
}