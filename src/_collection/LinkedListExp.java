package _collection;

 

import java.util.LinkedList;

public class LinkedListExp {

	public static void main(String args[])
	{
		LinkedList <String> ll=new LinkedList<>();
		ll.add("bat");
		ll.add("cat");
		ll.add("mango");
		ll.add("mat");
		ll.add("nest");
		
		ll.add("hey");
		ll.add("path");
		ll.addFirst("tiger");
		System.out.println(ll.getClass());
		System.out.println(ll);
//		System.out.println(ll);
//		ll.add(0,"mango");
//		System.out.println(ll);
//		ll.add("mango");
//		System.out.println(ll);
//		ll.remove("mango");
//		System.out.println(ll);
//		ll.remove("mango");
//		System.out.println(ll);
	}
}

