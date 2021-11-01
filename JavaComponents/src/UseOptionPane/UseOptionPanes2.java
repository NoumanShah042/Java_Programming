/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UseOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author Syed Nouman Rehman
 */
public class UseOptionPanes2 
{
        public static void main(String[] args) 
        {
            
                String ageText = JOptionPane.showInputDialog(null,"How old are you?");
                 int age = Integer.parseInt(ageText);

                
                 String moneyText = JOptionPane.showInputDialog(null,
                "How much money do you have?");
                 double money = Double.parseDouble(moneyText);

                 JOptionPane.showMessageDialog(null,  "If you can double your money each year,\n" +
                         "You'll have " + (money * 32) + "dollars at age " + (age + 5) + "!");
                
        }
 }