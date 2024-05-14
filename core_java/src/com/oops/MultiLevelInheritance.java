package com.oops;
/**
 * <h3>This program represents that multileval inheritance which means single inheritance can be access in
 * sub class.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 1-04-2024
 */

class Vehicle {

	public void driveVehicle() {
		System.out.println("Vehicle is usefull for transfortation.");
	}

}

class Car extends Vehicle {

	public void typeOfVehicle() {
		System.out.println("Car is a type of vehicle.");
	}

}

class ElectricCar extends Car {

	public void typeOfcar() {
		System.out.println("Electric car is a type of car.");
	}

}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		ElectricCar car = new ElectricCar();
		car.driveVehicle();
		car.typeOfVehicle();
		car.typeOfcar();
	}

}