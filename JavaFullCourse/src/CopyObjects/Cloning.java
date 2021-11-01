/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyObjects;

/*

Creating a copy using clone() method

* The class whose object’s copy is to be made must have a public clone method in it or in one of its parent class.

* Every class that implements clone() should call super.clone() to obtain the cloned object reference.

* The class must also implement java.lang.Cloneable interface whose object clone we want to create otherwise
    it will throw CloneNotSupportedException when clone method is called on that class’s object.

    Syntax:
      protected Object clone() throws CloneNotSupportedException

 */

class Abc implements Cloneable
{
    int i;
    int j;
    
    void display()
    {
        System.out.println("i = "+i+" , "+"j = "+j+ "\n");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone();  
    }
 
}
public class Cloning 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        
        Abc obj1=new Abc();
        obj1.i =5;
        obj1.j =6;
        
         Abc obj2 = (Abc) obj1.clone();
         obj2.i=12;  //  do not effect other object
         
         obj1.display();
         obj2.display();
    }
     
    
}

/*

Advantages of clone method:

1) If we use assignment operator to assign an object reference to another reference variable
    then it will point to same address location of the old object and no new copy of the object
    will be created. Due to this any changes in reference variable will be reflected in original object.

2) If we use copy constructor, then we have to copy all of the data over explicitly 
    i.e. we have to reassign all the fields of the class in constructor explicitly. 
    But in clone method this work of creating a new copy is done by the method itself.
    So to avoid extra processing we use object cloning.

*/