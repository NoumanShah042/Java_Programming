package P01_basicJava;

public class JP_13_MyClass_for13 {
	/********************
	 *  Lecture:-18 
	 *******************/
	public static void main(String[] args) {
		// This is not ideal to do 
		JP_13_Student mark = new JP_13_Student(); //mark = object or instance
		mark.id =1;
		mark.name= "mark";
		mark.age = 15;
		
		
		JP_13_Student tom = new JP_13_Student(); //mark = object or instance
		tom.id =2;
		tom.name= "Tom";
		tom.age = 20;
		
		
		System.out.println(mark.id + mark.name+ mark.age);
		System.out.println(tom.id+tom.name+tom.age);
		
		
		//This is what we suppose to do
		
		JP_13_Student mark1 = new JP_13_Student();
		mark1.setId(1);
		mark1.setAge(15);
		mark1.setName("mark wein");
		
		
		JP_13_Student tom1 = new JP_13_Student();
		tom1.setAge(20);
	    tom1.setId(225);
	    tom1.setName("tom young");
	
	    System.out.println(mark1.id+" "+ mark1.name+" "+ mark1.age);
		System.out.println(tom1.id+" "+tom1.name+" "+tom1.age);
	}

}
