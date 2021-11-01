package ArrayList_practice;


import java.util.*;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class ArrayList_Practice {
 
    static void sortArrayList()
    {
        /*
         The java.util package provides a utility class Collections which  has the static method sort(). 
         Using the Collections.sort() method, we can easily sort the ArrayList.
        */


        //Creating a list of fruits  
          List<String> list1=new ArrayList<String>();  
          list1.add("Mango");  
          list1.add("Apple");  
          list1.add("Banana");  
          list1.add("Grapes");  
          
         //Sorting the list  
          Collections.sort(list1); 
          
           //Traversing list through the for-each loop  
          for(String fruit:list1)  
            System.out.println(fruit);  

         System.out.println("Sorting numbers...");  
          //Creating a list of numbers  
          List<Integer> list2=new ArrayList<Integer>();  
          list2.add(21);  
          list2.add(11);  
          list2.add(51);  
          list2.add(1);  
          //Sorting the list  
          Collections.sort(list2);  
           //Traversing list through the for-each loop  
          for(Integer number:list2)  
            System.out.println(number);  
 }  
    
    
    
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Apple");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("wagonar");
        
        // ArrayList<String> list2= new ArrayList<String>(cars);
          
        
          
       // System.out.println(cars);
       //System.out.println(cars.get(0));;
       
       
        //getting the Iterator
//       Iterator itr=list2.iterator();
//        while(itr.hasNext())
//        {
//            //check if iterator has the elements
//            System.out.println(itr.next());
//            //printing the element and move to next
//        }


        
        

         //it will return the 2nd element, because index starts from 0
        //System.out.println("Returning element: "+cars.get(1));

        
        //changing the ith element
        //cars.set(1,"Dates");
        
        
        // sort list
       // Collections.sort(cars);
        
       // Traversing list through for-each loop
//        for (String var:cars)
//        {
//            System.out.println(var);
//        }

        
        
        
        
        
    }
}
