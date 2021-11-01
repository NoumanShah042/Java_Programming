package P02_IntermediateJava;

public class zTemp {

	public static void main(String[] args) {
		String[] a = {"apple", "ball", " ", "caterpillar"};
		
		String aaa = "apple";
		
		//Reverse String:-1
		StringBuffer d = new StringBuffer();
		System.out.println(d.append(aaa).reverse());

		//Reverse String:-2
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(aaa).reverse());
		
		//Reverse String:-3
		char[] ab = aaa.toCharArray();
		
		for(int i =ab.length-1; i>=0; i--) {
			System.out.print(ab[i]);
		}
		
		}
	
	
}


