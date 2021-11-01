/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

/* 

Bitwise and
   0 & 0 = 0
   0 & 1 = 0
   1 & 0 = 0
   1 & 1 = 1
 

Bitwise or
   0 | 0 = 0
   0 | 1 = 1
   1 | 0 = 1
   1 | 1 = 1


 */
public class Bitwise_and_or {
    public static void main(String[] args) {
        
        int a=25;        //   1 1 0 0 1
        int b=15;        //   0 1 1 1 1
        
        int and =a & b;  //   0 1 0 0 1    = 9
    
        int or = a | b; //    1 1 1 1 1    = 31
        
        System.out.println("and =" + and + ", or ="+or);
    
    }
}


class Left_Shift_Operator
{  
    //  left shift  10<<2   
    //      shift left 2 zeros and append 2 zeros at right
    public static void main(String args[]){  
        
    System.out.println(10<<2);//10*2^2=10*4=40     1010. shift left 2 bits (1010--.)and append 2 zeros = 101000.  = 2  
    System.out.println(10<<3);//10*2^3=10*8=80  
    System.out.println(20<<2);//20*2^2=20*4=80  
    System.out.println(15<<4);//15*2^4=15*16=240  
    
    
    }
}  

// The Java right shift operator >> is used to move left operands value to right 
// by the number of bits specified by the right operand.

class Right_Shift_Operator
{   
    //  right shift operator shift right and append zeros at left
    public static void main(String args[]){  
        System.out.println(10>>2);//10/2^2=10/4=2        1010 shift right 2 bits = 0010  = 2  
        System.out.println(20>>2);//20/2^2=20/4=5  
        System.out.println(20>>3);//20/2^3=20/8=2  
    }

} 