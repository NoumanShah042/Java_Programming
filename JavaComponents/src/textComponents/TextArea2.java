/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textComponents;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Syed Nouman Rehman
 */
public class TextArea2 extends JFrame{
   
 public TextArea2()
    {
        setBounds(100, 100, 491, 310);
        getContentPane().setLayout(null);

        JTextArea textField = new JTextArea();
        textField.setEditable(false);

        String str = "";
        for (int i = 0; i < 50; ++i)
        { 
            str += "Some text\n";
        }
        
        textField.setText(str);

        JScrollPane scroll = new JScrollPane(textField);
        scroll.setBounds(10, 11, 455, 249);                     // <-- THIS

         add(scroll);
        setLocationRelativeTo ( null );
        // pack ();
         setSize(500,500);
         setVisible ( true );
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TextArea2();
    }
}