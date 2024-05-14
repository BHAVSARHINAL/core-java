package com.oops;
import java.util.Scanner;
/**
 * <h3>This program represents encapsulation which means wrapping up data into single unit.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 1-04-2024
 */
class Student {

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Encapsulation  {

	public static void main(String[] args) throws Exception {
		Student student = new Student();
		Scanner value = new Scanner(System.in);
		System.out.println("Enter student id : ");
		int id = value.nextInt();
		System.out.println("Enter student name : ");
		String name =  value.next();
		System.out.println("Enter student age : ");
		int age = value.nextInt();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		value.close();
		System.out.println("Student id is : " + student.getId());
		System.out.println("Student name is : " + student.getName());
		System.out.println("Student age is : " + student.getAge());
	}

}