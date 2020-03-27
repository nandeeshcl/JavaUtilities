package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {

		// Connectivity
		File f = new File(".\\src\\test\\resources\\fileWriter\\testData.txt");
		FileReader fw = new FileReader(f);
		BufferedReader reader = new BufferedReader(fw);

		String line = null; // initially line is null
		while ((line = reader.readLine()) != null) // reade line , store in line , check its not equal to null then
													// print it
		{
			System.out.println(line);
		}

		// close file
		reader.close();
	}

}
