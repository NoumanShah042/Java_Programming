/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_;

class Stud        // Student
{
	int rollno;
	String name;
}
public class ArrayDemo 
{
	public static void main(String[] args)
	{
		/*  ***1d Array***
		 
//		Stud s1 = new Stud();
//		Stud s2 = new Stud();
//		Stud s3 = new Stud();
//		Stud s4 = new Stud();
//		
//		Stud s[] = {s1,s2,s3,s4};
		
//		int nums[] = new int[4];
		int nums[] = {8,12,76,54};
		
//		nums[0] = 8;
//		nums[1] = 12;
//		nums[2] = 76;
//		nums[3] = 54;
//		nums[4] = 77;
//		nums[2] = 99;
		
		
//		System.out.println(nums[2]);
//		System.out.println(nums[4]);
		
		for(int i=0;i<4;i++)
		{
			System.out.println(nums[i]);
		}
		*/
		
		// 2D Array
		
		int a[] = {1,2,3,4};
		int b[] = {2,4,6,8};
		int c[] = {5,6,7,8};
		
		int d[][] = {
                                {1,2,3,4},    // Jagged Arrays
                                {2,4,8},
                                {5,6,7,8,9}
			    };
		
//		System.out.println(d[0][1]);
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
                System.out.println();
                
                
                for(int k[] : d )    //  using enhanced for loop
		{
			for(int l : k)
			{
				System.out.print(" " + l);
			}
			System.out.println();
		}
	}

}