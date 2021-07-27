package com.varun.classes.inheritance;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class InstrumentedHashSet<E> extends HashSet<E> {
	private int addCount = 0;

	public InstrumentedHashSet() {

	}

	public InstrumentedHashSet(int intialCapacity, float loadFactor) {
		super(intialCapacity, loadFactor);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		System.out.println("calling overiden add method");
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		addCount += arg0.size();
		return super.addAll(arg0);
	}
	
	public static void main(String[] args) {
		InstrumentedHashSet<String> set = new InstrumentedHashSet<String>();
		set.addAll(List.of("varun", "aru", "anu"));
		System.out.println(set.addCount);
	}
	
}

