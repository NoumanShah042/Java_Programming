package P06_polymorphism_MethodORandOL;

public class Bank_abc extends Bank {

	int getIntrestRate() {
		return 5;
		
	}
	/***************************************************************************
	* This is called Method overloading
	* and the main difference between method overloading and overriding is 
	* method over riding same method name data type and same Argument
	* method overriding different data type different Argument type But same method name
	* Method overloading
	*int getIntrestRate() {
		return 5;		
	}
	* double getIntrestRate(String str) {
		return 5;
	
    *****************************************************************************/
	double getIntrestRate(String str) {
		return 5;
		
	
		
	}

}
