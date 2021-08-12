package _collection;

import java.util.HashSet;

public class HashSetExp 
{
	public static void main(String args[])
	{
		HashSet<Integer> hs=new HashSet<>();
		hs.add(11);
		hs.add(16);
		hs.add(12);
		hs.add(13);
		hs.add(18);
		hs.add(14);
		hs.add(15);
		 
		System.out.println(hs.size());
//		hs.remove(11);
		System.out.println(hs);
//		hs.removeAll(hs);
		hs.add(11);
		 
		System.out.println(hs);
	}

}
