/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorPractice;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Syed Nouman Rehman
 */
public class VectorExample {
    public static void main(String args[]){  
    Vector<String> v=new Vector<String>();  
    v.add("Ayush");  
    v.add("Amit");  
    v.add("Ashish");  
    v.add("Garima");  
    Iterator<String> itr=v.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
    }  
}
