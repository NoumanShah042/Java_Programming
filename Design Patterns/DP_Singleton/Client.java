package DP_Singleton;

 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anzar
 */
public class Client {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//        Singleton s2 = new Singleton();
//        
//        System.out.println("Singleton X value = "+s1.x);
//        System.out.println("Singleton X value = "+s2.x);


        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        
        




    }
}
