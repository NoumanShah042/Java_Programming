/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;

/* 

/*
    anonymous class = an inner class without a name
                      only a single object is created from one
                      The object may have “extras” or "changes"
                      and no need to create a separate innerclass
                      when it only need it once.
                      Helps us to avoid cluttering code with a class name

                      Syntax is similar to a constructor,
                       except that there is also a class definition
                       within a block of code.  
                       GREAT FOR LISTENERS
    */
    
class Greeting 
{
     public void welcome()
    {
        System.out.println("Hello World!");
    }
}
public class anonymous_class1 {
    
    public static void main(String[] args) {
  
    
      Greeting  greeting = new Greeting()
        {
            @Override
            public void welcome()
            {
                System.out.println("nomi shah!");
            }
             
        };
      
        greeting.welcome();

        Greeting   greeting2 = new Greeting();
        greeting2.welcome();
 }
}
