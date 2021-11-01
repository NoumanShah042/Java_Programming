package P03_accessModifier_1;

/*The scope of access modifiers in tabular form
------------+-------+---------+--------------+--------------+-------------
            | Class | Package |(same package)|(diff package)|Outside class|
————————————+———————+—————————+——————————----+—————————----—+————————
public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |    
————————————+———————+—————————+—————————----—+—————————----—+————————
protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |    
————————————+———————+—————————+————————----——+————————----——+————————
default     | Yes   |  Yes    |    Yes       |    No        |   No  |
————————————+———————+—————————+————————----——+————————----——+————————
private     | Yes   |  No     |    No        |    No        |   No  |
------------+-------+---------+--------------+--------------+--------
*whenever you have 2 variable with same name and you want to differentiate between them use this.name 
*this class indicate the class itself = JP_01_Access_Modifier
*/
public class Access1 {
	
//this is default modifier no need to do anything can access in class and other class inside same package=subpackage
	int hours = 1;
	int min = 10;
	
//This is public modifier can access everywhere
	public int pubHours= 2;
	public int pubMin = 20;
	
	
//This is private and we can only access inside the Class
	private int priHours = 3;
	private int priMin =30;
	
//This is protected 
	protected int protHours = 4;
	protected int protMin =40;
	
//this is default nothing method
	int gethoursDef() {
		return hours;
	}
		
	
//public method
	public int gethoursPub() {
		return hours;
	}

//cannot access outside of the class
	private int gethoursPriv() {
		return hours;
	}

//protected 
	protected int gethoursProt() {
		return hours;
	}
	
	
	
	
	
	
	
	
}
