 package Abstraction;

/*

 Abstract class -> Define and declare
 Interface -> declare -> 1.7
 1.8 can define method in interface


 Since Java 8, Interface can have default and static methods also.
 Since Java 9, Interface can have private methods in an interface.



 */

@FunctionalInterface
interface Demo    //   this is Functional Interface bec it have only one abstract method abc()
{
    
        int NUM = 8;   //  by default public, static and final variable
    
        void abc();  
	default public void show()
	{
            //    abc();      //  we can call abstract method here
                              //  but if abc in DemoImp call show that cause error because of loop calling each other
		System.out.println("in show");
	}
        
        static public void showStatic()
	{ 
            //  call with class name and  
            //   also we cannot create object of interface
		System.out.println("in show static method");
	}
       
}

class DemoImp implements Demo
{
        @Override
	public void abc()
	{
//              show();    //   run override method if overriden otherwise call super class show() 
                
		System.out.println("in abc");
//              NUM = 8;     cannot assign value to constant 
	}
        
        @Override
         public void show()  //   override defaul method of interface
	{
 		System.out.println("in overriden show");
	}
      
       
}
   

public class  Methods_in_Interface 
{
    public static void main(String[] args)
	{
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();     
                
                
//             obj.showStatic();    error ,  call static by class name 
               Demo.showStatic();    //  static method
	}
}

