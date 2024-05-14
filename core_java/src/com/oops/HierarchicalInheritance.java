package com.oops;
/**
 * <h3>This program represent hierachical inheritance which means 
 * that main department is head of different type of sub departments.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 1-04-2024
 */

 abstract class University {

	University() {
		System.out.println("University contains many types of departments.");
	}

}

class ItDepartment extends University {

	public void typeOfDepartment() {
		System.out.println("IT department is sub depatment of university");
	}

}

class EcDepartment extends University {

	public void typeOfDepartment() {
		System.out.println("EC department is sub depatment of university");
	}

}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		ItDepartment itDepartment = new ItDepartment();
		itDepartment.typeOfDepartment();

		EcDepartment ecDepartment = new EcDepartment();
		ecDepartment.typeOfDepartment();
	}

}