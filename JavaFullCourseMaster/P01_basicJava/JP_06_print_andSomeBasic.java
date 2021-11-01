package P01_basicJava;

public class JP_06_print_andSomeBasic {

	/*******************************
	 * Lecture:-8
	 * if & else Statement
	 * @throws Exception 
	 ********************************/
public static void main(String[] args) throws Exception {
	
	System.out.println("apple");
	System.out.println("ball");
	System.out.print("cat");
	
	System.exit(0); //This is stop the execution in this line 
	
	System.out.print("apple\nball\ncat");//formula = \n =>nextline
	System.out.println("apple\tball\tcat"); //formula = \t =>tab
	
    String txt = "Hel\blo World!"; //formula = \b =>backspace
	System.out.println(txt);
	   
	/************************************************
	   to print this is console we have to do this trick
	    \'	'	Single quote
	    \"	"	Double quote
	    \\	\	Backslash
	 **************************************************/
	
	// this is how we do Single comment by using or click on that line and ctrl+/
	//upper multiple comment for that use /* + enter or highlight the word and ctrl + shift + / 
	//to uncomment ctrl+\ for single comment and multiple comment ctrl+shift+\
}

}