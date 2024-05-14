package com.corejava;
import java.util.Scanner;
/**
 * <h3>This program represents EMICalculation</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 */
public class EMICalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double principal, time, rate, interestCalculation;
		System.out.println("Enter the Principal");
		principal = input.nextFloat();
		System.out.println("Enter the Rate");
		rate = input.nextFloat();
		System.out.println("Enter the time in year");
		time = input.nextFloat();
		rate = rate / (12 * 100);
		time = time * 12;
		interestCalculation = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
		System.out.println("Monthly EMI is " + interestCalculation);
		input.close();
	}

}