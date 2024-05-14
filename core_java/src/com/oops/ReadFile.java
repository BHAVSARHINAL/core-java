package com.oops;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * <h3>This program represents read the data from created file.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 10-04-2024
 */
public class ReadFile {

	public static void main(String[] args) {
		File file = new File("myTestFile.txt");
		try {
			FileWriter writer = new FileWriter("myTestFile.txt");
			writer.write("Hello!! I am hinal bhavsar.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Scanner dataReader = new Scanner(file);
			while (dataReader.hasNextLine()) {
				System.out.println(dataReader.nextLine());
			}
			dataReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}