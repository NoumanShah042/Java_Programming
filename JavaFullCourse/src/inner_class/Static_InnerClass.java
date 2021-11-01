package inner_class;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */

 class Outer 
 {
	 static int a;
	 public static void show()
	 {
		 
	 }
	 
	 static class Inner  // Outer$Inner.class
	 {
		 public void display() 
		 {
			 System.out.println("in display");
		 }
	 }
 }
public class Static_InnerClass {
    // variable , method , class
	public static void main(String[] args)
	{
		Outer obj = new Outer();
		obj.show();
		
 
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
	}
}
