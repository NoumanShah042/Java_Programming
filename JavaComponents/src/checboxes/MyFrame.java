/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checboxes;

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
        JToggleButton a;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("Smiley-26_48.png");
		checkIcon = new ImageIcon("Smiley-7_48.png");
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
               
                 a = new JToggleButton("hello");
               
		checkBox = new JCheckBox();
               
                //checkBox.setHorizontalAlignment(10);
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,20));
		//checkBox.setIcon(xIcon);
		//checkBox.setSelectedIcon(checkIcon);
		
		this.add(button);
		this.add(checkBox);
                this.add(a);
		this.pack();
		this.setVisible(true);
                //this.setSize(500,500);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
                        System.out.println(a.isSelected());
		}
	}
        public static void main(String[] args) {
        
            new MyFrame();
    }
}




