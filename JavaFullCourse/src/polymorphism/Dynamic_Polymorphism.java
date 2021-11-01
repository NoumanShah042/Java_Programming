/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;
import java.util.Scanner;
/**
 *
 * @author Syed Nouman Rehman
 */
public class Dynamic_Polymorphism 
{
    
    //  poly means many shapes/ forms
    //  dynamic = after compilation (during runtime)
    
    
     public static void main(String[] args) 
     {

        //Dynamic Polymorphism

        Scanner scanner = new Scanner(System.in);
        Animal animal;  

        System.out.println("What animal do you want?"); 
        System.out.print("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if(choice==1)
        {
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2) {
         animal = new Cat();
         animal.speak();
        }
        else {
         animal = new Animal();
         System.out.println("That choice was invalid");
         animal.speak();
        }
 }
}
