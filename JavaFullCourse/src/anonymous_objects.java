/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Syed Nouman Rehman
 */
public class anonymous_objects {
    public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		/*
		ImageIcon AC = new ImageIcon("src\\cards\\1.png");
		JLabel AClabel = new JLabel(AC);
		deck.add(AClabel);
		
		ImageIcon TwoC = new ImageIcon("src\\cards\\2.png");
		JLabel TwoClabel = new JLabel(TwoC);
		deck.add(TwoClabel);
		
		... repeat for all 52 cards :(
		*/
		
		for(int i =1;i<=64;i++) {
			//deck.add(new JLabel(new ImageIcon("src\\cards\\"+i+".png")));  // bro code
                          deck.add(new JLabel(new ImageIcon("("+i+").png"))); // shi ha
                        
                        
                        //deck.add(new JLabel(new ImageIcon("C://Users//Syed Numan Rehman//Desktop//JavaFullCourse//PNG//(" + i + ").png")));
                        
                      
                       // C://Users//Syed Numan Rehman//Desktop//JavaFullCourse//PNG//("+i+").png"
                        //  "C:\Users\Syed Numan Rehman\Desktop\JavaFullCourse\PNG\("+i+").png
			frame.add(deck.get(i-1));
		}
			
		//frame.add(deck.get(0));
		//frame.add(deck.get(1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}
