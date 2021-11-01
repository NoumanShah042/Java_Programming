/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakeGame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.*;

public class AwtAdapterDemo 
{
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtAdapterDemo()
   {
      prepareGUI();
   }

   public static void main(String[] args){
      AwtAdapterDemo  awtAdapterDemo = new AwtAdapterDemo();        
      awtAdapterDemo.showKeyAdapterDemo();
   }

   private void prepareGUI()
   {
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() 
      {
         @Override
         public void windowClosing(WindowEvent windowEvent)
         {
            System.exit(0);
         }        
      });    
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showKeyAdapterDemo()
   {
        headerLabel.setText("Listener in action: KeyAdapter");      

        final TextField textField = new TextField(10);

        textField.addKeyListener(new KeyAdapter()
        {
           @Override
           public void keyPressed(KeyEvent e) 
           {                
              if(e.getKeyCode() == KeyEvent.VK_ENTER){
                 statusLabel.setText("Entered text: " + textField.getText());
              }
           }        
        });
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() 
        {
           public void actionPerformed(ActionEvent e) 
           {
              statusLabel.setText("Ok : " + textField.getText());                
           }

           
        });

        controlPanel.add(textField);
        controlPanel.add(okButton);    
        mainFrame.setVisible(true);  
   }
}