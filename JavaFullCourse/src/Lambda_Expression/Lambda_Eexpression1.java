/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_Expression;

/*

 Types of interface  (now in JAVA 8)
 1. Normal           (have more than one method)
 2. Single abstract method - Functional Interface - Lambda Expression - (have only one method)
                      ( concept commming from Scala )
 3. Marker interface (does not have any method  like in serializable)

 */


@FunctionalInterface           //  now if class contain more than one declaration , it cause error
interface Ac
{
	void show();
         
}
 

public class Lambda_Eexpression1 
{
    public static void main(String[] args)
	{
		Ac obj = new Ac()
                        {
                             public void show()
                             {
                                  System.out.println("using inner class");
                             }
                        };
                obj.show();
            
// ********************************************************************
//       remove           new Ac     and      header of function
//      
//         from inner class to make lambda expression
// ********************************************************************

                
                Ac obj1 =() -> {
                                    System.out.println("using lambda expression");
                               };
		obj1.show();
	}
}
