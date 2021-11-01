/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_class;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Syed Nouman Rehman
 */
public class read_A_file {
    public static void main(String[] args) {
		
		// FileReader = read the contents of a file as a stream of characters. One by one
		//				read() returns an int value which contains the byte value of a single character ,convert to char
		//				when read() returns -1, there is no more data to be read
		
		try {
			FileReader reader = new FileReader("secret_message.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
			 	data = reader.read();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
