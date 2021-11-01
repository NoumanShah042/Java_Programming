/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileChooser;

/**
 *
 * @author Syed Nouman Rehman
 */


import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.*;

public class choosefile extends JFrame implements ActionListener{

	JButton button;
	String line;
	choosefile(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("C:\\Users\\Syed Numan Rehman\\Desktop")); //sets current directory
			
                        
                        //  the following will return 0 (JFileChooser.APPROVE_OPTION) 
                        // if seccessfully chose file otherwise return 1
			int response = fileChooser.showOpenDialog(null); //select file to open
			//int response = fileChooser.showSaveDialog(null); //select file to save
			
			if(response == JFileChooser.APPROVE_OPTION)
                        {
				//File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				//System.out.println(file);
                               Scanner input=new Scanner(System.in);
                            // first write into a file and then display it
                             try
                               { 
                                  File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                                    System.out.println(file);
                                   FileWriter fw=new FileWriter(file,true);
                                   PrintWriter pw=new  PrintWriter(fw);
                                 line="";
                                 while(!line.equalsIgnoreCase("quit"))
                                 {
                                    line= input.nextLine();
                                      pw.println(line);
                                 
                                 }
                                   

                                   pw.close();
                                   fw.close();
                               } 
       
                            catch (Exception ex)
                             {

                                ex.printStackTrace();
                             }
                            
                                try 
                               {  //  read a file
                                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                                    System.out.println(file);
                                    FileReader fr =new FileReader(file);
                                    BufferedReader br= new BufferedReader(fr);

                                     line=br.readLine();
                                     while(line!=null)
                                     {
                                          System.out.println(line);
                                          line=br.readLine();
                                     }
                                     br.close();
                                     fr.close();
                               }
                               catch (Exception ex)
                               {
                                    ex.printStackTrace();
                               }
                                
                                
			}
		}
	}
        
        
        public static void main(String[] args) {
	
		// JFileChooser = A GUI mechanism that let's a user choose a file (helpful for opening or saving files)
		
		new choosefile();
	}
                
                
}


