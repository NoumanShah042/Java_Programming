/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation2d;

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame{
	
	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}  
         

	public static void main(String[] args) 
        {
			
		new MyFrame();
		
	 
        }   
}