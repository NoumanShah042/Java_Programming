package P00_interviewQuestion;

public class IQ_03_ReverseString_number {

	public static void main(String[] args) {
		reverseNumber();
		reverseString();	
	}
	
	public static void reverseNumber() {
		int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
	}
	
	public static void reverseString() {
		String aaa = "apple";

		// Reverse String:-1
		StringBuffer d = new StringBuffer();
		System.out.println(d.append(aaa).reverse());

		// Reverse String:-2
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(aaa).reverse());

		// Reverse String:-3
		char[] ab = aaa.toCharArray();
		for (int i = ab.length - 1; i >= 0; i--) {
			System.out.print(ab[i]);
		}

	}

}
