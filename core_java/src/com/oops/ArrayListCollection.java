package com.oops;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * <h3>This program represents print element in list.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 29-03-2024
 */

public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// add()
		list.add("Java");
		list.add("python");
		list.add("Php");
		list.add(".Net");
		list.add("React");
		System.out.println("list : " + list);
		list.add(2,"Angular");
		System.out.println(list);
		System.out.println("Contains : " + list.contains("python")); 
		System.out.println("get : " + list.get(3)); 
		System.out.println("indexOf : " + list.indexOf("Php")); 
		System.out.println("list : " + list);
		System.out.println("isEmpty : " + list.isEmpty()); 
		System.out.println("remove : " + list.remove(2)); 
		System.out.println("list : " + list);
		System.out.println(list.remove(".Net"));
		list.set(3,"Java"); // set()
		System.out.println("list : " + list);
		System.out.println("size : " + list.size()); 
		Iterator<String> iterator = list.iterator(); 
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		list.clear(); 
		System.out.println("list : " + list);
	}

}