package P01_basicJava;

/*******************
 * Lecture:-19 
 *******************/ 
public class JP_14_ClassAndConstructor {
        //for cube
	    int length ;
		int breadth;
		int height;
	
		public int getCubeVolume() {
		return (length * breadth * height);

	}

	/*************************************************************************************
	 * This is Constructor and we can have multiple constructor but don't return the value
	 *  this is called default constructor they take parameter also
	 **************************************************************************************/
		JP_14_ClassAndConstructor (){
			length = 10;
			breadth =20;
			height = 30;
			
		}
		//this is called constructor overloading
		JP_14_ClassAndConstructor (int l, int b, int h){
			length = l;
			breadth =b;
			height = h;
			
		}
}
