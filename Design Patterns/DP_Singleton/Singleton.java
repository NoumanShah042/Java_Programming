package DP_Singleton;


/* 

Singleton pattern  
In software engineering, the singleton pattern is a software design pattern
that restricts the instantiation of a class to one "single" instance.
This is useful when exactly one object is needed to coordinate actions 
across the system. The term comes from the mathematical concept of a singleton.


 */
public class Singleton 
{
    
    private static Singleton obj;
    private static Boolean isAlive = false;
    
    int x = 1000;

    public static Singleton getInstance()
    {
        if(!isAlive)
        {
            System.out.println("New Instance of Singleton");
            obj = new Singleton();
            isAlive = true;
        }
        else
        {
            System.out.println("Old Object is returned");
        }
        
        return obj;    //  return new object or if object already exist  return old object
    }
    
     // as we declare it private we cannot instantiate this object in main 
    //  using new keywordd Singleton s= new  Singleton();
    
    private Singleton()   
    {
        System.out.println("in Singleton Constructor ");
    }
     
    
}
