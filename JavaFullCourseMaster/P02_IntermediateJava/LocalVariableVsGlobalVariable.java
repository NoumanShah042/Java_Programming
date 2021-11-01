package P02_IntermediateJava;

public class LocalVariableVsGlobalVariable {

	//Global varbs -- class variable
	String name ="Tom";
	int age=25;
	
	public static void main(String[] args) {
		
		int i =10;//local variable for main method
		System.out.println(i);
		
		 LocalVariableVsGlobalVariable  obj =new  LocalVariableVsGlobalVariable();
		 System.out.println(obj.name);
		 System.out.println(obj.age);
	
		
				
	}
	public void sum() {
		int i= 15;//local variable for sum method
	}
}
