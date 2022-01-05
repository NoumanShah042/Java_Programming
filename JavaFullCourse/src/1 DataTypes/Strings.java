/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;  


/* 
 
//   https://www.javatpoint.com/java-string

Strings************************************************
The String data type is used to store a sequence of characters (text). 
String values must be surrounded by double quotes:

Example
String greeting = "Hello World";
System.out.println(greeting);

********************************************************
Note:

The String type is so much used and integrated in Java,
that some call it "the special ninth type".

A String in Java is actually a non-primitive data type, because it refers to an object.
The String object has methods that are used to perform certain operations on strings.
Don't worry if you don't understand the term "object" just yet. We will learn more about strings and objects in a later chapter.


 */

//*****************************************************************************************
//*****************************************************************************************


//    String Concept for JAVA

/*

Java String******************************************************************
In Java, string is basically an object that represents sequence of char values.
An array of characters works same as Java string. For example:

char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
String s=new String(ch); 

is same as:

String s="javatpoint";  
Java String class provides a lot of methods to perform operations 
on strings such as compare(), concat(), equals(), split(), length(), 
replace(), compareTo(), intern(), substring() etc.



*/

//*****************************************************************************************
//*****************************************************************************************

// Methods to create a string object?


/*

What is String in java

Generally, String is a sequence of characters. But in Java, string is an object
that represents a sequence of characters. The java.lang.String class is used to create a string object.

How to create a string object?
There are two ways to create String object:

By string literal
By new keyword


1) String Literal                *********************************************************************
Java String literal is created by using double quotes. For Example:

String s="welcome";  
Each time you create a string literal, the JVM checks the "string constant pool" first.
If the string already exists in the pool, a reference to the pooled instance is returned. 
If the string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:

String s1="Welcome";  
String s2="Welcome";    //It doesn't create a new instance  
 
In the above example, only one object will be created. Firstly, JVM will not find any string object 
with the value "Welcome" in string constant pool, that is why it will create a new object.
After that it will find the string with the value "Welcome" in the pool, it will not create a new object 
but will return the reference to the same instance.

Note: String objects are stored in a special memory area known as the "string constant pool".
Why Java uses the concept of String literal?
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).

2) By new keyword                ************************************************************************
String s = new String("Welcome");    //creates two objects and one reference variable

In such case, JVM will create a new string object in normal (non-pool) heap memory, 
and the literal "Welcome" will be placed in the string constant pool.
The variable s will refer to the object in a heap (non-pool).



*/


public class Strings {
    
    public static void main(String args[])
    {  
        String s1="java";//creating string by java string literal  
        
        char ch[]={'s','t','r','i','n','g','s'};  
        String s2=new String(ch);    //converting char array to string
        
        
        String s3 = new String("example"); //creating java string by new keyword  
        System.out.println(s1);  
        System.out.println(s2);  
        System.out.println(s3);  
    }
    
    /*
    
     String objects are immutable
    
    String st = new String("Geeky");
    st.concat("Shows");
    
    
    Once we create a String object we can't perform any change in
    existing object. If we are trying to perform any change with those
    changes a new object will be created. This non changeable
    behavior is nothing but immutability of String.
    
    
    */
    
    
}

