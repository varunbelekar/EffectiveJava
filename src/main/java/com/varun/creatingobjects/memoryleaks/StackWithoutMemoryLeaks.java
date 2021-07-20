package com.varun.creatingobjects.memoryleaks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackWithoutMemoryLeaks {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 16;
	
	public StackWithoutMemoryLeaks() {
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		Object result =  elements[--size];
		elements[size] = null;// Eliminating obsolete reference
		return result;
	}
	
	public void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
}
