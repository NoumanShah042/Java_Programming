/*
 Using Assignment Operator to create copy of reference variable***************************
In Java, there is no operator to create copy of an object. 
Unlike C++, in Java, if we use assignment operator then it will create a copy of reference variable and 
not the object. This can be explained by taking an example. Following program demonstrates the same.


 */
package CopyObjects;
  
 
// Java program to demonstrate that assignment 
// operator only creates a new reference to same 
// object. 


//  A class whose objects are cloned 
class A 
{ 
	int x, y; 
	A() 
	{ 
		x = 10; 
		y = 20; 
	} 
} 

 
public class ShallowCopyTest {
    
    public static void main(String[] args) 
	{ 
		A ob1 = new A(); 

		System.out.println(ob1.x + " " + ob1.y); 

		// Creating a new reference variable ob2 
		// pointing to same address as ob1 
		A ob2 = ob1; 

		// Any change made in ob2 will be reflected 
		// in ob1 
		ob2.x = 100; 

		System.out.println(ob1.x+" "+ob1.y); 
		System.out.println(ob2.x+" "+ob2.y); 
	} 
}

