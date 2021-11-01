package Inheritance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */

class Person {

        String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
        @Override
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
	
}//******************************************
  class Hero extends Person{


	String power;
	
	Hero(String name,int age,String power){	
		super(name,age);
		this.power = power;
                
               // this.name = name;    //  this is possible but we should initialize var in its own class
                //this.age = age;
	}
	
        @Override
	public String toString() {
		return super.toString()+this.power;
	}
}//******************************************

public class super_keyword {
    public static void main(String[] args) {
		
		// super = 	keyword refers to the superclass (parent) of an object
		//			very similar to the "this" keyword
		
		Hero hero1 = new Hero("Batman",42,"$$$");
		Hero hero2 = new Hero("Superman",43,"everything");
		
		System.out.println(hero2.toString());
		
	}
}
  