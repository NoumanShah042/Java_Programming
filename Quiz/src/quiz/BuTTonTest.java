/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

/**
 *
 * @author Syed Nouman Rehman
 */
import java.awt.event.*;
import javax.swing.*;

public class BuTTonTest extends JFrame
{
    private JLabel result;
    BuTTonTest()
    {
        timer.start();
        setTitle("BuTTonTest");
        JLabel lab = new JLabel("Click one of the buttons.");
        add(lab, "North");
        result = new JLabel(" ");
        add(result, "South");
        JButton yes = new JButton("Yes");
        add(yes, "West");
        yes.addActionListener(new YesHandler());
        JButton no = new JButton("No");
        add(no, "East");
        no.addActionListener(new NoHandler());
    }
    class YesHandler implements ActionListener
    {
                @Override
                public void actionPerformed(ActionEvent evt)
                { result.setText("You pressed the Yes button.");
                
                          
                }
    }
    class NoHandler implements ActionListener
    {
            @Override
            public void actionPerformed(ActionEvent evt)
            { 
                result.setText("You pressed the No button."); 
            }
    }
      int seconds=10;
        Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
                           
			System.out.println("running time "+seconds);
                        if(seconds<=0) 
                        {
                                stooop()	;
                        }
			
			}
		});
        void stooop()
        {
        
          // timer.stop();
        }
        
    public static void main(String [] args)
    {     
        
        
//        BuTTonTest a=new BuTTonTest();
//        System.out.println("hello");
//         a.time();
//         System.out.println("hello");
//               JFrame jf = new BuTTonTest();
//                jf.setSize(250, 150);
//                jf.setVisible(true);
    }
}
