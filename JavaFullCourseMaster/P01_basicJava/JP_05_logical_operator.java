package P01_basicJava;

public class JP_05_logical_operator {

	/*******************************************
	 * Lecture:-9
	 * Ctrl + o = remove Unnecessary import
	 * logical operator like && = and , || = or
	 ********************************************/
public static void main(String[] args) throws Exception {
	int sub1 = 40;
	int sub2 = 60;
	int sub3 = 30;
	
	if ((sub1<sub2) && (sub1>sub3)) {
		System.out.println("both statement are true");
	}
	if ((sub1<sub2) || (sub1<sub3)) {
		System.out.println("only one statement is true");
	}

}

}
