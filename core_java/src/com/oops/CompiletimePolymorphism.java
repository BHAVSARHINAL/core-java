package com.oops;
/**
 * <h3>This program represents calcutation of the two variables.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 4-04-2024
 */
class Calculator {

	public int addValue(int length, int height) {
		return length * height;
	}

	public float addValue(int product, float price) {
		return (product + price);
	}

	public double addvalue(int chocolate,double amount) {
		return (chocolate * amount);
	}
}

public class CompiletimePolymorphism {

	public static void main(String[] args) {
		Calculator total = new Calculator();
		System.out.println("Total area is of rectangle is : " + total.addValue(4, 4));
		System.out.println("Total price of product is : " + total.addValue(2, 50.50f));
		System.out.println("Total amount of chocolate : "+total.addvalue(5, 25));
	}

}