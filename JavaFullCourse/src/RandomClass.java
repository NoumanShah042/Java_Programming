/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 

       Random rand = new Random(); //instance of random class
        int upperbound = 25;

        //generate random values from 0-24

      int int_random = rand.nextInt(upperbound); 

      double double_random=rand.nextDouble();
      float float_random=rand.nextFloat();
      
      System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
      System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
      System.out.println("Random double value between 0.0 and 1.0 : "+double_random);


 */

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		Random random = new Random();
		
                //int x = random.nextInt(6);  give random between 0 - 5
                
		int x = random.nextInt(6)+1;
                //int x = random.nextInt();  //  no limit
		//double y = random.nextDouble(); //  give random between 0 and 1
		//boolean z = random.nextBoolean();
		
		System.out.println(x);
				
	}
}
  