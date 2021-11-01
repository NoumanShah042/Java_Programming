package Lambda_Expression;
 
/* lambda expression =  feature for Java 8 and above
* 				 also known as an anonymous method
* 				 a shorter way to write anonymous classes with only one method
*
*				 need to use a functional interface or use a pre-defined functional interface
*				 they contain only one abstract method
*				 ex. ActionListener, Runnable, (user-defined)
*
*				 A Lambda expression can be used in any place where a functional interface is required
*				 How to use a lambda expression:
*				 (arguments) -> {statement/s}


                           //       do not need   new MyInterface1 { override method};
		*/
public class Lambda_Eexpression {
    
    public static void main(String[] args) {
		
        
		                  
        
                                                
                
                //  with no argument
                                                
//                 MyInterface1 myInterface1 = () -> {
//			System.out.println("Heello World!");
//			System.out.println("It is a nice day " );
//		      };
//                
//                myInterface1.message( );
                
                
                
                //  with   arguments
                
 		String name = "Bro";
		char symbol = '!';
		
                
                
		MyInterface myInterface = (x,y) -> {
			System.out.println("Heello World!");
			System.out.println("It is a nice day "+x+y);
                        
                        // consider this as we define the body of the 
                        // message function ( single abstract method )
		};
			                                   //  we can use any name in argument list
		MyInterface myInterface2 = (n,s) -> {
			System.out.println("Hello "+n+s);
                        //  
		};
			
		myInterface.message(name,symbol);
		myInterface2.message(name,symbol);
			
	}
    
}
