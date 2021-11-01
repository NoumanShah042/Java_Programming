/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrickBraker;

import javax.swing.*;

/**
 *
 * @author Syed Nouman Rehman
 */
public class brickBraker {
    public static void main(String[] args) {
        JFrame frame=new  JFrame();
        frame.setBounds(10,10,700,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new GamePlay());
    }
}
