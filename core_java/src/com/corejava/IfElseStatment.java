package com.corejava;
import java.util.Scanner;
/**
 * <h3>This program represents that user's age valid or not for voting.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 28-03-2024
 */
public class IfElseStatment {

	public static void main(String[] args) {
		System.out.println("Enter your Age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age >= 18) {
			System.out.println("You are able for voting");
		} else {
			System.out.println("You are not able for voting");
		}
		scanner.close();
	}

}