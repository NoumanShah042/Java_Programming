/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetPractice;

import java.util.*;

/*
HashSet
HashSet class implements Set Interface. It represents the collection that uses 
a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.
 */
public class HashSetExample {
    public static void main(String args[]){  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}
