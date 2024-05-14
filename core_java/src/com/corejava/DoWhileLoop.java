package com.corejava;
/**
 *<h3>This program return print number 1 to 10 using do while loop.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 28-03-2024
 */
public class DoWhileLoop {

	public static void main(String[] args) {
		int number = 1;
		do {
			System.out.println(number);
			number++;
		} while (number <= 10);
	}

}