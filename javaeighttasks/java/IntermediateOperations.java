package org.javaeighttasks.java;

import java.util.*;
import java.util.stream.Collectors;

//give an example for 1.distinct() 2.limit() 3.skip() 4. peek() 5.flatMap()
// peek is used for debugging purpose
//distinct returns all the different elements
public class IntermediateOperations {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0, 1, 5, 3, 1, 11);
		list.stream().peek(System.out::println).count();
		List s=list.stream().limit(5).filter(p->p%2!=0).peek(e->System.out.println("peeked item is "+e))
				.collect(Collectors.toList());
		s.forEach(y->System.out.println(y));
		
		
		list.stream().distinct().peek(e->System.out.println("peeked item is"+e))
		.forEach(y->System.out.println(y));
		
		
		List s1=list.stream().skip(3).filter(p->p%2!=0).peek(e->System.out.println("peeked item is "+e))
				.collect(Collectors.toList());
		s1.forEach(y->System.out.println(y));
		
		
		List<Integer> list1 = Arrays.asList(0, 1, 5, 3, 1, 11);
		List<Integer> list2 = Arrays.asList(0, 1, 5, 3, 1, 11);
		List <List<Integer>>allList= Arrays.asList(list1,list2);
		
		System.out.println("arrayList before flatmap:");
		System.out.println(allList);
		System.out.println("arrayList after flatmap:");

		List<Integer> bb=allList.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		
		System.out.println(bb);
		//bb.forEach(y->System.out.println(y));
		
		
	
	}

}
