package com.corejava;
/**
 * <h3>This program represents different types of string methods.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 */
public class StringMethod {

	public static void main(String[] args) {
		// charAt()
		System.out.println("QDEV TECHNOLAB".charAt(0));

		// concat()
		System.out.println("Hinal ".concat("Bhavsar"));

		// equal()
		String firstSentence = "Java Language";
		String secondSentence = "java Language";
		String thirdSentence = "python Language";
		String fourSentence = "";
		System.out.println(firstSentence.equals(secondSentence));
		System.out.println(firstSentence.equals(thirdSentence));

		// equalsIgnoreCase()
		boolean result = firstSentence.equalsIgnoreCase(secondSentence);
		System.out.println(result);

		// contains()
		System.out.println(firstSentence.contains("h"));

		// startsWith()
		System.out.println(firstSentence.startsWith("Java"));

		// endWith()
		System.out.println(firstSentence.endsWith("e"));

		// isEmpty()
		System.out.println(fourSentence.isEmpty());

		// joinString()
		System.out.println(String.join(" ","Ahmedabad", "is haritage", "city"));

		// length()
		System.out.println(firstSentence.length());

		// replace()
		String oldChar = "hello world";
		System.out.println(oldChar.replace('l', 'm'));

		// substring()
		String title = "Domestic Airport";
		System.out.println(title.substring(0, 8));
		System.out.println(title.substring(3));
		System.out.println(title.substring(3, 6));
		System.out.println(title.subSequence(3, 6));

		// indexOf()
		String checkIndex = "Java is platform independent";
		System.out.println(checkIndex.indexOf('p'));
		System.out.println(checkIndex.indexOf('a'));
		System.out.println( checkIndex.indexOf('S'));
		System.out.println( checkIndex.indexOf("plat"));
		System.out.println(checkIndex.indexOf("python"));
		System.out.println(checkIndex.indexOf(""));

		// trim()
		String projectName = "   Parking Managment System  ";
		System.out.println(projectName.trim());
	}

}