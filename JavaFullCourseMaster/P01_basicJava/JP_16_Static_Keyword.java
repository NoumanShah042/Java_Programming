package P01_basicJava;

public class JP_16_Static_Keyword {
	/*******************************************************************************
	 * Lecture:-21
	 * non-static ==> need to create the object to call the method
	 * static ==>member only belongs to class no instance or object need to create
	 *******************************************************************************/
	public static void main (String[] args) {
		
		//1. non-static
		JP_16_hello Hello = new JP_16_hello();
		Hello.doSometingElse("hi youtube");
		
		JP_16_hello Hello1 = new JP_16_hello();
		
		JP_16_hello Hello2 = new JP_16_hello();
		
		//2. static
		JP_16_hello.doSomeThing("hi facebook");

	}

}
