package com.oops;
/**
 * <h3>This program represents how to handle particular exception with
 * appropriate exceptiont type.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 05-04-2024
 */
public class TryCatchFinallyBlock {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// ArithmeticException
		try {
			System.out.println(50 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Mentioned number cannot devide by zero..");
		}

		// NullPointerException
		String name = null;
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("Please! enter valid name");
			e.printStackTrace();
		}

		// NumberFormatException
		try {
			System.out.println(Integer.parseInt("java"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Please!! enter valid number");
		}

		// Try block without catch block
		try {
			System.out.println(50 / 2);
		}

		// Finally block
		finally {
			System.out.println("Finally : Exception is generate or not but finally block will execute..");
		}
	}

}