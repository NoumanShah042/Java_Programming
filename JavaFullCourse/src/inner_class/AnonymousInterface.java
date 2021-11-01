/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;
//********************************************

interface Ac
{
	void show();
}

public class AnonymousInterface 
{
	public static void main(String[] args)
	{
            Ac obj = new Ac()
                            {
                                public void show()
                                {
                                        System.out.println("Im the best");
                                }
                            };

                            obj.show();
	}
}

