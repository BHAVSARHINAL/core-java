package com.corejava;
import java.util.Scanner;
/**
 * <h3>This program represents name of the month depends on the selected number between 1-12</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 28-03-2024
 */
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Enter any number between 1-12 to display the month");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Auguest");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Octomber");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("You have entered an invalid number");
		}
		scanner.close();
	}

}