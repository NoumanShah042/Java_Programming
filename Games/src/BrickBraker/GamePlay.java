/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrickBraker;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/**
 *
 * @author Syed Nouman Rehman
 */
public class GamePlay extends JPanel implements KeyListener,ActionListener{

    private boolean play=false;
    
    private int score =0;
    private int totalBricks =21;
    private  Timer timer;
    private int delay =8;
    private int playerX=310;    // starting position of slider
    
    private int ballPosX=120;   // starting coordinates of ball
    private int ballPosY=350;

    private int ballXdir= -1;
    private int ballYdir= -2;
     
      
      public GamePlay()
      {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
         timer =new Timer(delay , this);
         timer.start();
      
     // this.paint(grphcs);
      
      }
      
    @Override
      public void paint(Graphics g)
      {
          //background
           g.setColor(Color.black);
           g.fillRect(1, 1, 692, 592);
           
           // borders
           g.setColor(Color.yellow);
           g.fillRect(0, 0, 3, 592);  // left side
           g.fillRect(691, 0, 3, 592); // right side
           g.fillRect(0, 0, 692, 3);  //   upper side
          
           
           
           // paddle
           g.setColor(Color.green);
           g.fillRect(playerX, 550, 100, 8);
           
           // ball
           g.setColor(Color.yellow);
           g.fillOval(ballPosX, ballPosY, 20, 20);
           
           g.dispose();
           
           
           
      }
       
      
       @Override
       public void actionPerformed(ActionEvent ae) 
       {
            timer.start();
             
        
            System.out.println("\n actionPerformed\n");
             if(play)
            {
              ballPosX =ballPosX +  ballXdir;
              ballPosY =ballPosY +  ballYdir;
            
              if(ballPosX<0)
              {
                ballXdir = -ballXdir;
              }
              
               if(ballPosY> 0 )
              {
                ballYdir = -ballYdir;
              }
               
               if(ballPosX> 670 )
              {
                ballYdir = -ballYdir;
              }
            
            
            }
            
            
            this.repaint();  // call paint method again i.e  when we
                             //press  right or left key paddle move accordingly 

       }
      
      
    @Override
    public void keyTyped(KeyEvent ke) {}
    @Override
    public void keyReleased(KeyEvent ke) {   }

    @Override
    public void keyPressed(KeyEvent ke) 
    {
         System.out.println("\nkeyPressed\n");
        if(ke.getKeyCode()== KeyEvent.VK_RIGHT)     
        {
              if (playerX>=600)
             { 
                 playerX=600;
             }
             else
             {
                 moveRight();
             }
        }
        
         if(ke.getKeyCode()== KeyEvent.VK_LEFT)     
        {
             //System.out.println("left key");
           if (playerX<10)
             { 
                 playerX=10;
             }
             else
             {
                 moveLeft();

             }
         }
    
    }
    public void moveRight() 
    {
         play=true;
         playerX += 20;    
    
    }
    public void moveLeft()
    {
        play=true;
        playerX -= 20; 
    
    }

   
   
    
}
