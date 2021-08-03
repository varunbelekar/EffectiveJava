package com.varun.generic.varargs;

import java.util.ArrayList;
import java.util.List;

public class Varargs {
	public static void main(String[] args) {
//		intVarargs(1, 2, 3);
//		listVarargs(List.of("varun", "aruj"), List.of("bel", "tok"));
		List<Integer> result = flatten(List.of(1, 2), List.of(3, 4));
		System.out.println(result);
		System.out.println(flatten(List.of(1, 2), List.of("varun")));
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		lists.add(List.of(1, 2));
		lists.add(List.of(3, 4));
		System.out.println(flattenUsingList(lists));
	}
	
	public static void intVarargs(int... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	public static void listVarargs(List<String>... stringLists) {
		List<Integer> intList = List.of(42);
		Object[] objects = stringLists;
		objects[0] = intList;// Heap pollution
		String s = stringLists[0].get(0); // ClassCastException
	}
	
	/**
	 * @param lists List's of elements of type T
	 * @return flattened list by combining the elements of list's into single list.
	 */
	@SafeVarargs
	public static <T> List<T> flatten(List<? extends T>... lists) {
		List<T> result = new ArrayList<>();
		for (List<? extends T> list : lists) {
			result.addAll(list);
		}
		return result;
	}
	
	public static <T> List<T> flattenUsingList(List<List<T>> lists) {
		List<T> result = new ArrayList<T>();
		for (List<? extends T> list : lists) {
			result.addAll(list);
		}
		return result;
	}
	
}
