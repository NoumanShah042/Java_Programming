package P02_IntermediateJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {

	public static void main(String[] args) throws IOException {

		File file;
		PrintWriter pw = null;
		try {
			file = new File(System.getProperty("user.dir") + "\\file\\DemotextFile.txt");
			if (!file.exists())
				file.createNewFile();

			pw = new PrintWriter(file);
			pw.println("1. This is just for testing ");
			pw.println("2. This is just for demo test");
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
		
		readFile();
	}

	public static void readFile() throws IOException {
		BufferedReader br = null;
		try {	
			br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\file\\DemotextFile.txt"));
			String line = br.readLine();

//			while ((line = br.readLine()) != null) {
				System.out.println(br.readLine());
//			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}

}
