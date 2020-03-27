package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//used to write data into any type of files

public class FileWriter1 {

	public static void main(String[] args) throws IOException {

		/// connectivity to file
		File f = new File(".\\src\\test\\resources\\fileWriter\\testData2.html"); // provide location of the file
		FileWriter fw = new FileWriter(f, false); // true: it will appends data, if we remove it it will overwrite
		BufferedWriter writer = new BufferedWriter(fw); // writer is used to write into the file

		// writing inside the text or csv file
		/*
		 * writer.write("India"); writer.newLine(); writer.write("USA");
		 * writer.newLine(); writer.write("Pakistan"); writer.newLine();
		 */

		// writing random number into files
		/*
		 * for (int i = 0; i < 5; i++) { // to write random number to file int num =
		 * (int) (Math.random() * 100); // generate random number and write to file
		 * writer.write("New data is: " + num); //write to file writer.newLine(); }
		 */

		// writing into html file
		writer.write("<html> <body> <title> <br>WELCOME MAN<br> </title><h1> Click to open  </h1>  </body>   </html>");

		/// close connectivity
		writer.close();

		System.out.println("Data added to file");

	}

}
