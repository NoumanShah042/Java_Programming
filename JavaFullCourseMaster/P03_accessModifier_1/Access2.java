package P03_accessModifier_1;

public class Access2 {
	/*The scope of access modifiers in tabular form
	------------+-------+---------+--------------+--------------+--------
	            | Class | Package | Subclass     | Subclass     |Outside|
	            |       |         |(same package)|(diff package)|Class  |
	————————————+———————+—————————+——————————----+—————————----—+————————
	public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |    
	————————————+———————+—————————+—————————----—+—————————----—+————————
	protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |    
	————————————+———————+—————————+————————----——+————————----——+————————
	default     | Yes   |  Yes    |    Yes       |    No        |   No  |
	————————————+———————+—————————+————————----——+————————----——+————————
	private     | Yes   |  No     |    No        |    No        |   No  |
	------------+-------+---------+--------------+--------------+--------
	*/
	public static void main(String[] args) {
		
		//Default Modifier:-we can access here in same package
		//for default we see ==triangle== sign when write a.
		Access1 a = new Access1();
		System.out.println(a.hours);
		System.out.println(a.min);
		
		
		//for Public Modifier: we can access same package and everywhere
		//for this we see the ==circle== sign
		Access1 a1 = new Access1();
		System.out.println(a1.pubHours);
		System.out.println(a1.pubMin);
		
		//for the protected modifier :we can access inside the same package
		//for this we see the ==yellow diamond==
		Access1 a2 = new Access1();
		System.out.println(a2.protHours);
		System.out.println(a2.protMin);
		
        //This is for calling public method
		Access1 m = new Access1();
		System.out.println(m.gethoursPub());
		
		//this is for the default method
		Access1 m1 = new Access1();
		System.out.println(m1.gethoursDef());
	}

}











