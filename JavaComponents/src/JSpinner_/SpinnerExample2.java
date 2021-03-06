/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSpinner_;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Syed Nouman Rehman
 */
public class SpinnerExample2 {
    public static void main(String[] args) 
    {
            JFrame f =new JFrame();
            JLabel label =new JLabel();

            label.setHorizontalAlignment(JLabel.CENTER);    
            label.setSize(250,100);    
            SpinnerModel value =  
             new SpinnerNumberModel(5, //initial value  
                                    0, //minimum value  
                                    10, //maximum value  
                                    1); //step  
            
            JSpinner spinner = new JSpinner(value);
            spinner.setBounds(100,100,50,30);    
             spinner.addChangeListener(new ChangeListener() 
            {  
                 public void stateChanged(ChangeEvent e) 
                 {  
                    // System.out.println(spinner.getValue());
                     label.setText("Value : " + ((JSpinner)e.getSource()).getValue());  
                 }  
            });  
             
             
            f.add(spinner); 
            f.add(label);  
            f.setSize(300,300);    
            f.setLayout(null);    
            f.setVisible(true);     
           
    }
}
