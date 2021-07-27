package com.varun.classes.inheritance;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author varun
 * Wrapper class uses composition in place of inheritance
 */
public class InstrumentedSet<E> extends ForwardingSet<E>{
	private int addCount = 0;
	
	public InstrumentedSet(Set<E> set) {
		super(set);
	}

	@Override
	public boolean add(E arg0) {
		addCount++;
		System.out.println("Overidden add method called");
		return super.add(arg0);
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		addCount += arg0.size();
		return super.addAll(arg0);
	}
	
	public int getAddCount() {
		return addCount;
	}
	
	public static void main(String[] args) {
		InstrumentedSet<String> set = new InstrumentedSet<String>(new HashSet<String>());
		set.addAll(List.of("varun", "anu", "aru"));
		System.out.println(set.addCount);
	}
}


