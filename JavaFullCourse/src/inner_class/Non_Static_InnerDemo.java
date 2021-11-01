/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;

/**
 *
 * @author Syed Nouman Rehman
 */
 class OuterClass
 {
	  int a;
	 public  void show()
	 {
		 
	 }
	 
	  class Inner  // Outer$Inner.class
	 {
		 public void display() 
		 {
			 System.out.println("in display");
		 }
	 }
 }
public class Non_Static_InnerDemo {
    // variable , method , class
	public static void main(String[] args)
	{
		OuterClass obj = new OuterClass();
		obj.show();
		
                OuterClass.Inner obj1 = obj.new Inner();
		 
		obj1.display();
	}
}
