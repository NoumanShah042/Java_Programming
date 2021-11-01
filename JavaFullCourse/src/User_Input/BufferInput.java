/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Input;
import java.io.BufferedReader;
import java.io.InputStreamReader;

 
public class BufferInput {
    //  waste class
}

/*
    not handling error if user give wrong input like if user enter char or string or white space char, 
    it cause error

    but is working fine if input is correct

*/
 class UserInput       
{
	public static void main(String[] args) throws Exception
	{
		int n=0;
		System.out.println("Enter a number");
		
		BufferedReader br = null;
                br = new BufferedReader(new InputStreamReader(System.in));
                n = Integer.parseInt(br.readLine());  // 45
                br.close();
				
		System.out.println(n);
	}
}


   class UserInput_handling 
{
    public static void main(String[] args) throws Exception
	{
		int n=0;
		System.out.println("Enter a number");
		
		BufferedReader br = null;
		try
		{

			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());  // 45
			br.close();
		}
		catch(Exception e)
		{
			//System.out.println(e);
                          System.err.println(e);
		}
		finally
		{
			br.close();
		}
				
		System.out.println(n);
	}
}