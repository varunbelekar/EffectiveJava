package com.varun.creatingobjects.singleton;

public class SingletonWithPrivateMethod {
	private static final SingletonWithPrivateMethod INSTANCE = new SingletonWithPrivateMethod();
	
	private SingletonWithPrivateMethod() {
		
	}
	
	public static SingletonWithPrivateMethod getInstance() {
		return INSTANCE;
	}
}
