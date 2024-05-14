package com.oops;
/**
 * <h3>This program represents abstraction which means display only essential parts of the vehicle and
 * rest of parts will be hide.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 */
abstract class Bike {

	Bike() {
		System.out.println("Bike is type of vehicle");
	}

	abstract void driveVehicle();

	public void changeGear() {
		System.out.println("We can change gear in bike as per requirment");
	}

}

class KTM extends Bike {

	public void driveVehicle() {
		System.out.println("We should drive safely");
	}

}

public class DataAbstraction {

	public static void main(String[] args) {
		KTM bike = new KTM();
		bike.driveVehicle();
		bike.changeGear();
	}

}