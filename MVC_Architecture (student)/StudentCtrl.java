/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Nouman Rehman
 */

//for view data there should be a controller and if we insert data there should be a separate controller

public class StudentCtrl {
    
    private Student model;
    private StudentView view;
        
    public StudentCtrl(Student model,StudentView view) {
     this.model=model;
     this.view =view;
    }
    
    public void setStudentNmae(String name)
    {
       this.model.setName(name);
    }
    public void setStudentRollNum(String rollNum)
    {
       this.model.setRollNum(rollNum);
    }
    public void setStudentGender(String gender)
    {
       this.model.setGender(gender);
    }
    
    public String getSname()
    {
    return model.getName();
    }
    public String getSRollNum()
    {
    return model.getRollNum();
    }
    public String getSGender()
    {
      return model.getGender();
    }
    public void viewStudentData()
    {
         view.printData(model.getName(), model.getRollNum(), model.getName());
    }
}
