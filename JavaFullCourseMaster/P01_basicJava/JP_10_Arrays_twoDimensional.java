package P01_basicJava;

public class JP_10_Arrays_twoDimensional {

	/********************************************************
	 * Lecture:-13
	 * they are one dimensional and two dimensional
	 * youtube:-ProgrammingKnowledge
	 ********************************************************/
public static void main(String[] args) {
		
	
	int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	
	//for {1, 2, 3, 4}
	int a = myNumbers[0][0]; //=1
	int b = myNumbers[0][1]; //=2
	int c = myNumbers[0][2]; //=3
	int d = myNumbers[0][3]; //=4
	//for {5, 6, 7}
	int e = myNumbers[1][0]; //=5
	int f = myNumbers[1][1]; //=6
	int g = myNumbers[1][2]; //=7
	System.out.println(a+","+b+","+c+","+d+","+e+","+f+","+g); //just putting the , in console 
	System.out.println("=======================");
	//System.exit(0);
		    int[][] myNum = { {1, 2, 3, 4}, {5, 6, 7} }; //++i =Pre-increment and i++ is Post-increment
		    for (int i = 0; i < myNum.length; ++i) {
		      for(int j = 0; j < myNum[i].length; ++j) {
		        System.out.println(myNum[i][j]);
		      
		  }
		}
	
	
	
	
		
	}

}
