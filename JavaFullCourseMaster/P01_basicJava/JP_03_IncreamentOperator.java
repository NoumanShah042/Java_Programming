package P01_basicJava;

public class JP_03_IncreamentOperator {

	public static void main(String[] args) {
		
    int x = 10;
    x = x+1; // x+1 = x++ are same
    
    //post Increment
    System.out.println(x); //result=11
    
    System.out.println(x++);//result=11
    System.out.println(x);//result=12
   
    
    System.out.println("==========================");
    int y =0;
    //pre-increment
    System.out.println(++y); //result= 1
    //System.out.println(y); //result= 2
    System.out.println(++y); //result= 2
    System.out.println(++y); //result= 3
    System.out.println(++y); //result =4
		
    int i = 0;
	String a ="Senario:";
	
	System.out.println(a+ ++i); //string and integer cannot be concatinated without declaring variable
	System.out.println(a+ ++i);
	System.out.println(a+ ++i);
	System.out.println(a+ ++i);
	System.out.println(a+ ++i);
		
		

	}

}
