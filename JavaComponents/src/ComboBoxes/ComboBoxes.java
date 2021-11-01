package ComboBoxes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxes extends JFrame implements ActionListener{

 JComboBox comboBox;
 
 ComboBoxes(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLayout(new FlowLayout()); 
  
  
  /*
  
  Sometimes you must use wrapper classes, for example when working with Collection objects,
  such as ArrayList, where primitive types cannot be used (the list can only store objects):
  */
  // use wrapper classes for passing to  comboBox like Integer Double
  
  String[] animals = {"dog","cat","bird"};
  comboBox = new JComboBox(animals);
  comboBox.addActionListener(this);
  
  //comboBox.setEditable(true);
  //System.out.println(comboBox.getItemCount());
  //comboBox.addItem("horse");
  //comboBox.insertItemAt("pig", 0); // insert item at index 0 
  //comboBox.setSelectedIndex(0); // select index 0 when it run 
  //comboBox.removeItem("cat");
  //comboBox.removeItemAt(0);
  //comboBox.removeAllItems();
  
//   Object a= new Integer(1);
//     System.out.println(a);
  this.add(comboBox);
  this.pack();
  this.setVisible(true);
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
  if(e.getSource()==comboBox) {
   System.out.println(comboBox.getSelectedItem());
   //System.out.println(comboBox.getSelectedIndex());
  }
 }
    public static void main(String[] args) {
        new  ComboBoxes();
    }
 
}
