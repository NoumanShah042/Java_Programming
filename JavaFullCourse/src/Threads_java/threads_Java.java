package Threads_java;

/*

Thread:
A thread of execution in a program (kind of like a virtual CPU)
The JVM allows an application to have multiple threads running concurrently
Each thread can execute parts of you code in parallel with the main thread
Each thread has a priority.
Threads with higher priority are executed in preference compared to threads with a lower priority

    The Java Virtual Machine continues to execute threads until either of the following occurs :
        1. The exit method of class Runtime has been called
        2. All user threads have died

When a JVM starts up, there is a thread which calls the main method
This thread is called “main”

Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection 
JVM terminates itself when all user threads (non-daemon threads) finish their execution

*/ 	
    	
/*

 //*****************************************************
//    some useful thread methods
//*****************************************************

    //System.out.println(Thread.activeCount());    //  return count of total running threads

    //Thread.currentThread().setName("MAIN");
    //System.out.println(Thread.currentThread().getName());

    //Thread.currentThread().setPriority(10);
    //System.out.println(Thread.currentThread().getPriority());  // priority wil be between 1 and 10

    //System.out.println(Thread.currentThread().isAlive());     //  tell thread is running or not

//*****************************************************
//*****************************************************

*/
public class threads_Java {
    public static void main(String[] args) throws InterruptedException{  

    	for(int i =3 ; i>0 ; i--) 
        {
    		System.out.println(i);
    		Thread.sleep(1000);   // sleep for given time
    	}
    	
    	System.out.println("You are done!");
    	 
          
        //*****************************************************
        //     Create a Thread
        //*****************************************************
    
        
    	MyThread thread2 = new MyThread();
    	
    	//thread2.setDaemon(true);   //  make this a deamon thread
    	//System.out.println(thread2.isDaemon());
    	
    	thread2.start();          //  call run method
    	
    	//System.out.println(thread2.isAlive());
    	
    	//thread2.setName("2nd thread");
    	//System.out.println(thread2.getName());
    	
    	//thread2.setPriority(1);
    	//System.out.println(thread2.getPriority());      //  threads have  priority of the function that created it
    	
    	//System.out.println(Thread.activeCount());
    } 
}

//*******************************************************************

  class MyThread extends Thread
  {
 	@Override
	public void run() 
        {
             if(this.isDaemon())
            {
                System.out.println("This is a daemon thread that is running");
            }
            else {
                    System.out.println("This is a user thread that is running");
            }
	}
}
//***