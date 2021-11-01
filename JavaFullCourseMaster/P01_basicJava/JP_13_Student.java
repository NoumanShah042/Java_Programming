package P01_basicJava;

public class JP_13_Student {
	
	/*****************************************************************************
	 *  Lecture:-18 
	 * to create getter and setter method is called Encapsulation click on variable
	 * like age->source->generate getter and setter
	 *****************************************************************************/
	//this is not ideal to do
	int id;
	String name; 
	int age; 
	
	
	//This is what we suppose to do
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
	
}
