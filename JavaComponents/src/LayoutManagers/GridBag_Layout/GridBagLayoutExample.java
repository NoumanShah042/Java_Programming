/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutManagers.GridBag_Layout;

/**
 *
 * @author Syed Nouman Rehman
 */
  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
  
import javax.swing.*;  
public class GridBagLayoutExample extends JFrame
{  
   
    public GridBagLayoutExample()
    {  
        GridBagLayout   grid = new GridBagLayout();  
        this.setLayout(grid); 
        
        GridBagConstraints gbc = new GridBagConstraints();  
         //  where and how to add 
        
         // set the gcd 
         // and add(component, gcb) to frame
         
         
         // gcb setting will apply for all  
         // components if we do not reset it again
         
         
         //  gridx  -> consider it column
         //   gridy -> consider it row
         
         //*****************************************
         
        gbc.fill = GridBagConstraints.HORIZONTAL; //  fill the space if available
        
        gbc.weightx=0.5; // request for extra available space  horizantally
                         //  0 for normal ,  it will apply for all other after it
                         //   untila we reset it to 0
        gbc.gridx = 0;   // 0 column
        gbc.gridy = 0;   // 0 row
        this.add(new JButton("Button One"), gbc);  
        
        //*****************************************
        
        gbc.gridx = 1;  // 1  col 
        gbc.gridy = 0;  // 0 row
        this.add(new JButton("Button two"), gbc);  
        
        //*****************************************
        
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.ipady = 30;  //  i_pad_y    //increase vertically
        gbc.gridx = 0;  
        gbc.gridy = 1;  
        this.add(new JButton("Button Three"), gbc);  
         
        //*****************************************
        
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        this.add(new JButton("Button Four"), gbc);  
        
        //*****************************************
        
        gbc.gridx = 1;   //   col 1
        gbc.gridy = 2;   //   row 3
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridwidth = 2;  
        this.add(new JButton("Button Five"), gbc);  
        
         
        //*****************************************
        
        setTitle("GridBag Layout Example");  
        setSize(300, 300);  
        setPreferredSize(getSize());  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        //this.pack();
    }  
       public static void main(String[] args) 
    {  
            GridBagLayoutExample a = new GridBagLayoutExample();  
    }  
}  