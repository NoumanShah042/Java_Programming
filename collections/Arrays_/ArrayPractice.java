package Arrays_;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class ArrayPractice {
    
      public static void printArray(double[] array)
       {
           
             for(int i =0; i < array.length; i++)
             {
                 
                   System.out.print(array[i]+" ");
             }
             
             System.out.print("\n");
        }
             
             
             
            public static double[] reverse(double[] list)
              {
                double[] result =new double[list.length];
                        for(int i =0, j = result.length -1; i < list.length; i++, j--)
                        {
                             result[j]= list[i];
                        }
                    return result;
              }
            
            
                    
        public static void main(String[] args) 
        {
                double[] myList ={1.9,2.9,3.4,3.5};
                //int[] a =new int[]{1,2,};
                //System.out.println(a.length);

                // Print all the array elements
                 printArray(myList);

                    System.out.println("\nreverse\n");
                   printArray(reverse(myList));

                //for(int i =0; i < myList.length; i++)
                //{
                 //   System.out.println(myList[i]+" ");
                //}
                
                
                // Summing all elements
                double total =0;
                for(double element: myList)   
                {

                   total =total + element;

                //System.out.println(element);
                //System.out.println("hello");

                }
                System.out.println("Total is "+ total);
                // Finding the largest element
                double max = myList[0];
                for(int i =1; i < myList.length; i++)
                {
                     if(myList[i]> max) 
                        max = myList[i];
                }
                System.out.println("Max is "+ max);
        }
    
    
}
