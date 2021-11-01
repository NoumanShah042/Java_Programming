/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Statements;

/*

Java Continue  ******************************************************
 
The continue statement breaks one iteration (in the loop), 
if a specified condition occurs, and continues with the next iteration in the loop.

This example skips the value of 4:

Example
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
 */
public class continue_statement {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
        if (i == 4) {
          continue;
        }
        System.out.println(i);
       }
    }
}
/*
output:

0
1
2
3
5
6
7
8
9

*/