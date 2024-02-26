package org.task20assessment.java;

import java.util.ArrayList;
import java.util.ListIterator;


public class MyListIterator
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("virat");
		list.add("rohit");
		list.add("king");
		list.add("pant");
		System.out.println(list);
		ListIterator itr = list.listIterator();
		while (itr.hasNext())
		{
			String s = (String) itr.next();
			if (s.equals("king"))
			{
				itr.set("king kohli");
				itr.add("hitman");
			}
		}
		System.out.println(list);
		System.out.println("reverse order:.....");
		while (itr.hasPrevious())
		{
			System.out.println(itr.previous());

		}
		
	}
}
