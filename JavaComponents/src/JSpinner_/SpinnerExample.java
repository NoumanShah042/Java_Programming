/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSpinner_;

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;    
public class SpinnerExample {  
    public static void main(String[] args)
    {    
    JFrame f=new JFrame("Spinner Example");    
    Container mainContainer=f.getContentPane();
         mainContainer.setBackground(Color.YELLOW);
    
    SpinnerModel value =  
             new SpinnerNumberModel(5, //initial value  
                0, //minimum value  
                10, //maximum value  
                1); //step  
    JSpinner spinner = new JSpinner(value);   
            spinner.setBounds(100,100,50,30);    
            f.add(spinner);    
            f.setSize(300,300);    
            f.setLayout(null);    
            f.setVisible(true);     
}  
}
