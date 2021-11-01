/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorChooser;

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{


	JButton button;
	JLabel label;
	
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text :D");
		label.setFont(new Font("MV Boli",Font.PLAIN,100));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			      //  JColorChooser.showDialog(Component component, String title, Color initialColor)
			Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);
			
			label.setForeground(color);
			//label.setBackground(color);
		}
	}
        
        
        public static void main(String[] args) {
	
		// JColorChooser = A GUI mechanism that let's a user choose a color
		
		new MyFrame();
	}
}

