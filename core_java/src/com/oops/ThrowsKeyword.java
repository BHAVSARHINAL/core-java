package com.oops;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/**
 * <h3>This program represents file not found exception because this file is not
 * exists.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 05-04-2024
 */
@SuppressWarnings("resource")
class ReadAndWriteFile {

	void readFile() throws FileNotFoundException {
		new FileInputStream("myTestFile.txt");
	}

	void saveFile() throws FileNotFoundException {
		new FileOutputStream("userdata.txt");
	}

}

public class ThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException {
		ReadAndWriteFile read = new ReadAndWriteFile();
		read.readFile();
		read.saveFile();
	}

}