package org.task20assessment.java;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("virat");
		list.add("rohit");
		list.add("king");
		list.add("pant");
		System.out.println(list);
		Iterator itr = list.iterator();
		while (itr.hasNext())
		{
			String s = (String) itr.next();
			if (s.equals("king"))
			{
				itr.remove();
			}
		}
		System.out.println(list);
	}

}
