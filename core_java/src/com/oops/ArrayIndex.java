package com.oops;
import java.util.Arrays;
import java.util.Scanner;
/**
 * <h3>This program represents index of an array element.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 05-04-2024
 */

public class ArrayIndex {

	public static int findArrayIndex(int array[], int element) {
		for (int number = 0; number < array.length; number++) {
			if (array[number] == element) {
				return number;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner inputElemnet = new Scanner(System.in);
		int[] array = { 100, 580, 340, 407, 650, 680 };
		System.out.println("Array : "+Arrays.toString(array));
		System.out.print("Enter array element : ");
		int element = inputElemnet.nextInt();
		int index = findArrayIndex(array, element);
		System.out.println("Index of element " + element + " : " + index);
		inputElemnet.close();
	}

}