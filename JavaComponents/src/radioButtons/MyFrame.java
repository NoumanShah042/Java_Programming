/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radioButtons;

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

 JRadioButton pizzaButton;
 JRadioButton hamburgerButton;
 JRadioButton hotdogButton;
 ImageIcon pizzaIcon;
 ImageIcon hamburgerIcon;
 ImageIcon hotdogIcon;
 
 MyFrame(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLayout(new FlowLayout());
  
  //pizzaIcon = new ImageIcon("pizza.png");
  //hamburgerIcon = new ImageIcon("hamburger.png");
  //hotdogIcon = new ImageIcon("hotdog.png");
  
  pizzaButton = new JRadioButton("pizza");
  hamburgerButton = new JRadioButton("hamburger");
  hotdogButton = new JRadioButton("hotdog");
  
  /*
  ButtonGroup class is used to create a multiple-exclusion scope for a set
 of buttons. Creating a set of buttons with the same
 ButtonGroup object means that turning "on" one of those
 buttons turns off all other buttons in the group.
  
  */
  ButtonGroup group = new ButtonGroup(); // see button group in pdf "C:\Users\Syed Numan Rehman\Desktop\imp java\GUI\
                                                //GUI basic IN BOXES+common methods.pdf"
  group.add(pizzaButton);
  group.add(hamburgerButton);
  group.add(hotdogButton);
  
  pizzaButton.addActionListener(this);
  hamburgerButton.addActionListener(this);
  hotdogButton.addActionListener(this);
  
  //pizzaButton.setIcon(pizzaIcon);
  //hamburgerButton.setIcon(hamburgerIcon);
  //hotdogButton.setIcon(hotdogIcon);
  
  this.add(pizzaButton);
  this.add(hamburgerButton);
  this.add(hotdogButton);
  this.pack();
  this.setVisible(true);
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
     
     
  if(e.getSource()==pizzaButton) {
   System.out.println("You ordered pizza!");
  }
  else if(e.getSource()==hamburgerButton) {
   System.out.println("You ordered a hamburger!");
  }
  else if(e.getSource()==hotdogButton) {
   System.out.println("You ordered a hotdog!");
  }
 }
 
 
    public static void main(String[] args) {
        new MyFrame();
    }
}
