package CopyObjects;


public class Copy_Objects {
    public static void main(String[] args) {
		
		
		Car car1 = new Car("Chevrolet","Camaro",2021);
		Car car2 = new Car("Ford","Mustang",2022);
                
//                car2=car1;     // shallow copy , both car1 and car2 refer to same object , both have same address
                
                car2.copy(car1); //  deep copy
                                 //  behaves as copy assignment operator as we copy object after object initialization
                                 //  but both object are independent to each other
                
                                 
		Car car3 = new Car(car1);  // call copy constructor ,   copy at initialization time
		  
                
		System.out.println(car1);  //  print addresses of car1 and car2
		System.out.println(car2);
		System.out.println();
                
		System.out.println(car1.getMake());  // print fields of car1
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
                
                
		System.out.println(car2.getMake());// print fields of car2
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
                
                
                
	
	}
}

    class Car 
    {

	
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	Car(Car x)   // copy constructor
        {
		//this.copy(x);
                System.out.println("Car(Car x)    copy constructor\n");
                this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car x) 
        {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
		
}
