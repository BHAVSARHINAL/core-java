package com.corejava;
/**
 * <h3>This program is created for introduce about constructors and making a sum
 * using constructors in java.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 */
class Cube {

	double height, width, length;
	Cube() {
		System.out.println("This is Default Constructor");
	}

	Cube(double height, double width, double length) {
		this.height = height;
		this.width  = width;
		this.length = length;
	}

	public void areaOfCube() {
		System.out.println("Size of Cube : " + height * width * length + " centimetres");
	}

}

public class Constructor {

	Constructor() {
		System.out.println("No argument Constuctor");
	}

	Constructor(int firstDigit, int secondDigit) {
		int sum = firstDigit + secondDigit;
		System.out.println("Sum of two digit " + sum);
	}

	public static void main(String[] args) {
		new Constructor();
		new Constructor(5, 10);
		new Cube();
		Cube cube = new Cube(5, 5, 5);
		cube.areaOfCube();
	}

}