package OOP;

/*

Encapsulation   ************************************************
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
Encapsulation in Java is a process of wrapping code and data together into a single unit,
 for example, a capsule which is mixed of several medicines.


To achieve Encapsulation, you must:   ************************************************

declare data members of the class private
provide public get and set methods to access and update the value of a private variable


Why Encapsulation?  ( Advantage of Encapsulation in Java  ) ************************************************

1) It provides you better control of class attributes and methods. Suppose you want to set the value of id which should be greater than 100 only, you can write the    logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

2) Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)

3) Flexible: the programmer can change one part of the code without affecting other parts

4) Increased security of data. It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

5) The encapsulate class is easy to test. So, it is better for unit testing.

6) The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create an encapsulated class in Java.



*/
 
public class encapsulation {
    public static void main(String[] args) 
    {
          //  encapsulation  =  attributes of a class should be hidden or private.
          //                    can be accessed only through methods (getters and setters)
         //                    you should make attribute private if you do not have a reason to make them public or protected 
     
         //      ( related to privacy statistics)
    
      //creating instance of Account class  
    Account acc=new Account();  
    //setting values through setter methods  
    acc.setAcc_no(7560504000L);  
    acc.setName("Sonoo Jaiswal");  
    acc.setEmail("sonoojaiswal@javatpoint.com");  
    acc.setAmount(500000f);  
    
    //getting values through getter methods  
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
    
    }
}
class Account 
{  
        //private data members  
        private long acc_no;  
        private String name,email;  
        private float amount;  
        //public getter and setter methods  
        public long getAcc_no() {  
            return acc_no;  
        }  
        public void setAcc_no(long acc_no) {  
            this.acc_no = acc_no;  
        }  
        public String getName() {  
            return name;  
        }  
        public void setName(String name) {  
            this.name = name;  
        }  
        public String getEmail() {  
            return email;  
        }  
        public void setEmail(String email) {  
            this.email = email;  
        }  
        public float getAmount() {  
            return amount;  
        }  
        public void setAmount(float amount) {  
            this.amount = amount;  
        }  
  
}  


//Read-Only class
//A Java class which has only getter methods.  
class Student1
{  
    //private data member  
    private String college="AKG"; 
    
    //getter method for college  
    public String getCollege()
    {  
        return college;  
    }  
} 



//Write-Only class
//A Java class which has only setter methods.  
class Student2
{  
    //private data member  
    private String college; 
    
    //getter method for college  
    public void setCollege(String college)
    {  
        this.college=college;  
    }  
}  