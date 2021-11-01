/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutManagers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;

/* 

FlowLayout()
Constructs a new FlowLayout with a centered alignment and a default 5-unit horizontal and vertical gap.

FlowLayout(int align)
Constructs a new FlowLayout with the specified alignment and a default 5-unit horizontal and vertical gap.

FlowLayout(int align, int hgap, int vgap)
Creates a new flow layout manager with the indicated alignment and the indicated horizontal and vertical gaps.
 */
public class Layout  extends JFrame
{
    public Layout()
    {
       this.setSize(700,300);
       this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        JButton Button1=new  JButton("Button1");
        JButton Button2=new  JButton("Button2");
        JButton Button3=new  JButton("Button3");
        JButton Button4=new  JButton("Button4");
        JButton Button5=new  JButton("Button5");
        JButton Button6=new  JButton("Button6");
        JButton Button7=new  JButton("Button7");
        JButton Button8=new  JButton("Button8");
        JButton Button9=new  JButton("Button9");
        JButton Button10=new  JButton("Button10");
        JButton Button11=new  JButton("Button11");
         
        Container mainContainer=this.getContentPane();
         mainContainer.setBackground(Color.YELLOW);
        
        this.setLayout(new BorderLayout(8,6));
       
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
        
        
        
        // top panel
        
        JPanel topPanel =new  JPanel();
        topPanel.setBorder(new LineBorder(Color.BLACK,3));
        topPanel.setBackground(Color.ORANGE);
        topPanel.setLayout(new FlowLayout(5));
        this.add(topPanel, BorderLayout.NORTH);
       
        
        topPanel.add(Button1);
        topPanel.add(Button2);
        topPanel.add(Button3);
        topPanel.add(Button4);
        
        
        
        
        // middle panel
        
        JPanel middlePanel =new  JPanel();
        middlePanel.setBorder(new LineBorder(Color.BLACK,3));
        middlePanel.setBackground(Color.CYAN);
        middlePanel.setLayout(new FlowLayout(4,4,4));
       
        JPanel gridPanel =new  JPanel();   //  inside  middlePanel
        gridPanel.setBorder(new LineBorder(Color.BLACK,3));
        gridPanel.setBackground(Color.RED);
        gridPanel.setLayout(new GridLayout(4,1,5,5));//  4 rows , 1 col , 
        
        gridPanel.add(Button5);
        gridPanel.add(Button6);
        gridPanel.add(Button7);
        gridPanel.add(Button8);
        
        JLabel label =new JLabel("Center Box",SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBorder(new LineBorder(Color.BLACK,3));
        
        middlePanel.add(gridPanel); 
        this.add(label);
        this.add(middlePanel,BorderLayout.WEST);
        
        
        // bottom panel
        
        JPanel  bottomPanel=new JPanel();
        bottomPanel.setLayout(new FlowLayout(3));
        bottomPanel.add(Button9);
        bottomPanel.add(Button10);
        bottomPanel.add(Button11);
        bottomPanel.setBackground(Color.MAGENTA);
        bottomPanel.setBorder(new LineBorder(Color.BLACK,3));
        
        this.add(bottomPanel,BorderLayout.SOUTH);
        
        
    }
    public static void main(String[] args) 
    {
       Layout a = new Layout();  
    }
    
}
