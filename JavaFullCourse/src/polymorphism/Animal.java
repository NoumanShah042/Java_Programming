/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Syed Nouman Rehman
 */
public class Animal 
{
     public void speak()
    {
        System.out.println("animal goes *brrrr*");
    }
}


//***********************************************
class Dog extends Animal
{

    @Override
    public void speak() {
     System.out.println("dog goes *bark*");
    }
}
//***********************************************
class Cat extends Animal
{

    @Override
    public void speak()
    {
        System.out.println("cat goes *meow*");
    }
}