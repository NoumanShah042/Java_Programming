package P05_inheritance;

public class Main {

	public static void main(String[] args) {
		Mouse1 m1 = new Mouse1();
		m1.leftClick();
		m1.rightClick();
		m1.scrolldown();
		m1.scrollUp();
		m1.setColor("green");//This is specific to this class only
		
		System.out.println("=================================");
		Mouse2 m2 = new Mouse2();
		m2.leftClick();
		m2.rightClick();
		m2.scrolldown();
		m2.scrollUp();
		m2.connect();//This is specific to this class only
		
		System.out.println("=================================");
		
		
		System.out.println(Mouse3.fruit());
		
		Mouse3 m3 = new Mouse3();
		m3.leftClick();
		m3.rightClick();
		m3.scrolldown();
		m3.scrollUp();
		System.out.println(m3.hybrid);

	}

}
