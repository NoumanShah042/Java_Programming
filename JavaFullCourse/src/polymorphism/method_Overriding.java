package polymorphism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class method_Overriding {
    public static void main(String[] args) {
		
		// method overriding = 	Declaring a method in sub class,
		//			which is already present in parent class.
		//			done so that a child class can give its own implementation
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		dog.speak();
				
	}
}
 