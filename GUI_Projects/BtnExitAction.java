
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class BtnExitAction implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //e.equals(e);
        //System.out.println(e.getActionCommand());
        //System.out.println( e.paramString());
      
        //System.out.println(e.toString());
                
                
        System.exit(0);
    }
    
    
}
