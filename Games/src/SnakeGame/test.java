/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakeGame;

import javax.swing.JFrame;

/**
 *
 * @author Syed Nouman Rehman
 */
public class test extends JFrame{

	test()
        {
			
		this.add(new panel());
		this.setTitle("hello");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
        
        public static void main(String[] args) 
        {
            new test();
        }
                
}
