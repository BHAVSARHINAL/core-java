package com.oops;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * <h3>This program represents print elements using set interface.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 11-04-2024
 */
public class SetCollection {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//add()
		set.add("Gujarat");
		set.add("Rajasthan");
		set.add("Maharastra");
		set.add("Punjab");
		set.add("Delhi");
		set.add("Delhi");
		set.add(null);
		System.out.println(set);
		System.out.println(set.contains("Punjab")); //contains()
		System.out.println(set.isEmpty()); //isEmpty()
		System.out.println(set.remove("Goa")); //remove()
		System.out.println(set);
		System.out.println(set.size()); //size()
		Iterator<String> iterator = set.iterator(); //iterator()
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}