package Arrays_;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class Iterator_Example {
    
    static void f1()
    {  
        /* Removing Items from a Collection
                Iterators are designed to easily change the collections that they loop through.
                The remove() method can remove items from a collection while looping. */
        
            //Use an iterator to remove numbers less than 10 from a collection:
          ArrayList<Integer> numbers = new ArrayList<Integer>();
          numbers.add(12);
          numbers.add(8);
          numbers.add(2);
          numbers.add(23);
          Iterator<Integer> it = numbers.iterator();
          while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
              it.remove();
              
            }
          }
          System.out.println(numbers);
    }
    
    
    
    public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    
    // Print the first item
    //System.out.println(it.next());
    
    
    //To loop through a collection, use the hasNext() and next() methods of the Iterator:
//    while(it.hasNext()) 
//    {
//       System.out.println(it.next());
//    }
    
    
     f1();
    
  }
    
}
