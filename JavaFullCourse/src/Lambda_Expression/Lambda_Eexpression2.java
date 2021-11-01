/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_Expression;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Syed Nouman Rehman
 */
public class Lambda_Eexpression2
{
    public static void main(String[] args) {
		
		MyFrame myFrame = new MyFrame();
	}

}
class MyFrame extends JFrame{

	JButton myButton = new JButton("MY BUTTON 1");
	JButton myButton2 = new JButton("MY BUTTON 2");
	
	MyFrame(){
		
		myButton.setBounds(100, 100, 200, 100);
                
//                myButton.addActionListener(new ActionListener()
//                {
//                    @Override
//                    public void actionPerformed(ActionEvent ae) {
//                         System.out.println("This is the first button");
//                    }
//                });
//                
                
                
		myButton.addActionListener(
			
			(e) -> System.out.println("This is the first button")
						
		);	
		
		myButton2.setBounds(100, 200, 200, 100);
		myButton2.addActionListener(
			
			(e) -> System.out.println("This is the second button")
						
		);	
	
		this.add(myButton);
		this.add(myButton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
	}
}