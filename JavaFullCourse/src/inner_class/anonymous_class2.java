/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;

/**
 *
 * @author Syed Nouman Rehman
 */


class Ab
{
	public void show()
	{
		System.out.println("in A show");
	}
}

 
public class anonymous_class2 {
    public static void main(String[] args)
	{
		Ab obj1 = new Ab()
				{
					public void show()
					{
						System.out.println("im the best");
					}
				};
				
		obj1.show();    //  im the best
                
                
               Ab obj2= new Ab();
               obj2.show();     //  in A show
               
	}
}