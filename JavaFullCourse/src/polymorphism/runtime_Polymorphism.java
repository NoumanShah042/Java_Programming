/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Syed Nouman Rehman
 */


class Aa
{
	public void show()
	{
	System.out.println("in A");
	}
}
class Bb extends Aa
{
	public void show()
	{
		System.out.println("in B");
	}
	public void config() 
	{
		System.out.println("config");
	}
}
class C extends Aa
{
	public void show()
	{
		System.out.println("in C");
	}
}


public class runtime_Polymorphism 
{
    
	public static void main(String[] args)
	{
		Aa obj1 = new Bb();  // runtime polymorphism
		obj1.show();
		
		obj1 = new C();
		obj1.show();  // Dynamic Method Dispatch
	}
}

 