/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textComponents;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

//            JTextArea
/* 

    //  commonly used methods

    void setRows(int rows)	           It is used to set specified number of rows.
    void setColumns(int cols)	          It is used to set specified number of columns.
    void setFont(Font f)	                    It is used to set the specified font.
    void insert(String s, int position)	   It is used to insert the specified text 
                                                 on the specified position.
    void append(String s)	           It is used to append the given text to the end of the document.

    setLineWrap(boolean wrap)               Sets the line-wrapping policy of the text area.
   setWrapStyleWord(boolean word)    Sets the style of wrapping used if the text area is wrapping lines.

 */
public class TextArea {
    public static void main ( String[] args )
{
     JFrame frame = new JFrame ();
    JPanel middlePanel = new JPanel ();
    middlePanel.setBorder ( new TitledBorder( new EtchedBorder (), "Display Area" ) );

    // create the middle panel components
   
    //   JTextArea constructors
    
    //  JTextArea()
    //   JTextArea(String s);
    //   JTextArea(int row, int column)
    //  JTextArea(String s, int row, int column)
    
    JTextArea textArea = new JTextArea( 16, 58 );
    textArea.setEditable ( true );  
    textArea.setLineWrap(true);   //  Sets the line-wrapping policy
    textArea.setWrapStyleWord(true);
    JScrollPane scroll = new JScrollPane ( textArea );
    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

    //Add Textarea in to middle panel
    middlePanel.add ( scroll );
     
     
   
    frame.add ( middlePanel );
    frame.pack ();
    frame.setLocationRelativeTo ( null );
    frame.setVisible ( true );
}
}

