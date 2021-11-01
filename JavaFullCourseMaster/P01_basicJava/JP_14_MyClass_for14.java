package P01_basicJava;

public class JP_14_MyClass_for14 {
	/*******************************************************************************
	 * Lecture:-19
	 * Class & Constructor in java 
	 * constructor is same as class but don't return the value
	 *******************************************************************************/
	public static void main(String[] args) {
		
		JP_14_ClassAndConstructor cube1 = new JP_14_ClassAndConstructor();
		System.out.println(cube1.getCubeVolume());
		
		JP_14_ClassAndConstructor cube2 = new JP_14_ClassAndConstructor(2,5,10);
		System.out.println(cube2.getCubeVolume());

	}

}
