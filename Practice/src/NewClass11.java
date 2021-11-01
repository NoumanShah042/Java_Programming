
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class NewClass11 {

    public static void main(String[] args) {
        JPanel panel_1 = new JPanel();
        ImageIcon Image;
        Image = new ImageIcon("1.jpg");
        JButton btn_1 = new JButton();
        btn_1.setBounds(0, 0, 300, 200);
        btn_1.setIcon(Image);
        JLabel label_1 = new JLabel("120000");
        label_1.setBackground(Color.GREEN);
        label_1.setOpaque(true);
        label_1.setBounds(0, 200, 300, 50);
        label_1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        panel_1.setLayout(null);
        panel_1.setBackground(Color.BLACK);
        panel_1.setOpaque(true);
        // panel_1.setSize(300,250);
        panel_1.add(btn_1);
        panel_1.add(label_1);
        //****************************************
        ImageIcon image2;
        image2 = new ImageIcon("2.jpg");
        JButton btn_2 = new JButton();
        btn_2.setBounds(0, 0, 300, 200);
        btn_2.setIcon(Image);
        JLabel label_2 = new JLabel("120000");
        JPanel panel_2 = new JPanel();
        //  btn_2.setPreferredSize(new Dimension(300,200));
        //  btn_1.addActionListener(this);
        // label_1.setPreferredSize(new Dimension(300,50));
        label_2.setBackground(Color.GREEN);
        label_2.setOpaque(true);
        label_2.setBounds(0, 200, 300, 50);
        label_2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        panel_2.setLayout(null);
        panel_2.setBackground(Color.BLACK);
        panel_2.setOpaque(true);
        panel_2.setSize(300, 250);
        panel_2.add(btn_2);
        panel_2.add(label_2);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 4));
        frame.setSize(1200, 600);
        frame.add(panel_1);
        frame.add(panel_2);
        //frame.pack();
        frame.setVisible(true);
    }
    
}
