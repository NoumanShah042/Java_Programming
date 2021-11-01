package P03_accessModifier_2;

import P03_accessModifier_1.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		

		//for Public Modifier: we can access same package and everywhere
		//for this we see the ==circle== sign
		//import accessModifierPack1.Access1; ==>auto Generate
		Access1 a1 = new Access1();
		System.out.println(a1.pubHours);
		System.out.println(a1.pubMin);
		
		
		//for protected Modifier: we can access same package and everywhere
		//for this we see the ==yellow diamond== sign		
		Access3 a2 = new Access3();
		System.out.println(a2.protHours);
		System.out.println(a2.protMin);

		//Method 
		Access3 a3 = new Access3();
		System.out.println(a3.gethoursProt());
		System.out.println(a3.gethoursPub());
		
		
		
		
	}

}
