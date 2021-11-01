package Arrays_;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class myArray {
    
   
    public static void main(String[] args) {
       
        Array a=new Array(5);
        a.input();
        Array b=a;
        b.display();
        
//        a.input();
//        a.display();
//        System.out.println("\n\n\n");
//        a.resize(2);
//         a.display();
       // System.out.println("hello");
    }
    
    
}

class Array
{
	int[] data;// ={ 2,3,4,5,6};
        //int [] a=new int []{1,2,3,4,5};
	int capacity;
        //boolean b=true;
	void isValidIndex(int index)
         {
                
                
                //return true;
         }


	Array(int capacity )
        {
            this.capacity=0;
             data=null;
         if (capacity!=0)
         {
             this.capacity=capacity;
             data=new int[capacity];
         }
         
        }
        
        void input()
        {
             System.out.println("input "+capacity+" integers");
                        
            for(int i=0;i<data.length;i++)
            {
                try
                {
                        System.out.println("data["+i+"]:");
                         Scanner input=new Scanner(System.in);
                         data[i]=input.nextInt();
                } 
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        }
	
	void display()
        {
        for(int i=0;i<data.length;i++)
        {
            System.out.println(data[i]);
        }
        }
	
	
        void setAt(int index,int val)
        {
            data[index]=val;
        }
        
	int  getSet(int index)
        {
            return data[index];
        }
	
	int getCapacity()
        {
            return capacity;
        }
	void resize(int newCapacity)
        {
                if (newCapacity <= 0)
                {
                    return;
        	}

                int[] p= new int[newCapacity];
            //cout << (newCapacity > capacity ? capacity : newCapacity)<<endl;
                for (int i = 0 ; i < (newCapacity > capacity ? capacity : newCapacity) ; i++)
                {
                    p[i] = data[i];
        	}
            //this -> ~Array();
                data = p;
                capacity=newCapacity;
                
        }
	//Array(int capacity = 0);
	//Array(Array & ref);   compiler constructor
	
};

