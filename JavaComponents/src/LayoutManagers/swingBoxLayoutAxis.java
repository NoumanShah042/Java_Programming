/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutManagers;

/**
 *
 * @author Syed Nouman Rehman
 */
/*
 * A swing BoxLayout example with different Boxlayout axis parameters
 * BoxLayout.X_AXIS, BoxLayout.Y_AXIS respectively.
 * Also add spaces between components.
 */
 
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 
import java.awt.Insets;
import java.awt.Dimension;
 
public class swingBoxLayoutAxis
{
 
    public static void main(String[] args) 
    {
         
        JFrame frame = new JFrame("BoxLayout Example X_AXIS");
        
        // Set the panel to add buttons
        JPanel panel = new JPanel();
     panel.setBounds(0,0,500,500);
         
        // Set the BoxLayout to be X_AXIS: from left to right
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
         
        // Set the Boxayout to be Y_AXIS from top to down
        //BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
 
        panel.setLayout(boxlayout);
         
        // Set border for the panel
       // panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
        //panel.setBorder(new EmptyBorder(new Insets(50, 80, 50, 80)));     
         
        // Define new buttons
        JButton jb1 = new JButton("Button 1");
        jb1.setSize(100, 100);
        JButton jb2 = new JButton("Button 2");
        jb2.setSize(100, 100);
        JButton jb3 = new JButton("Button 3");
        jb3.setSize(100, 100);
         
        // Add buttons to the frame (and spaces between buttons)
        panel.add(jb1);
        //panel.add(Box.createRigidArea(new Dimension(0, 60)));     
        panel.add(jb2);
        //panel.add(Box.createRigidArea(new Dimension(0, 60)));
        panel.add(jb3);
         
        // Set size for the frame
        //frame.setSize(300, 300);
         
        // Set the window to be visible as the default to be false
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
 
}