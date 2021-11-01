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
public class returnArray {
    
       public static int[] m1()
        {
            int[] a = new int[]{1,2,3};
            // returning array
            return  a ;
        }
    // Driver method
        public static void main(String args[])
        {
            int arr[] = m1();
            for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        }
           
}
