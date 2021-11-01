/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/* 

 //  we can use one method for all the classes that extends the abstarct Number class 
                             (which can accept all the subclass objects)
//  we do not need separate method to take these classes separately , so this this is also the advantage of abstract class  

 */



class Printer
{
	public void show(Number i)
	{
		System.out.println(i);
	}
//	public void show(Double i)
//	{
//		System.out.println(i);
//	}
//       public void show(int i)
//	{
//		System.out.println(i);
//	}
//       public void show(float i)
//	{
//		System.out.println(i);
//	}

}


public class why_need_abstract_class {
    
    public static void main(String[] args)
	{
		Printer obj = new Printer();
		obj.show(5.4f);   //  float
                obj.show(5);         //   int
                obj.show(5.5);    // double
	}
}
/*

Number is an abstract class in the java.lang package. 
Various subclasses extend the Number class. The most commonly used are:

Byte
Short
Integer
Long
Double
Float

*/



 