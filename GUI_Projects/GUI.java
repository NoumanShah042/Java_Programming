
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class GUI {
    JFrame fr;
    JLabel lb;
    JTextField numText;
    JLabel lb2;
    JTextField sumText;
    JButton btn1;
    JButton btn2;
    BtnSumAction Sumhnd;
    BtnExitAction exithnd;
    
    Border border =BorderFactory.createLineBorder(Color.BLACK);
    GUI()
    {
    
       intitGUI();  
    }
    
    public void intitGUI()
    {
        
     btn1=new JButton("Sum");
    btn2=new JButton("Exit");
    numText=new JTextField();
    fr=new JFrame();
    sumText=new JTextField();
    fr=new JFrame();
    
    Sumhnd=new BtnSumAction(numText,sumText);
    BtnExitAction exithnd=new BtnExitAction();
    // fr.setBounds(200, 200, 200, 200);
  
    btn1.setBounds(300, 40, 80, 50);
    btn1.addActionListener(Sumhnd);
     btn2.setBounds(300, 110, 80, 50);
     btn2.addActionListener(exithnd);
    
    lb=new JLabel();
    lb.setText("Enter Number :");
    lb.setBounds(30, 40,100,50);
 //  lb.setBorder(border);
//    lb.setBackground(Color.YELLOW);
//    lb.setOpaque(true);
    lb.setForeground(Color.BLACK);
    
    
    lb2=new JLabel();
    lb2.setText("Sum of Digits :");
    lb2.setBounds(30,110,100,50);
 //  lb2.setBorder(border);
//    lb2.setBackground(Color.YELLOW);
//    lb2.setOpaque(true);
    lb2.setForeground(Color.BLACK);
    
    //numText.setPreferredSize(new Dimension(250,40));
    numText.setBounds(150, 40,100,50);
//    numText.setBackground(Color.GRAY);
//    numText.setOpaque(true);
     sumText.setBounds(150, 110,100,50);
    fr.add(lb);
    fr.add(numText);
    fr.add(lb2);
    fr.add(sumText);
    
    fr.add(btn1);
    fr.add(btn2);
     fr.setSize(500,250);
    fr.setLocationRelativeTo(null);
    fr.setLayout(null);
    fr.setVisible(true);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
