package com.oops;
import java.util.LinkedList;
/**
 * <h3>This program represents print elements in list.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 11-04-2024
 */
public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		// add()
		linkedlist.add("A");
		linkedlist.add("B");
		System.out.println(linkedlist);
		linkedlist.add(2, "C");
		System.out.println(linkedlist);
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.addAll(linkedlist);
		System.out.println(list);
		list.addFirst("1");
		System.out.println("List : " + list);
		list.addLast("5");
		System.out.println(list);
		Object seceondList = new LinkedList<String>();
		seceondList = list.clone();
		System.out.println(seceondList);
		System.out.println("contains : " + list.contains("A"));
		System.out.println("get : " + list.get(2));
		System.out.println("getFirst : " + list.getFirst());
		System.out.println("getLast : " + list.getLast());
		System.out.println("IndexOf : " + list.indexOf("D"));
		System.out.println("isEmpty : " + list.isEmpty());
		System.out.println("lastIndexOf : " + list.lastIndexOf("5"));
		System.out.println("list : " + list);
		System.out.println("peek : " + list.peek());
		System.out.println("peekFirst : " + list.peekFirst());
		System.out.println("peekLast : " + list.peekLast());
		System.out.println("poll : " + list.poll());
		System.out.println(list);
		System.out.println("pollFirst : " + list.pollFirst());
		System.out.println(list);
		System.out.println("pollLast : " + list.pollLast());
		System.out.println(list);
		System.out.println("remove : " + list.remove(2));
		System.out.println(list);
		System.out.println(list.remove("A"));
		System.out.println(list);
		System.out.println("removeFirst :" + list.removeFirst());
		System.out.println("removeLast : " + list.removeLast());
		System.out.println(list);
	}

}