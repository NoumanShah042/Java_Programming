/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textComponents;

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class SwingControlDemo 
{
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingControlDemo(){
      prepareGUI();
   }
   
   private void prepareGUI(){
      mainFrame = new JFrame("Java Swing Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() 
      {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showTextAreaDemo()
   {
      headerLabel.setText("Control in action: JTextArea"); 
      JLabel  commentlabel= new JLabel("Comments: ", JLabel.RIGHT);
      
      final JTextArea commentTextArea = 
         new JTextArea("This is a Swing tutorial " 
         +"to make GUI application in Java.",5,20);

      JScrollPane scrollPane = new JScrollPane(commentTextArea);    
      JButton showButton = new JButton("Show");

      showButton.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {     
            statusLabel.setText( commentTextArea.getText());        
         }
      }); 
      controlPanel.add(commentlabel);
      controlPanel.add(scrollPane);        
      controlPanel.add(showButton);
      mainFrame.setVisible(true);  
   }
   
   public static void main(String[] args)
   {
      SwingControlDemo  swingControlDemo = new SwingControlDemo(); //  our class in which we are     
      swingControlDemo.showTextAreaDemo();
   }
}