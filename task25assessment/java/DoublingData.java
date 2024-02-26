package org.task25assessment.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

 class ConsumerInterface{
	static void doubleList(List<Integer> list) {
		List<Integer> squares=list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(squares);
	}
}

public class DoublingData {

	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
        Consumer<List<Integer>> con = ConsumerInterface::doubleList;  
		con.accept(list);

	}

}
