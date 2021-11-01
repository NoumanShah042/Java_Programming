
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class JAVA_HashMap {
    public static void main(String[] args) {

		// HashMap implements the Map interface (need import)
		// HashMap is similar to ArrayList, but with key-value pairs
		// stores objects, need to use Wrapper Class
		// ex: (name,email),(username,userID),(country,capital)
		
		HashMap<String,String> countries = new HashMap<String,String>();
		
		//add a key and value
		countries.put("USA","Washington DC");
		countries.put("India","New Delhi");
		countries.put("Russia","Moscow");
		countries.put("China","Beijing");
		
		//System.out.println(countries);    
		//countries.remove("USA");
		//System.out.println(countries.get("Russia"));
		//countries.clear();
		//System.out.println(countries.size());               //  display  4
		//countries.replace("USA", "Detroit");          //  replace value of a key(USA)
		//System.out.print(countries.containsKey("England"));         //  tell if hashmap contain certain key
		//System.out.print(countries.containsValue("Beijing"));        //  tell if hashmap contain certain value
		
		for(String i : countries.keySet()) {
			System.out.print(i+"\t"+"= ");  // i display key
			System.out.println(countries.get(i));
		}
		
	}
}