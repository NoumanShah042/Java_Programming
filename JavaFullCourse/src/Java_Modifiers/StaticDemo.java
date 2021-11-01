/*
 
Static block is used for initializing the static variables. 
This block gets executed when the class is loaded in the memory.
A class can have multiple Static blocks, which will execute in the same 
sequence in which they have been written into the program.
 



Difference between static block and constructor.***************************

1.Static blocks are used to initialise static variables where as constructor is used to 
   initialise member variables or instance variables

2.static block is executed at compile time itself where as constructor 
   is executed just before the creation of object that is after run time of program.

3.Static block is executed only once during the lifetime of program 
   where as constructor is executed each time a new object is created.

4.Static block is executed prior to constructor.




 */
package Java_Modifiers;


class Emp
{
	int eid;
	int salary;
	static String ceo;

	public Emp()  //execute when you create an object
	{
		eid = 1;
		salary = 3000;
		System.out.println("in constructor");
	}
	
	
	static    //execute when you load a class (so it will execute before the constructor)
        {          //(but if we have more than one static block, then it will follow the sequence)
	
            
            //  as ceo is static so why we initialize it in constructor which will execute each 
            // time when we create object
            
            //  so we use statci block which will execute only once for the class
            
		ceo = "Larry";
		System.out.println("in static");
	}
	

	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}

public class StaticDemo
{
	static int i = 0;
	public static void main(String[] args)
	{
		i = 9;
		
		Emp navin = new Emp();
//		navin.eid = 8;
//		navin.salary = 4000;
//		Emp.ceo = "Mahesh";
		
		Emp rahul = new Emp();
//		rahul.eid = 9;
//		rahul.salary = 5000;
//		Emp.ceo = "Mahesh";   // we dont need object
//		
//		Emp.ceo = "Nikita";
		
		navin.show();
		rahul.show();
	}

}