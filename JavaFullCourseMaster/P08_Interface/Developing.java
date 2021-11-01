package P08_Interface;
/***************************************************************
* in this you have to implement all the methods no matter what
* you can add extra also methods also
* you cannot just do some method
* this is class is responsible to implement all the method of banking client
*******************************************************************/
public class Developing implements BankingClient, Domainclient { // one class can implement multiple interface also
	public static void main(String[] args) {
		Developing d = new Developing(); // d is responsible to called the method of "Developing" class
		d.login();
		d.paycreditcard(); // object.method
		d.transferbalance();

		BankingClient dr = new Developing(); 
		// dr is responsible to called the method of "BankingClient" only
		// return type = BankingClient this type of assigning is mechanism is called runtime Polymorphism
		Domainclient ds =new Developing();// so this is called "runtime polymorphism"
		ds.investment();
	}

	@Override
	public void paycreditcard() {
		System.out.println("paycredit balance implemented");
	}

	@Override
	public void transferbalance() {
		System.out.println("transefer balance implemented");
	}

	@Override
	public void checkingbalance() {
		System.out.println("checking balance implemented");
	}

	public void login() { // this method we just add Extra
		System.out.println("transer balance implemented");
	}

	@Override
	public void investment() {
	
	}

}
