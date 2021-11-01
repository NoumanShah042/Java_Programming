
package Abstraction;

/*

    resolve issue of multiple inheritance if both interface have same method ?

    sol:
         the class that implements both interface override the same method itself
          and also it may call any interface method in it, using super keyword

*/
@FunctionalInterface
interface Demo1
{
	void abc();
	default void show()
	{
		System.out.println("in Demo show");
	}
}
interface MyDemo1
{
	default void show() 
	{
		System.out.println("in MyDemo Show");
	}
	
}
class DemoImple implements Demo1 , MyDemo1
{
	public void abc()
	{
		System.out.println("in abc");
	}
        @Override
	public void show()
	{
		Demo1.super.show();  
	}
	
	
}
public class Multiple_Inheritance_with_Interface {
    
    public static void main(String[] args)
	{
		Demo1 obj = new DemoImple();
		obj.abc();
		obj.show();
	}
}