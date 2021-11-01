/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checboxes;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.*;

/**
 *
 * @author Syed Nouman Rehman
 */
public class AllComponents extends JFrame{
 
    AllComponents()
    {
        initGUI();
    }

  

   void initGUI()
   {
            this.setTitle("hello") ;
            this.setLayout(new FlowLayout());
            this.setSize(1200,500);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
                // Create a button with text OK
            JButton jbtOK = new JButton("OK");
           // jbtOK.setSize(100, 100);
            // Create a label with text "Enter your name: "
            JLabel jlblName = new JLabel("Enter your name: ");
            // Create a text field with text "Type Name Here"
            JTextField jtfName = new JTextField("Type Name Here");
            // Create a check box with text bold
            JCheckBox jchkBold = new JCheckBox("Bold");
            //jchkBold.setText("select");
            // Create a radio button with text red
            JRadioButton jrbRed = new JRadioButton("Red");
            //jrbRed.setText("radio");
            // Create a combo box with choices red, green, and blue
            JComboBox jcboColor = new JComboBox(new String[]{"Red","Green", "Blue"});
            
           // this.pack();
            this.add(jbtOK);
            this.add(jlblName);
            this.add(jtfName);
            this.add(jrbRed);
            this.add(jchkBold);
            this.add(jcboColor);
              this.pack();
   }
  
     
    public static void main(String[] args) {
        AllComponents a=new AllComponents();
    }


}
