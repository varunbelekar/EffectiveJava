package com.varun.classes.inheritance;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author varun
 * Reusable forwarding class.
 */
public class ForwardingSet<E> implements Set<E> {
	private final Set<E> set;
	public ForwardingSet(Set<E> set) {
		this.set = set;
	}

	@Override
	public boolean add(E arg0) {
		return set.add(arg0);
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		return set.addAll(arg0);
	}

	@Override
	public void clear() {
		set.clear();
	}

	@Override
	public boolean contains(Object arg0) {
		return set.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return set.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
		return set.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return set.iterator();
	}

	@Override
	public boolean remove(Object arg0) {
		return set.remove(arg0);
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		return set.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return set.retainAll(arg0);
	}

	@Override
	public int size() {
		return set.size();
	}

	@Override
	public Object[] toArray() {
		return set.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return set.toArray(arg0);
	}
}
