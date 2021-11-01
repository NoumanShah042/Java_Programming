package P01_basicJava;

public class JP_09_Arrays_oneDimensional {

	/********************************************************
	 * Lecture:-they are one dimensional and two dimensional
	 * youtube:-ProgrammingKnowledge
	 ********************************************************/
public static void main(String[] args) {
		
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};//index start from 0 
	
	int[] myNum = {10, 20, 30, 40};
	
	System.out.println(cars[0]);// Outputs Volvo
	
	cars[0] = "Toyota";
	System.out.println(cars[0]);// Now outputs Toyota instead of Volvo
	
	System.out.println(cars.length);// Outputs 4 //length start from 1
    
	System.out.println("=======================");
	for (int i = 0; i < cars.length; i++) {
	  System.out.println(cars[i]); //will print all
	}
		
	}

}
