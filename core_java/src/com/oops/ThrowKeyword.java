
package com.oops;
/**
 * <h3>This program represents how to create custom exception.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 05-04-2024
 */
class UserAgeException extends Exception {

	private static final long serialVersionUID = 1L;
	UserAgeException(String message) {
		super(message);
	}

}

public class ThrowKeyword {

	public static void main(String[] args) {
		try {
			int age = 10;
			if (age < 18) {
				throw new UserAgeException("You are under age");
			} else {
				System.out.println("Now you can voting!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}