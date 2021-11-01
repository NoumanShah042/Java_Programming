/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayDequePractice;

import java.util.*;

/**
 *
 * @author Syed Nouman Rehman
 */
public class ArrayDequeExample {
    public static void main(String[] args) 
    {  
        //Creating Deque and adding elements  
        Deque<String> deque = new ArrayDeque<String >();  
        deque.add("Gautam");  
        deque.add("Karan");  
        deque.add("Ajay");  
        //Traversing elements  
        for (String str : deque)
        {  
            System.out.println(str);  
        }  
        
        
    }  
}
