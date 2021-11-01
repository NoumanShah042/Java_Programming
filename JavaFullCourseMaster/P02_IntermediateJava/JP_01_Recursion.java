package P02_IntermediateJava;

public class JP_01_Recursion {

	/*************************************************************************************************
	 * Lecture:-30
	 * Recursion in java means we can call the method inside same method like 
	 * <--calling methodDemo under methodDemo-->
	 * We are doing Factorial like [5! = 5 x 4 x 3 x 2 x 1] formula = n! = n x (n-1) x(n-2)...upto 1
	 **************************************************************************************************/
	
	public static int factorial(int N) {
		if (N<=1)
			return 1;
		else return (N * factorial(N-1));
	//This type of calling method under the method is called <--Recursion-->
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(factorial(5)); //Result:-120
		

	}

}
