package com.varun.creatingobjects.singleton;

import java.io.Serializable;

public class SingletonLazy implements Serializable{
	private static SingletonLazy INSTANCE = null;
	
	private int value;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstanceLazy() {
		if (INSTANCE == null) {
			synchronized (SingletonLazy.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonLazy();
				}
			}
		}
		return INSTANCE;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "SingletonLazy [value=" + value + "]";
	}
	
	protected Object readResolve() {
		return INSTANCE;
	}
	
}
