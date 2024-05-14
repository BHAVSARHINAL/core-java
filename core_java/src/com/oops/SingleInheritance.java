package com.oops;
/**
 * <h3>This program represents single inheritance which means access super class property into sub class.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 1-04-2024
 */
class Animal {

	public void domesticAndWildAnimals() {
		System.out.println("Domestic and wild is a types of animals.");
	}

}

class Dog extends Animal {

	public void typeOfAnimal() {
		System.out.println("Dog is a domestic animal.");
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.domesticAndWildAnimals();
		dog.typeOfAnimal();
	}

}