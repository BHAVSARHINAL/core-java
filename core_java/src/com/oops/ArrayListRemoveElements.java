package com.oops;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/**
 * <h3>This program represents remove duplicate elements of the list.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 09-04-2024
 */
public class ArrayListRemoveElements {

	public static void main(String[] args) {
		ArrayList<String> firstList = new ArrayList<String>();
		//add()
		firstList.add("A");
		firstList.add("B");
		firstList.add("C");
		firstList.add("D");
		firstList.add("A");
		firstList.add("C");
		firstList.add("E");
		firstList.add("E");
		firstList.add("E");
		System.out.println(firstList);
		System.out.println(new LinkedHashSet<String>(firstList));
	}

}