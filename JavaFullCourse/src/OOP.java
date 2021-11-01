/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class OOP {
    public static void main(String[] args) {
		
		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Morty",16,50);
			
		human1.drink();
		human2.eat();
		
	}
} 

//  we should include 
class Human {

	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}