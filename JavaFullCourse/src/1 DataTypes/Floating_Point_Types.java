/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package DataTypes;

/* 
Float********************************************************
The float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
Note that you should end the value with an "f":

Example
float myNum = 5.75f;
System.out.println(myNum);

Double********************************************************
The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d":

Example
double myNum = 19.99d;
System.out.println(myNum);


Use float or double?*******************************************************

The precision of a floating point value indicates how many digits the value can have after the decimal point. 
The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits.
 Therefore it is safer to use double for most calculations.



Scientific Numbers  *******************************************************
A floating point number can also be a scientific number with an "e" 
to indicate the power of 10:

Example
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);



 */
public class Floating_Point_Types 
{
    public static void main(String[] args)
    {
        
        
        float f1 = 35e3f;
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);

    }
    
}
