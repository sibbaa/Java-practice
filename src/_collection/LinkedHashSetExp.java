package _collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExp 
{
	public static void main(String args[])
	{
		LinkedHashSet <Integer> lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		lhs.add(50);
		System.out.println(lhs.hashCode());
		System.out.println(lhs);
//		for(Integer lll:lhs)
		{
//			System.out.println(lll);
		}
		
		System.out.println( lhs.equals(10));
		System.out.println(lhs.size());
	}

}
