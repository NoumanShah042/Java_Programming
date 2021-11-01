 
package Abstraction;
/*

Use abstract class when you want to extend a comman base and where you want to provide a default implementation to the abstract method. 
Use interface when you want to exactly implement all the abstract methods to the class implementaing the interface and no default body to a method can be provided.

Abstract classes should be used primarily for objects that are closely related, 
whereas interfaces are best suited for providing common functionality to unrelated classes. ... 
Abstract classes allow you to partially implement your class, whereas interfaces contain no implementation for any members.
*/
public class abstract_vs_Interface {

/*

There are three differences between an interface and an abstract class:  ******************************************

1) you can implement multiple interfaces at the same time , but only extend one class,
2) an abstract class is allowed to contain implementation 
    (non-abstract methods, constructors, instance initializers and instance variables) 
    and non-public members 
3) abstract classes may be a tiny bit faster (or they may not.)
    
    
Actually the first point is the reason for the existence of interfaces in Java:
to provide a form of multiple inheritance. In languages with multiple implementation inheritance, an interface would be equivalent to a fully abstract class (a class with only public abstract members).

The above differentiation suggests when to use an abstract class and when to use an interface:  ************

use an abstract class, if you want to provide common implementation to subclasses,
use an abstract class, if you want to declare non-public members,
use an abstract class, if you want to be free to add new public methods in the future,
use an interface if you’re sure the API is stable for the long run
use an interface if you want to provide the implementing classes the opportunity to inherit from other sources at the same time.
In general, prefer interfaces if you don’t need to use an abstract class, because they provide more design flexibility.
    
    
    
    
    */
}
  class ABC
{}
interface Writer 
{
//  interface can have only abstract metods without definition
// by default all the methods in interface are "public abstract"  , so do not need to mention it
	void write();
}
class Pen implements Writer
{
	public void write()
	{
		System.out.println("Im a Pen");
	}
}
class Pencil implements Writer   //  we can omplements multiple interfaces to achieve multiple inheritance
{
	public void write()
	{
		System.out.println("Im a Pencil");
	}
}
class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}
 class InterfaceDemo 
{
	public static void main(String[] args)
	{
               //  we cannot create object of interface , we can only craete reference of interface
		Kit k = new Kit();
		Writer p = new Pen();
		
		Writer pc = new Pencil();
		
		k.doSomething(pc);
	}
}
