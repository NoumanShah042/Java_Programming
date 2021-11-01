package P06_polymorphism_MethodORandOL;

public class myClass {

	/*****************************************
	 * Lecture 27 
	 * https://youtu.be/rVSlCg2ttZ0
	 ****************************************/	
	public static void main(String[] args) {
		/**************************************************************************
		 * ability to take on multiple form is Polymorphism 
		 * we have same method in all the four class getIntrestRate() 
		 * only difference is interest rate 0,5,6,10 
		 * when refrence of parent class point to object of subclass called upcasting
		
		 ***************************************************************************/
		
		/**************************************************************************
		METHOD OVERRIDING RULES:-Should have same num of args, same name and Same return data type
		This is the refrence of bank class which point to the Bank_abc class
		if we comment method from Bank_abc then the result==>0 else Result==>5 this is called Method Overriding
	    ****************************************************************************/
		Bank abc = new Bank_abc();
		System.out.println(abc.getIntrestRate());
		
		Bank def = new Bank_def(); //Refrence def point ot the object of def class
		System.out.println(def.getIntrestRate());
			
		System.out.println(new Bank_xyz().getIntrestRate()); //Result:-10
		 //or 
		Bank xyz = new Bank_xyz();
		System.out.println(xyz.getIntrestRate());//Result:-10
		
		
		
		
		
	}

}
