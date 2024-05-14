package com.corejava;
/**
 * <h3>This program represents that create a practical with using the loop for 10 numbers and stop the execution after 7 numbers and skip any number</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 28-03-2024
 * 
 */
public class BreakStatement {

	public static void main(String[] args) {
		for (int row = 1; row <= 10; row++) {
			if (row == 8) {
				break;
			} else if (row == 5) {
				continue;
			}
			System.out.println(row);
		}
	}

}