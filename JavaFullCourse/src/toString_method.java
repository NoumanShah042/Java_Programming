

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class toString_method {
    public static void main(String[] args) {
  
  // toString() = special method that all objects inherit, 
  //    that returns a string that "textually represents" an object.
  //    can be used both implicitly  and explicitly
  
     // implicitly ( return address of object in string format)
  Car car = new Car();
  
  
  System.out.println(car.toString());
  
  // or
  
  System.out.println(car); // if we do not override  toString it will display address of object

    
 }
}

  class Car {


    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    //  use this. to see other methods that can be override and select
    
    @Override
    public String toString() {

     return make +"\n"+model+"\n"+color+"\n"+year;

    } 
}