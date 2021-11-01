package P02_IntermediateJava;

import java.util.HashMap;

public class JP_02_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("a", "apple");
		hm.put("b", "ball");
		
		hm.remove("a", "apple");
		
		System.out.println(hm);
		
		
		
		
		
	}

}
