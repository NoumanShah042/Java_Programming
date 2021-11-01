/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Modifiers;

/**
 *
 * @author Syed Nouman Rehman
 */
public class Static_Practice {
    
     
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Static_Practice myObj = new Static_Practice(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }

}
  