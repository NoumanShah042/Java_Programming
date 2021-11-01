package P01_basicJava;

public class JP_17_Student {
	/*******************************************************************************
	 * Lecture:-22
	 *******************************************************************************/
     String name;
     int age;
     static int numOfStudent=0;

     JP_17_Student(){
     numOfStudent++;
}
     public static int getNumOfStudenta() {
 		return numOfStudent;
 	}
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumOfStudent() {
		return numOfStudent;
	}
	public void setNumOfStudent(int numOfStudent) {
		this.numOfStudent = numOfStudent;
	}
     
     
	
	

}
