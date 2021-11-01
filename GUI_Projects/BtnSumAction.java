
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class BtnSumAction implements ActionListener{
    
   

    JTextField numtext;
    JTextField sumText;
    public BtnSumAction(JTextField num,JTextField sum)
    {
             numtext=num;
             sumText=sum;
    
    }
    public int addDigits(int n)
    {       int s=0;
            int dig;
            while(n>0)
             {
                  dig=n%10;
                     s=s+dig;
                   n=n/10;
                }
            return s;
    }
    //numtext=num;
          //   sumText=sum;
    @Override
    public void actionPerformed(ActionEvent e) 
    {
      
        int num=Integer.parseInt(numtext.getText());
         int sum=addDigits(num);
         
         sumText.setText(Integer.toString(sum));
        
    }
    
   
}

