/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Syed Nouman Rehman
 */

class FontPanel extends JPanel
{
FontPanel()
{ setBackground(Color.white);
}

@Override
public void paintComponent(Graphics g)
{
    
super.paintComponent(g); // clear background
g.setFont(new Font("Serif", Font.BOLD, 12));
g.drawString("Serif 12 point bold.", 20, 50 );
g.setFont(new Font("Monospaced", Font.ITALIC, 24));
g.drawString("Monospaced 24 point italic.", 20, 100);
g.setColor(Color.blue);
g.setFont(new Font("SansSerif", Font.PLAIN, 14));
g.drawString("SansSerif 14 point plain.", 20, 150);
g.setColor(Color.red);
g.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 18));
g.drawString(g.getFont().getName() + " " + g.getFont().getSize() + " point bold italic.", 20, 200);
}
}


class Fonts extends JFrame
{
Fonts()
{ 
    setTitle("ShowFonts");
    setSize(500, 400);
    setLocation(200, 200);
    Container contentPane = getContentPane();
    contentPane.add(new FontPanel()); // default = "Center"
}
}
public class ShowFonts
{
public static void main(String [] args)
{
    JFrame jf = new Fonts();
    jf.setVisible(true);
}
}
