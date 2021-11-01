/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutManagers;
 
import javax.swing.*;  
  
public class BoxLayoutExample1  
{  
  JButton buttons[];  
  JFrame fr = new JFrame();
  
  
 public BoxLayoutExample1() 
 {  
    buttons = new JButton [5];  
    
   for (int i = 0;i<5;i++) 
   {  
      buttons[i] = new JButton ("Button " + (i + 1));  
      fr.add (buttons[i]);  
    }  
  
    fr.setLayout (new BoxLayout (fr, BoxLayout.Y_AXIS));  
    fr.setSize(400,400);  
    fr.setVisible(true);
     
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
  
public static void main(String args[])
{  
    BoxLayoutExample1 b=new BoxLayoutExample1();  
}  
}