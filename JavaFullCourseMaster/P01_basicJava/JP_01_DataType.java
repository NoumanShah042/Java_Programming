package P01_basicJava;

public class JP_01_DataType {

	/*******************************
	 * Lecture:-4 
	 * youtube:-ProgrammingKnowledge
	 ********************************/
public static void main(String[] args) {
		// Numeric Data type without decimal
		byte byte_data = 120;	
		short short_data = 10500;
		
		int int_data = 2500000; //less than 0 greater than 0 and equall to 0 = INTEGER eg -1 or 1
		int a=0;                       //variable =data , datatype=data and value=25000                       
		int b = -1;
		
		long long_data = 1200120010;	
		//numbers with Decimal		
		float float_data = 0.98f;
		
		double double_data = 0.98;
		double d =100;
		
		boolean decision = true;  //True or false		
		char char_data = 'f'; //only single digit for eg:- a,1,A, @
		 
		int num1 = 10;
		int num2 = 30;
		int sum = num1+num2;//operation on integer variable
		System.out.println("value of num1 before assignment=" +num1);
        num1=num2;
		System.out.println("value of num1 after assignment=" +num1);
		System.out.println("Addition of two numbers=" +sum);
		/*RESULT
		 * this is my first java Programme
         *value of num1 before assignment=10
         *value of num1 after assignment=30
         *Addition of two numbers=40
         */
      //      Execution happen from top to bottom				
		 String ab= "Hello";
		 String ab2="100";  //String is a class not a datatype
		
		
	}

}
