package com.varun.creatingobjects.memoryleaks;

import java.util.Arrays;
import java.util.EmptyStackException;

import com.varun.commonmethods.equals.PhoneNumber;

public class StackWithoutMemoryLeaks implements Cloneable{
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

	@Override
	public StackWithoutMemoryLeaks clone() {
		try {
			StackWithoutMemoryLeaks copy = (StackWithoutMemoryLeaks)super.clone();
			copy.elements = elements.clone();
			return copy;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
	public static void main(String[] args) {
		StackWithoutMemoryLeaks phoneNumbers = new StackWithoutMemoryLeaks();
		PhoneNumber phoneNumber = new PhoneNumber(1, 91, 788374);
		
		phoneNumbers.push(phoneNumber);
		
		StackWithoutMemoryLeaks phoneNumbersCopy = phoneNumbers.clone();
		phoneNumbers.elements[0] = new PhoneNumber(2, 91, 788374);
		System.out.println(phoneNumbers.pop());
		
		System.out.println(phoneNumbersCopy.pop());
	}
	
	
}
