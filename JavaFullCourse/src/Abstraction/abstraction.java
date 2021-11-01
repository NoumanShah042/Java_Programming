package Abstraction;

/*

Abstract class in Java   *********************************************
A class which is declared as abstract is known as an abstract class.
It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.




*/
 abstract class Vehicle 
  {
	void testGoMethodOChild()
        {
            go();
            // we can use abstract methods in same class 
            // which will be override by child class
            // we also use this concept in pizzaFactory
        
        }
	abstract void go();
  }
//****************************************
  class Cycle extends Vehicle{

	@Override
	void go() 
        {
		System.out.println("The driver is driving the Cycle");
		
	}
}
public class abstraction 
{
    public static void main(String[] args) {
		
		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//		 abstract methods are declared without an implementation
		
                
                //*************************************
		 
                Cycle cycle = new Cycle();
		cycle.go();
                
                //*************************************
                 Vehicle vehicle = new Cycle();
		 vehicle. testGoMethodOChild(); 
	
    }
}
 