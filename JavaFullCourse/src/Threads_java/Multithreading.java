package Threads_java;
 
/*

Multithreading =
* Process of executing multiple threads simultaneously
* Helps maximum utilization of CPU
* Threads are independent, they don't affect the execution of other threads
* An exception in one thread will not interrupt other threads
* useful for serving multiple clients, multiplayer games, or other mutually independent tasks

 */
  //   https://www.youtube.com/watch?v=J09TLPgwd0Y&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=87
  
public class Multithreading 
{
    
    //  if one thread caues exception other thread will still continue
     public static void main(String[] args) throws InterruptedException
     {  

    	// Create a subclass of Thread
    	MyThread2 thread1 = new MyThread2();
    	  
    	//or 
    	
    	//implement Runnable interface and pass instance as an argument to Thread() 
    	MyRunnable runnable1 = new MyRunnable();
    	Thread thread2 = new Thread(runnable1);
    	
        
    	//  java virtual machine is going to  wait to exit until all the user threads are finished
        //  java virtual machine  will not wait for any deamon thread before exiting
        
//    	thread1.setDaemon(true);   //  so if we make our threads , deamons and our main thread wil cause exception
//        thread2.setDaemon(true);    //   JVM will immediately stop and do wait for these deamon threads
//    	
    	
    	thread1.start();
        //thread1.join();  
    	//thread1.join(3000); // calling thread (ex.main) waits until the specified thread dies or for x milliseconds
                              //so the thread2 will also pause as main is waiting for thread1
    	thread2.start();
    	
        
        //   undertanding the working of deamon threads
        
//        for(int i=0;i<100;i++)
//        {
//            System.out.println("\nnomi");
//            Thread.sleep(1000);
//            if(i==5)
//            {
//              System.out.println(1/0);
//            
//            }
//        
//        }


   	//System.out.println(1/0);
    } 
}
class MyThread2 extends Thread
{
    @Override
    public void run()
    {
         for(int i =10 ;i > 0 ; i--) 
         {
            System.out.println("Thread #1 : "+i);
                try 
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e) 
                {
                        e.printStackTrace();
                }
        }
        System.out.println("Thread #1 is finished :)");
    }
}

class MyRunnable implements Runnable
{

    @Override
    public void run() {

            for(int i =0;i<10;i++) 
            {
                System.out.println("Thread #2 : "+i);
                try 
                {
                        Thread.sleep(1000);
                } 
                catch (InterruptedException e) {
                        e.printStackTrace();
                }
            }
            System.out.println("Thread #2 is finished :)");
    }
        
}