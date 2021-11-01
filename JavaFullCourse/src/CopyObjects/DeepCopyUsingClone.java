/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyObjects;


// A Java program to demonstrate deep copy 
// using clone() 
 

// An object reference of this class is 
// contained by Test2 

class Test  implements Cloneable 
{ 
    int x, y; 

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }

} 

// Contains a reference of Test and implements 
// clone with deep copy.
class Test2 implements Cloneable 
{ 
	int a; 
	int b; 
	Test c = new Test(); 
 
        @Override
        public Object clone() throws CloneNotSupportedException 
	{ 
		 
		Test2 t = (Test2)super.clone(); 
                 
		t.c =  (Test)t.c.clone();   //  also clone composed object ( Test1 c )
		 
		return t; 
	} 
} 
 
public class DeepCopyUsingClone
{
 
    public static void main(String args[]) throws
							CloneNotSupportedException 
	{ 
	Test2 t1 = new Test2(); 
	t1.a = 10; 
	t1.b = 20; 
	t1.c.x = 30; 
	t1.c.y = 40; 

	Test2 t3 = (Test2)t1.clone(); 
        
        
	t3.a = 100; 
 	// Change in primitive type of t2 will not 
	// be reflected in t1 field 
        
        
	t3.c.x = 300; 
 	// Change in object type field of t2 will not 
	// be reflected in t1(deep copy) 
        
        
        
	System.out.println(t1.a + " " + t1.b + " " + 
						t1.c.x + " " + t1.c.y); 
	System.out.println(t3.a + " " + t3.b + " " + 
						t3.c.x + " " + t3.c.y); 
	} 
    
    
}
