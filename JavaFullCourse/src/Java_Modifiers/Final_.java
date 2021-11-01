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
public class Final_ {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Final_ myObj = new Final_();
 //   myObj.x = 50; // will generate an error: cannot assign a value to a final variable
 //   myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
 