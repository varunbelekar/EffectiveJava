package com.varun.creatingobjects.singleton;

public class SingletonLazy {
	public static SingletonLazy INSTANCE = null;
	
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
}
