package P01_basicJava;

public class JP_12_MethodAndFunction {

	/***********************************************************
	 * Lecture:-16, 17
	 * parameter = variable in the method = [name , age]
	 * argument  = actual value of this variable = [bijaya , 31]
	 *************************************************************/
public static void main(String[] args) {
		
	//argument = bijaya , 31
	myfirstMethod("bijaya",31); 
	System.out.println(mySecMethod(10, 5));
		
	
}
		
//parameter	= name , age
//since we have void so we can't use [return] in this method
public static void myfirstMethod(String name, int age) { 
	//here execution will not happen coz it is outside the main method
	System.out.println("hello");
	System.out.println("today is");
	System.out.println("sunday");
	
	System.out.println(name+ " "+age );
	
	}
//here we dont have void so we are using return
public static int mySecMethod(int a, int b) { 
	//here execution will not happen coz it is outside the main method
	int sum = a+b;
	return sum;
	
	}

}


