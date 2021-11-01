package P01_basicJava;

import java.util.Scanner;

public class JP_02_ScannerDemo {

	/*******************************
	 * Lecture:-5
	 * Getting user input using Java
	 ********************************/
public static void main(String[] args) {
		
	try (Scanner scan = new Scanner(System.in)) {
			
		System.out.println("input String:"); //String should be written 1st
		String strs = scan.nextLine();
		System.out.println(strs);

		System.out.println("input Integer:");
		int num = scan.nextInt();
		System.out.println(num);

		System.out.println("Input Double:");
		double dub = scan.nextDouble();
		System.out.println(dub);



	}


}

}
