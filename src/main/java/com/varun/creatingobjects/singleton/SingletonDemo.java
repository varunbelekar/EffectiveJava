package com.varun.creatingobjects.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		SingletonWithPrivateMethod obj1 = SingletonWithPrivateMethod.getInstance();
		SingletonWithPrivateMethod obj2 = SingletonWithPrivateMethod.getInstance();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		SingletonLazy oLazy1 = SingletonLazy.getInstanceLazy();
		SingletonLazy oLazy2 = SingletonLazy.getInstanceLazy();
		System.out.println(oLazy1 == oLazy2);
		
	}
}
