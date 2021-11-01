/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Syed Nouman Rehman
 */

class Animal
{  
    void eat()
    {
        System.out.println("eating...");
    }  
}  
class Dog extends Animal
{  
    void bark()
    {
        System.out.println("barking...");
    }  
}  
  
public class Single_Inheritance {
    public static void main(String args[]){  
       
        Dog d = new Dog();  
        d.bark();  
        d.eat();  
    }
}
