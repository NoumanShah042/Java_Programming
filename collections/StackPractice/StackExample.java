/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackPractice;

import java.util.Iterator;
import java.util.Stack;

/*
Stack

The stack is the subclass of Vector. It implements the last-in-first-out data structure,
 i.e., Stack. The stack contains all of the methods of Vector class 
and also provides its methods like boolean push(), boolean peek(), boolean push(object o), 
which defines its properties.
 */
public class StackExample {
        public static void main(String args[]){  
        Stack<String> stack = new Stack<String>();  
        stack.push("Ayush"); 
       
        stack.push("Garvit");  
        stack.push("Amit");  
        stack.push("Ashish");  
        stack.push("Garima");  
        stack.pop();  
        Iterator<String> itr=stack.iterator(); 
        
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
    }  
}
