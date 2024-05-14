package com.corejava;
/**
 * <h3>This program is combination of this and super keyword</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 * 
 */
class Admin {

	int id;
	String name;
	String email;

	public void setData(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public void display() {
		System.out.println("Admin id is: " + id);
		System.out.println("Admin name is: " + name);
		System.out.println("Admin email is: " + email);
	}

}

class User extends Admin {

	public void setChildClassData() {
		System.out.println("User class");
		super.setData(1, "Admin", "admin@gmail.com");
	}

}

public class ThisAndSuperKeyword {

	public static void main(String[] args) {
		User user = new User();
		user.setChildClassData();
		user.display();
	}

}