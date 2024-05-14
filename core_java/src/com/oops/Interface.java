package com.oops;
/**
 * <h3>This program represents different types of shapes.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 05-04-2024
 */

interface Shapes {

	public void square();
	public void circle();
	public void triangle();
	public void rectangle();

}

class ShapeTypes implements Shapes {

	public void square() {
		System.out.println("Square is type of shape.");
	}

	public void circle() {
		System.out.println("Circle is type of shape.");
	}

	public void triangle() {
		System.out.println("Traingle is type of shape.");
	}

	public void rectangle() {
		System.out.println("Ractangle is type of shape.");
	}

}

public class Interface {

	public static void main(String[] args) {
		ShapeTypes shape = new ShapeTypes();
		shape.circle();
		shape.triangle();
		shape.rectangle();
		shape.square();
	}

}