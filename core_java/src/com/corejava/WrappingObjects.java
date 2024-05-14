package com.corejava;
/**
 * <h3>THis program is represents compare two variables of Wrapper class using
 * Wrapper classes</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 */
public class WrappingObjects {

	public static void main(String[] args) {
		Integer intFirstValue = Integer.valueOf(58);
		Integer intSecondValue = Integer.valueOf(55);
		boolean compareInteger =  (intFirstValue == intSecondValue);
		System.out.println("Comparasion of two integer value : " + compareInteger);

		Float floatFirstValue = Float.valueOf(58.58f);
		Float floatSecondValue = Float.valueOf(32.58f);
		boolean compareFloat = (floatFirstValue == floatSecondValue);
		System.out.println("Comparasion of two float value : " + compareFloat);

		Character charFirstValue = Character.valueOf('A');
		Character charSecondValue = Character.valueOf('K');
		boolean compareChar = (charFirstValue == charSecondValue);
		System.out.println("Comparasion of two character value : " + compareChar);

		String stringFirstValue = String.valueOf("Laptop");
		String stringSecondValue = String.valueOf("Computer");
		boolean compareString = (stringFirstValue == stringSecondValue);
		System.out.println("Comparasion of two String value : " + compareString);

		Double doubleFirstValue = Double.valueOf(87.75);
		Double doubleSecondValue = Double.valueOf(52.25);
		boolean compareDouble = (doubleFirstValue == doubleSecondValue);
		System.out.println("Comparasion of two double value : " + compareDouble);

		Boolean booleanFirstValue = Boolean.valueOf(true);
		Boolean booleanSecondValue = Boolean.valueOf(false);
		boolean compareBoolean = booleanFirstValue == booleanSecondValue;
		System.out.println("Comparasion of two boolean value : "+compareBoolean);
	 }

}