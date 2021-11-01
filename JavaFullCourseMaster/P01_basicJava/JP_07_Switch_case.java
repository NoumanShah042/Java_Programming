package P01_basicJava;

public class JP_07_Switch_case {

	/***********************************************************
	 * Lecture:-10
	 * change integer day value= 1,2... to print any from sun-sat
	 *************************************************************/
public static void main(String[] args) {
		
	int day = 10; //
	switch (day) {
	  case 1:
	    System.out.println("Monday");
	    break;
	  case 2:
	    System.out.println("Tuesday");
	    break;
	  case 3:
	    System.out.println("Wednesday");
	    break;
	  case 4:
	    System.out.println("Thursday");
	    break;
	  case 5:
	    System.out.println("Friday");
	    break;
	  case 6:
	    System.out.println("Saturday");
	    break;
	  case 7:
	    System.out.println("Sunday");
	    break;
	  default:
		System.out.println("number is out of scope");
		break;
	}
	

	//This is another Example of the switch case
	String a = "boy"; //
	switch (a) 
	  {
	  case "apple":
	  case "ant":
	  case "acer":  
	    System.out.println("This word start from alphabet a");
	    break;
	    
	  case "ball":
	  case "book":
	  case "bench":	
	  case "boy":	
	  case "bed":	 //you can do as many as you want	
	    System.out.println("This word start from alphabet b");
	    break;
	  }
	
	
	
	
	
	
}

}
