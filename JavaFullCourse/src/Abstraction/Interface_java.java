package Abstraction;

/*

Important Points about Interface in Java
 
1) We can’t instantiate an interface in java. But we can make reference of it that refers
   to the Object of its implementing class.

2)  In interface we cannot provide methods definition. Interface can have only abstract methods declaration. 
    Since Java 8, it can have default and static method definitions also.
    Since Java 9, we can have private methods definition in an interface.

3)  Interfaces can’t have constructors because we can’t instantiate them and
      interfaces can’t have a method with body. (befor java 8)

4) Members of a Java interface are public by default.
      
  a)  By default attribute(field)   ->   public, static and final 
  b)  By default interface methods  ->   public and abstract

  
4 a) By default any attribute(field) of interface is public, static and final, so we don’t need 
    to provide access modifiers to the attributes but if we do, compiler doesn’t complain about it either.

    public static final int BOUNCE_FACTOR=10;
    public int BOUNCE_FACTOR=10;
    int BOUNCE_FACTOR=10;

 
4 b) By default interface methods are implicitly public and abstract, so do not need to mention it , it makes 
   total sense because the method don’t have body and so that subclasses can provide the method implementation.
     ( One can use any combination of public or abstract or no modifiers )

    void setBounce();
    public void setBounce();
    abstract void setBounce();
    public abstract setBounce();
    abstract public setBounce();

5) Interface methods must not be static because interface defines instant methods.

6) As interface methods are abstract they cannot be marked as final, strictfp or native. 
    If they are marked final they cannot be overridden and methods without a body would make no sense.

8) An interface can’t extend any class but it can extend another interface. Actually java provides multiple inheritance in interfaces, what is means is that an       interface can extend multiple interfaces. 
 
    A class can implement more than one interface.

9) When a concrete class implements a interface, all  the methods must be implemented and must be marked public, unless it’s an abstract class. 
     ( Abstract classes can implement interfaces and it need not provide the 
      implementation for the methods obtained from the interface  )



Why use Java interface?   ********************************
There are mainly three reasons to use interface. They are given below.

It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.


 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class Interface_java {
    public static void main(String[] args) {
		
		Fish fish = new Fish();
		
		fish.hunt();
		fish.flee();
                
                //Prey p=new Prey();
				
	}
}
//********************************************
  interface Prey {

	void flee();
  }
//********************************************
  interface Predator {

	void hunt();
}
//********************************************
  class Rabbit implements Prey{


	@Override
	public void flee() {
		System.out.println("*The rabbit is fleeing*");
		
        }
}
//********************************************
  class Hawk implements Predator{


	@Override
	public void hunt() {
		System.out.println("*The hawk is hunting*");
		
        }
}
//********************************************
  class Fish implements Prey,Predator{


	@Override
	public void hunt() {
		System.out.println("*The fish is hunting*");
		
	}

	@Override
	public void flee() {
		System.out.println("*The fish is fleeing*");
		
	}
}
