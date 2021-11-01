package P01_basicJava;


public class JP_15_MethodOverloading {
	/***********************************************************************
	 * Lecture :-20
	 * This is MethodOverloading 
	 * In a class we can have multiple method with same
	 * name but different data type or parameter we want to pass different
	 ***********************************************************************/
	public static void main(String[] args) {
		
		System.out.println(add(10, 20));//java auto find it is int or double or String
		System.out.println(add(10.5, 20.5));
		System.out.println(add("hello", "world"));
		
	}

	public static int add (int a, int b) {
		return(a+b);
	}
	
	public static double add(double a, double b) {
		return(a+b);
	}
	
	public static String add(String a, String b) {
		return(a+b);
	}

}


