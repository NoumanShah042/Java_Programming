/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Syed Nouman Rehman
 */
public class TimerTask_Java {
    public static void main(String[] args) {
		
		// Timer = 		A facility for threads to schedule tasks 
		//			for future execution in a background thread
		
		// TimerTask = 	A task that can be scheduled for one-time 
		//		or repeated execution by a Timer
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;
//                      @Override
//			public void run() {
//				if(counter>0) {
//					System.out.println(counter+" seconds");
//					counter--;
//				}
//				else {
//					System.out.println("HAPPY NEW YEAR!");
//					timer.cancel();
//				}
//			}	
//                        
                        
                        @Override
                        public void run() {
		          System.out.println("task completed :(");
                           //timer.cancel();
			}	
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2021);
		date.set(Calendar.MONTH,Calendar.JANUARY);
		date.set(Calendar.DAY_OF_MONTH,9);
		date.set(Calendar.HOUR_OF_DAY,23);
		date.set(Calendar.MINUTE,35);
		date.set(Calendar.SECOND,25);
		date.set(Calendar.MILLISECOND,0);
		
		timer.schedule(task, 2000);    //  run task after given time ( 0 means run immediately,  3000 means run after 3 sec)   
		//timer.schedule(task, date.getTime());    //  perform task(or execute run method ) at a specific time
		//timer.scheduleAtFixedRate(task, 0, 1000);   // repeat a task so often (task,firstTime ,time to repeat)
		//timer.scheduleAtFixedRate(task, date.getTime(), 1000);
               // System.out.println("hello");
                
                
                
	}
}
