package com.corejava;
/**
 *<h3>This program represents static keyword in java</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 */
class Student {

	int id;
	String name;
	static String UNIVERSITY = "IBS";

	static void change() {
		UNIVERSITY = "Gujarat University";
	}

	public Student(int i, String n) {
		id = i;
		name = n;
	}

	public void display() {
		System.out.println("Student id is : " + id);
		System.out.println("Student name is : " + name);
		System.out.println("Student university is : " + UNIVERSITY);
		
	}

}

public class StaticKeyword {

	public static void main(String[] args) {
		Student.change();
		Student student = new Student(1, "Hinal");
		student.display();
	}

}