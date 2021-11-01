/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgressBar;

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,100);//(min,max)
	
	ProgressBarDemo(){
		
		bar.setValue(0); // starting value
		bar.setBounds(30,50,300,30);
               // bar.setSize(200,50);
		bar.setStringPainted(true);  // show percentage on bar
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
			
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		//frame.setLayout(new FlowLayout());
                frame.setLayout(null);
		frame.setVisible(true);
		//fill();
                drain();
		//fill();
	}
	
	public void fill() {
		int counter =0;
		
		while(counter<=100) {
			
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=1;  // increase percentage by 1 %
		}
		bar.setString("Done! :)");
	}
        public void drain() {
            
		int counter =100;
               // bar.setValue(1000);
		// bar.setStringPainted(false);  // show percentage on bar
		//bar.setString("");

               // bar.setStringPainted(true);
		while(counter>=0) {
			//bar.setStringPainted;
			bar.setValue(counter);
			try 
                        {
				Thread.sleep(50);
			}
                        catch (InterruptedException e) 
                        {
				e.printStackTrace();
			}
                        
			counter -=1;  // decrease percentage by 1 %
		}
		bar.setString("!!!");
	}
        
        
        
        public static void main(String[] args) {
        
    	ProgressBarDemo demo = new ProgressBarDemo();
        
    }
}
