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
import javax.swing.*;  
import java.awt.event.*;  
public class TextAreaExample implements ActionListener{  
JLabel l1,l2;  
JTextArea area;  
JButton b;  
TextAreaExample() {  
    JFrame f= new JFrame();  
    l1=new JLabel();                  // labels
    l1.setBounds(50,25,100,30);  
    l2=new JLabel();  
    l2.setBounds(160,25,100,30);  
    area=new JTextArea();            //  textarea
    area.setBounds(20,75,250,200);  
    b=new JButton("Count Words");  //  button
    b.setBounds(100,300,120,30);  
    b.addActionListener(this);  
    f.add(l1);
    f.add(l2);f.add(area);f.add(b);  
    f.setSize(450,450);  
    f.setLayout(null);  
    f.setVisible(true);  
}  

/*

The string \s is a regular expression that means "whitespace", 
and you have to write it with two backslash characters ( "\\s" ) when writing it as a string in Java.



The Difference Between \s and \s+

The plus sign + is a greedy quantifier, which means one or more times.
For example, expression X+ matches one or more X characters. Therefore,
the regular expression \s matches a single whitespace character,
while \s+ will match one or more whitespace characters.


\s stands for “whitespace character”. Again, which characters this actually includes, 
depends on the regex flavor. In all flavors discussed in this tutorial, 
it includes [ \t\r\n\f]. That is: \s matches a space,
 a tab, a carriage return, a line feed, or a form feed.


*/
public void actionPerformed(ActionEvent e){  
    String text=area.getText();  
    String words[]=text.split("\\s");  
    l1.setText("Words: "+ words.length);  
    l2.setText("Characters: "+text.length());  
}  
public static void main(String[] args) {  
    new TextAreaExample();  
}  
}  