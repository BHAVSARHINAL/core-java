package com.oops;
import java.util.Scanner;

import com.google.common.primitives.Ints;
/**
 * <h3>This program represents print element in list.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 12-04-2024
 */

public class GuavaArrayIndex {

	public static int findIndex(int array[], int num) {
		return Ints.indexOf(array, num);
	}

	public static void main(String[] args) {
		System.out.println("Enter array element : ");
		int[] array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
		for (int value = 0; value < array.length; value++) {
			System.out.print(array[value] + " ");
		}
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Index position of element " + number + " is : " + findIndex(array, number));
		scanner.close();
	}

}