package com.varun.generic.genericmethods;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class RecursiveTypeBound {
	/**
	 * @param c Collections of elements from which max is to be found.
	 * @return max element in this collection.
	 */
	public static <E extends Comparable<E>> E max(Collection<E> c) {
		if (c.isEmpty()) {
			throw new IllegalArgumentException();
		}
		E result = null;
		for (E e : c) {
			if (result == null || e.compareTo(result) > 0) {
				result = Objects.requireNonNull(e);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Collection<Integer> integers = List.of(1, 2, 23, 100);
		System.out.println(max(integers));
		Collection<String> names = List.of("varun", "aditya");
		System.out.println(max(names));
	}
}
