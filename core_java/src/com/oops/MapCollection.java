package com.oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * <h3>This program represents print elements in key value pair.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 11-04-2024
 */
public class MapCollection {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		// put()
		map.put(1, "Hinal");
		map.put(2, "Dhyani");
		map.put(3, "Kavya");
		map.put(4, "Jiya");
		System.out.println(map);
		System.out.println("containsKey : " + map.containsKey(1)); 
		System.out.println("containsValue : " + map.containsValue("hinal")); 
		System.out.println("get : " + map.get(2)); 
		System.out.println("isEmpty : " + map.isEmpty()); 
		System.out.println("remove : " + map.remove(1)); 
		System.out.println(map);
		System.out.println("replace : " + map.replace(2, null)); 
		System.out.println(map);
		System.out.println(map.replace(2, null, "Divya"));
		System.out.println(map);
		System.out.println("size : " + map.size()); 
		Set<Entry<Integer, String>> set = map.entrySet(); 	
		Iterator<?> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Get elements using forEach loop"); //forEach()
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " -> " + m.getValue());
		}
	}

}