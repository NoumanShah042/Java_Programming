
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
class ReferencesTest {
     public static void main(String[] arguments) {
       Point pt1, pt2;
      pt1 = new Point(100, 100);
     pt2 = pt1;
  
      pt1.x = 200;
      pt1.y = 200;
      System.out.println("Point1: " + pt1.x + ", " + pt1.y);
      System.out.println("Point2: " + pt2.x + ", " + pt2.y);
    }
  }

//https://www.informit.com/articles/article.aspx?p=174371&seqNum=4#:~:text=A%20reference%20is%20an%20address,using%20references%20to%20those%20objects.
/*
            You might expect pt1 and pt2 to have different values.
       However, the output shows this is not the case. As you can 
       see, the x and y variables of pt2 also were changed, even though 
       nothing in the program explicitly changes them. This happens because 
       line 7 creates a reference from pt2 to pt1, instead of creating pt2 as
       a new object copied from pt1.
*/