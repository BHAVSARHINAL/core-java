package com.oops;
import java.io.File;
import java.io.IOException;
/**
 * <h3>This program represents create new file and add user details.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 10-04-2024
 */
public class CreateFile {

	public static void main(String[] args) {
		File file = new File("myTestFile.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File " + file.getName() + " is created");
			} else {
				System.out.println("File is already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (file.exists()) {
			System.out.println("Get file name : " + file.getName());
			System.out.println("Get absolute path : " + file.getAbsolutePath());
			System.out.println("Get relative path : "+file.getPath());
			try {
				System.out.println("Get canonical path : "+file.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Can write in file : " + file.canWrite());
			System.out.println("Can read the file : " + file.canRead());
			System.out.println("Length of the file : " + file.length());
		} else {
			System.out.println("File doesn't exists");
		}
	}

}