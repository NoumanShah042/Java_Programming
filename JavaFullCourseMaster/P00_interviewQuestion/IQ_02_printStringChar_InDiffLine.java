package P00_interviewQuestion;

public class IQ_02_printStringChar_InDiffLine {

	public static void main(String[] args) {
		String str = "mango";
		System.out.println("str.length = "+str.length() );
		
                char[] cr = str.toCharArray();
		System.out.println("cr.length = "+cr.length );
                        
		for(int i=0; i<cr.length; i++) {
			System.out.println(cr[i]);
		}

	}

}
