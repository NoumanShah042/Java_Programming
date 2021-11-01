/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_class;

import java.io.File;

/**
 *
 * @author Syed Nouman Rehman
 */
public class File_practice {
  public static void main(String[] args) {
  
    // file = An abstract representation of file and directory pathnames

    File file = new File( "secret_message.txt");  //  "C:\\Users\\Syed Numan Rehman\\Desktop\\secret_message.txt"  or "C:/Users/Syed Numan Rehman/Desktop/secret_message.txt" both works

    if(file.exists()) {
     System.out.println("That file exists! :O!");
//     System.out.println(file.getPath());
//     System.out.println(file.getAbsolutePath());
//     System.out.println(file.isFile());
//     file.delete();
    }
    else {
     System.out.println("That file doesn't exist :(");
    }  
 }   
}
