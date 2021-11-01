/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UseOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Syed Nouman Rehman
 */
public class OPtionPane3 {
    
    public static void main(String[] args) {
        
        
        
        String[]  response={"ok","hello","no","how","thanks"};
        //JOptionPane.showOptionDialog(null, response, null, optionType, messageType, null, response, response)
        ImageIcon icon=new ImageIcon("smiley.png");
        JOptionPane.showOptionDialog(null, "you are awesome!", "secret msg", JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.INFORMATION_MESSAGE, icon, response, 3);
               //System.out.println(JOptionPane.showConfirmDialog(null, "hello", "title", JOptionPane.YES_NO_CANCEL_OPTION)); 
        
               
               JOptionPane.showMessageDialog(null, "useless info", "title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "useless info", "title", JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null, "useless info", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "useless info", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "useless info", "title", JOptionPane.ERROR_MESSAGE);

    }
}
