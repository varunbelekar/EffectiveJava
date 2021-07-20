package com.varun.creatingobjects.singleton;

public class SingletonWithPrivateMethod {
	public static final SingletonWithPrivateMethod INSTANCE = new SingletonWithPrivateMethod();
	
	private SingletonWithPrivateMethod() {
		
	}
	
	public static SingletonWithPrivateMethod getInstance() {
		return INSTANCE;
	}
}
