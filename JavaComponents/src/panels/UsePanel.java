/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.*;
import javax.swing.*;

/* 

Again, don't use null layout since it makes updating and maintaining your GUI much more difficult than it should be, and can lead to ugly GUI's if you plan on having them run on multiple platforms. Instead

Use several JPanels, each one holding a core group of components and each using its best layout manager
Nest these JPanels in other JPanels that use the best layout manager to display them
and that will allow your GUI to be resizeable without need of extra code.
Put your JTextAreas in JScrollPanes so that you can see all text even if it goes beyond the text area.
Never set the size of the JTextArea as that will not allow it to scroll. Instead set its columns and rows.
As a very simple example, run this to see what I mean:
 */
public class UsePanel {
   public static void main(String[] args) {
      JTextArea chatArea = new JTextArea(8, 40);
      chatArea.setEditable(false);
      chatArea.setFocusable(false);
      JScrollPane chatScroll = new JScrollPane(chatArea);
      JPanel chatPanel = new JPanel(new BorderLayout());
      chatPanel.add(new JLabel("Chat:", SwingConstants.LEFT), BorderLayout.PAGE_START);
      chatPanel.add(chatScroll);

      JTextField inputField = new JTextField(40);
      JButton sendBtn = new JButton("Send");
      JPanel inputPanel = new JPanel();
      inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.LINE_AXIS));
      inputPanel.add(inputField);
      inputPanel.add(sendBtn);
/*
      Now say you want to change this and add another button, an "exit" JButton to the right of the send JButton. If you used null layout, you'd have to resize your GUI, you'd have to move the send button over to the left and make sure that your math was without error, etc. If you used layout managers, you'd need just two new lines of code (to change the display, not the functionality of course):
      
       JTextField inputField = new JTextField(40);
  JButton sendBtn = new JButton("Send");
  JButton exitBtn = new JButton("Exit"); // ***** added
  JPanel inputPanel = new JPanel();
  inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.LINE_AXIS));
  inputPanel.add(inputField);
  inputPanel.add(sendBtn);
  inputPanel.add(exitBtn);  // ***** added
      
      */
      JPanel youLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
      youLabelPanel.add(new JLabel("You:"));

      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
      mainPanel.add(chatPanel);
      mainPanel.add(Box.createVerticalStrut(10));
      mainPanel.add(youLabelPanel);
      mainPanel.add(inputPanel);

      JFrame frame = new JFrame("Foo");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(mainPanel);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}