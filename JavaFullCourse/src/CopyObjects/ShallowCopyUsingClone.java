/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyObjects;

// A Java program to demonstrate shallow copy 
// using clone() 

// An object reference of this class is 
// contained by Test2 
class Test_ 
{ 
	int x, y; 
} 

// Contains a reference of Test and implements 
// clone with shallow copy. 
class Test2_ implements Cloneable 
{ 
	int a; 
	int b; 
	Test_ c = new Test_(); 
        
        @Override
	public Object clone() throws  CloneNotSupportedException 
	{ 
		return super.clone(); 
	} 
} 
public class ShallowCopyUsingClone
{
    public static void main(String args[]) throws
						CloneNotSupportedException 
	{ 
	Test2_ t1 = new Test2_(); 
	t1.a = 10; 
	t1.b = 20; 
	t1.c.x = 30; 
	t1.c.y = 40; 

	Test2_ t2 = (Test2_)t1.clone(); 

	// Creating a copy of object t1 and passing 
	// it to t2 
	t2.a = 100; 

	// Change in primitive type of t2 will not 
	// be reflected in t1 field 
	t2.c.x = 300; 

	// Change in object type field will be 
	// reflected in both t2 and t1(shallow copy) 
	System.out.println(t1.a + " " + t1.b + " " + 
						t1.c.x + " " + t1.c.y); 
	System.out.println(t2.a + " " + t2.b + " " + 
						t2.c.x + " " + t2.c.y); 
	} 
}


//           this  issue is resolved in DeepCopyUsingClone.java