package com.oops;
import java.util.Scanner;
/**
 * <h3>This program represent index of an array element.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 12-04-2024
 */

public class LinearSearchArrayIndex {

	public static int searchElement(int array[], int element) {
		for (int number = 0; number < array.length; number++) {
			if (array[number] == element) {
				return number;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int array[] = { 20, 80, 10, 40, 50, 60 };
		System.out.print("Enter element between : ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		int element = value.nextInt();
		int result = searchElement(array, element);
		if (result == -1) {
			System.out.println("Element is not present in array ");
		} else {
			System.out.println("Element " + element + " is present at index : " + result);
		}
		value.close();
	}

}