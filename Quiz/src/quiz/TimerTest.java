/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Syed Nouman Rehman
 */
public class TimerTest extends JFrame{
    Timer timer;
    int seconds=10;
    private JTextField _timeField;
    TimerTest()
    {
    
       this.setTitle("Text Clock 1");
        //this.pack();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(100,100));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
      //   timer = new Timer( perform action after these seconds , the listner which will perform action );
       timer = new Timer(1000,new listener() );//  perform action after  1 sec
       timer.start();
        _timeField = new JTextField(5);
        _timeField.setEditable(false);
        _timeField.setFont(new Font("sansserif", Font.PLAIN, 48));
        
        this.add(_timeField);
        this.setVisible(true);
    
    }
    
     class listener implements ActionListener 
    {
    	public void actionPerformed(ActionEvent e)
        {
            //  timer will execute this method after each seconds we give as in first argument
    		
            System.out.println("hello\n");
            seconds--;
            _timeField.setText(" "+seconds);
            if(seconds<=0)
            {
              timer.stop();
              
            }
            
       }
    }
     
    public static void main(String[] args) {
        
        new TimerTest();
       
    }
           
}


