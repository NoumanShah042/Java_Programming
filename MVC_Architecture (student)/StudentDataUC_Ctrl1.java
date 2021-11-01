/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */
public class StudentDataUC_Ctrl1 {
    
      Student model; // model=getDataFromdatabase();//  this line is responsible for Database Connection
      StudentView  view; //=new   StudentView();
      StudentCtrl controller;//=new  StudentCtrl(model,view);

    public StudentDataUC_Ctrl1() {
        
        model= getDataFromdatabase();//  this line is responsible for Database Connection
        view =new   StudentView();
        controller=new  StudentCtrl(model,view);
    }
      public void viewData()
      {
      controller.viewStudentData(); 
      
      }
      
    private static Student getDataFromdatabase()
    {
    Student std=new Student();
    std.setName("Nouman");
    std.setRollNum("bcsf18m027");
    std.setGender("Male");
    
    return std;
    }
}
