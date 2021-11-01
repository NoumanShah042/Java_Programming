/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakeGame;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Syed Nouman Rehman
 */
public class panel extends JPanel
{
    @Override 
    public void paintComponent(Graphics g) 
    {
       super.paintComponent(g);
       
        g.drawOval(50, 50, 50, 50); // <-- draws an oval on the panel
        g.drawRect(0, 0, 100, 100);
        
    }
}
