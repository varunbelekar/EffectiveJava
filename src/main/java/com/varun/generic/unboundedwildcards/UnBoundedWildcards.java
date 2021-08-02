package com.varun.generic.unboundedwildcards;

import java.util.ArrayList;
import java.util.List;

public class UnBoundedWildcards {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3));
		swap(list, 0, 2);
		System.out.println(list);
		
		List<?> list2 = new ArrayList<>();
		//list2.add("varun"); --> Compile error
		list2 = list;
	}
	
	public static  void swap(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}
	
	public static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
}
