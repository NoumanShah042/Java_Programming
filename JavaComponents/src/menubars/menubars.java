/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menubars;

/**
 *
 * @author Syed Nouman Rehman
 */

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class menubars extends JFrame implements ActionListener{

	JMenuBar menuBar;   //  this is only a bar
	JMenu fileMenu;    //  these are menu which will show on JMenuBar
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;   //  these are items which will 
	JMenuItem saveItem;
	JMenuItem exitItem;
	//ImageIcon loadIcon;
	//ImageIcon saveIcon;
	//ImageIcon exitIcon;
	
	menubars(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setLayout(new FlowLayout());
		
		//loadIcon = new ImageIcon("load.png");
		//saveIcon = new ImageIcon("save.png");
		//exitIcon = new ImageIcon("exit.png");
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File"); 
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		//loadItem.setIcon(loadIcon);
		//saveItem.setIcon(saveIcon);
		//exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar); //  instead of using "add" we use setJMenuBar
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			System.out.println("*beep boop* you loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("*beep boop* you saved a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}
        
        public static void main(String[] args) {
        
            new menubars();
    }
}
