package com.oops;
import java.util.Scanner;
/**
 * <h3>This program represents user define exception.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 05-04-2024
 */
class YoungerAgeException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	YoungerAgeException(String msg) {
		super(msg);
	}

}

public class CustomException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = value.nextInt();
		try {
			if (age < 18) {
				throw new YoungerAgeException("Not Eligible for voting");
			} else {
				System.out.println("Eligible for voting ");
			}
		} catch (YoungerAgeException e) {
			e.printStackTrace();
		}
			value.close();
	}

}