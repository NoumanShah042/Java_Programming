/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.*; // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;
// An AWT program inherits from the top‐level container java.awt.Frame
public class AWTCounter extends JFrame{   // implements ActionListener 
    
    private JLabel lblCount; // Declare a JLabel component
    public JTextField tfCount; // Declare a TextField component
    private JButton btnCount; // Declare a Button component
    public int count = 0; // Counter's value
    // Constructor to setup GUI components and event handlers
    public AWTCounter ()
    {
        
            setLayout(new FlowLayout());
            // "super" Frame (a Container) sets its layout to FlowLayout, which arranges
            // the components from left‐to‐right, and flow to next row from top‐to‐bottom.
            lblCount = new JLabel("Counter"); // construct the Label component
            add(lblCount); // "super" Frame adds Label
            tfCount = new JTextField("0", 10); // construct the TextField component
            tfCount.setEditable(false); // set to read‐only
            add(tfCount); // "super" Frame adds TextField
            btnCount = new JButton("Count"); // construct the Button component
            add(btnCount); // "super" Frame adds Button
            btnCount.addActionListener(new BtnCountListener(this));
            // btnCount is the source object that fires ActionEvent when clicked.
            // The source add "this" instance as an ActionEvent listener, which provides
            // an ActionEvent handler called actionPerformed().
            // Clicking btnCount invokes actionPerformed().
            setTitle("AWT Counter"); // "super" Frame sets its title
            setSize(300, 100); // "super" Frame sets its initial window size
            // For inspecting the components/container objects
            // System.out.println(this);
            // System.out.println(lblCount);
            // System.out.println(tfCount);
            // System.out.println(btnCount);
            setVisible(true); // "super" Frame shows
            // System.out.println(this);
            // System.out.println(lblCount);
            // System.out.println(tfCount);
            // System.out.println(btnCount);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
// The entry main() method
    public static void main(String[] args) 
    {
            // Invoke the constructor to setup the GUI, by allocating an instance
            AWTCounter app = new AWTCounter();
            // or simply "new AWTCounter();" for an anonymous instance
    }
// ActionEvent handler ‐ Called back upon button‐click.
//    @Override
//    public void actionPerformed(ActionEvent evt) {
//            ++count; // increase the counter value
//            // Display the counter value on the TextField tfCount
//            tfCount.setText(count + ""); // convert int to String
//    }
}

// use separarte class
 class BtnCountListener implements ActionListener 
 {
        AWTCounter frame;
        public BtnCountListener(AWTCounter frame)
        {
            this.frame = frame;
        }
        
        @Override
        public void actionPerformed(ActionEvent evt) 
        {
            frame.count++;
            frame.tfCount.setText(frame.count + "");
        }
}