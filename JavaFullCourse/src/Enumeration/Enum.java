/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeration;

import java.util.Scanner;

/**
 *
 * @author Syed Nouman Rehman
 */

   
enum Season 
{
	 Summer,Rainy,Autumn,Winter,Spring
};
enum Months {
	Jan, Feb, Mar, Apr, May, Jun, Jul,
	Aug, Sep, Oct, Nov, Dec
};
 
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}


public class Enum {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        Season g ;
        g=Season.Summer;
        System.out.println(g);
	
        Months h;
	 

	 
	 Season season;
	 System.out.println("What is your favorite season\n"+
		"  1.Summer\n"+
		"  2.Rainy\n"+
		"  3.Autumn\n"+
		"  4.Winter\n"+
		"  5.Spring\n"+
		"> ");
	
         int ch;
	 ch=input.next().charAt(0);
	switch (ch)
	{
             //  Summer,Rainy,Autumn,Winter,Spring
            case 1:
                    season = Season.Summer;
                    break;
            case 2:
                    season = Season.Rainy;
                    break;
            case 3:
                    season = Season.Autumn;
                    break;
            case 4:
                    season = Season.Winter;
                    break;
            case 5:
                    season = Season.Spring;
                    break;
            default:
                    season = null;
	}
        
	if (season == null)
		System.out.println("Hey, that's not a fruit!\n");
	else
		System.out.println("That's my favourite too'!\n");
 

    }
}
