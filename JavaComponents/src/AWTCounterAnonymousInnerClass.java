import java.awt.*;
import java.awt.event.*;
// An AWT GUI program inherits from the top‐level container java.awt.Frame
public class AWTCounterAnonymousInnerClass extends Frame 
{
        // This class is NOT a ActionListener, hence, it does not implement ActionListener interface
        // The event‐handler actionPerformed() needs to access these private variables
        private TextField tfCount;
        private Button btnCount;
        private int count = 0;
        // Constructor to setup the GUI components and event handlers
        public AWTCounterAnonymousInnerClass () 
        {
                setLayout(new FlowLayout()); // "super" Frame sets to FlowLayout
                add(new Label("Counter")); // An anonymous instance of Label
                tfCount = new TextField("0", 10);
                tfCount.setEditable(false); // read‐only
                add(tfCount); // "super" Frame adds tfCount
                btnCount = new Button("Count");
                add(btnCount); // "super" Frame adds btnCount
                
                
                // Construct an anonymous instance of an anonymous class.
                // btnCount adds this instance as a ActionListener.
                btnCount.addActionListener(  new ActionListener() {
                    
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                        ++count;
                        tfCount.setText(count + "");
                        }
                }   
                );
                
                
                
                setTitle("AWT Counter");
                setSize(250, 100);
                setVisible(true);
        }
        
        // The entry main method
            public static void main(String[] args) 
            {
                    new AWTCounterAnonymousInnerClass(); // Let the constructor do the job
            }
}


/*

    The above codes is equivalent to and compiled as:


    private class N implements ActionListener    // N is a running number of the inner classes created
    {  
        @Override
        public void actionPerformed(ActionEvent evt)
        {
                ++count;
                tfCount.setText(count + "");
        }
    } 


    btnCount.addActionListener(new N());
    // Or
    N n = new N()
    btnCount.addActionListener(n);



*/