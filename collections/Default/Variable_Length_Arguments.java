/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;


// Variable length Arguments  Demo

class Calc
{
//	public int add(int i,int j)
	public int add(int ... n) // {4,5,6,7,8,8,4}  
	{
//		return i+j;
		int sum=0;
               System.out.println("Length = "+ n.length);
            
		for(int i : n)
		{
			sum = sum + i;
		}
		return sum;
	}
}

public class Variable_Length_Arguments {
    public static void main(String[] args)
	{	
		Calc obj = new Calc();
		System.out.println(obj.add(4,5,6,7,3,3,4,5,6,64));
	}
}
