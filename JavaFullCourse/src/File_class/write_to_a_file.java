/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_class;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Syed Nouman Rehman
 */
public class write_to_a_file {
    public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt"); // automaticallty create file , see in file menu
			writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
			writer.append("\n(A poem by Bro)");
			writer.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
