 
package Abstraction;

/* 

Rule: If you are extending an abstract class that has an abstract method, 
       you must either provide the implementation of the method or make this class abstract.

 */

/*


The abstract class can also be used to provide some implementation of the interface. 
In such case, the end user may not be forced to override all the methods of the interface.

*/
interface A
{  
    void a();  
    void b();  
    void c();  
    void d();  
}  
  
abstract class B implements A
{  
    public void c(){System.out.println("I am c");}  
}  
  
class M extends B
{  
    public void a(){System.out.println("I am a");}  
    public void b(){System.out.println("I am b");}  
    public void d(){System.out.println("I am d");}  
}  


 public class Abstract_Class_Implement_Interface
 {
    public static void main(String args[])
    {  
        A a=new M();  
        a.a();  
        a.b();  
        a.c();  
        a.d();  
    }
} 
//
//Output:I am a
//       I am b
//       I am c
//       I am d