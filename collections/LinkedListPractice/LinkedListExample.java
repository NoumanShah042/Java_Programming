/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListPractice;
import java.util.*;
/**
 *
 * @author Syed Nouman Rehman
 */
public class LinkedListExample {
   
  

    public static void main(String args[])
    {  
        LinkedList<String> al=new LinkedList<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        Iterator<String> itr=al.iterator();  
        
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
    }  
 
}

