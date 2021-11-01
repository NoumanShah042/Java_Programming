package P04_nonAccessModifier;

public class StaticModifier {

		/****************************
		Non_access Modifier are :-
		1. static==> can access everywhere without creating the object 
		2. final==>if class is final-->No more inheritance 
		           final in method --> then method cannot be overWritten
		           final variable  -->value cannot be change once it is initialized
		3. abstract==>abstract can be applied to class & Method but no data type int , String..
		4. Transient
		5. volatile
		*****************************/
	    static int a =0; //  Global variable
	           int c = 1;
	
		public static void main(String[] args ) {
			
		int b = 1;
		
		//to access inside main method we have to declare static
		System.out.println(a); 
		
			
			//To access c inside the main method we have to create object 
		StaticModifier sm = new StaticModifier();
		System.out.println(sm.c);
			
		}
	}


