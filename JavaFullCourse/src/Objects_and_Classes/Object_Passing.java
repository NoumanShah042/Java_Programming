package Objects_and_Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class Object_Passing {
    public static void main(String[] args) {
			
		Garage garage = new Garage();
		
		Van car1 = new Van("BMW");
		Van car2 = new Van("Tesla");
		
		garage.park(car1);
		garage.park(car2);
		
	}
}
  class Garage {


	void park(Van car) {
		System.out.println("The "+car.name+" is parked in the garage");
	}
   }
  class Van 
  {


	String name;
	
	Van(String name){
		this.name = name;
	}
	
}