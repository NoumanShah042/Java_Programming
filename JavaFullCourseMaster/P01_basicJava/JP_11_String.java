package P01_basicJava;

/**************
 * lecture:-15
 **************/
public class JP_11_String {

	public static void main(String[] args) {
		//This is how we declare string in java in 2 way
		//1. String lateral
		
		String pcName = "dell";
		String str = "Hello we are learing java today";
	   //String str = new String("Hello we are learing java today");
		String emp = "";
		
		System.out.println(str.charAt(4)); //=o in in index 4
		System.out.println(str.indexOf("o")); //4
		
		System.out.println(str.concat(" sunday"));
		System.out.println(str.indexOf("are")); //=9
		
		System.out.println(str.contains("java"));//true
		System.out.println(str.endsWith("today")); //true
		
		System.out.println(str.isEmpty());//false
		System.out.println(emp.isEmpty());//true
		
		System.out.println(pcName.length());//4
		System.out.println(pcName.replace("d", "c")); //cell
		
		System.out.println(str.substring(6));//we are learing java today
		System.out.println(str.substring(6, 8));//we
		String[] splitEx = str.split(" ");//splitting on the basis of space
		System.out.println(splitEx[0]+" "+ splitEx[1]);//Hello we
		
		
		//2. By using new operator or we can say by creating object
		String cars = new String("toyota");
		
		

	}

}
