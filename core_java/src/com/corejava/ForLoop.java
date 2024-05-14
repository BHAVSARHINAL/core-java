package com.corejava;
/**
 * <h3>This program represents start pattern with using row and column.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 28-03-2024
 */
public class ForLoop {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row = 5; row >= 1; row--) {
			for (int column = row-1; column >= 1; column--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}