/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Modifiers;

class Ai
{
	final int DAY; // constant in capital
                       //  we can only initialize final variable only once either at declaration or in contructor only once
	public Ai()
	{
		DAY = 10;  //  we can also initialize final var here only once if we have not initialize at declaration 
//		DAY = 19;   error
	}
	
	public final void show()
	{
		System.out.println("in Ai show");
	}
}
class Bi extends Ai
{
//	public void show()        error becuse of final 
//	{
//	System.out.println("in Bi show");
//	}
}

public class FinalDemo 
{
	public static void main(String[] args)
	{
//		Ai obj = new Ai();
		Bi obj = new Bi();
		obj.show();
		
		
//		System.out.println(obj.i);
	}
}
