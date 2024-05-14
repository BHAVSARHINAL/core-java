package com.corejava;
/**
 * <h3>This program reprensents compare two strings.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 */
public class StringEqualMethod {

	public static void main(String[] args) {
		String characterType = new String("hello");
		System.out.println("hello".equals("hello"));
		System.out.println("hello" == "hello");
		System.out.println("hello" == characterType);
		System.out.println(10 == 18);
		System.out.println('A' == 'B');
		System.out.println(45.43 == 22.23);
	}

}