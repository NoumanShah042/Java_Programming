package P02_IntermediateJava;

public class Return_ArrayStringMatch {

	public static void main(String[] args) {
		String[] a = {"apple", "ball", " ", "caterpillar"};
		
		String aaa = (meth(a, "ba"));
		System.out.println(aaa);
		
		}
		
	
	
	public static String meth(String[] arVal, String containText ) {
		String[] a = arVal;
		String aa = "";
		for(int i=0; i<a.length; i++) {
			if(a[i].startsWith(containText)) {
				aa = a[i];
				break;				
	       }
	
		}
		return aa;
	}
	}


