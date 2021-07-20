package com.varun.creatingobjects.singleton;

public class SingletonEnumDemo {
	public static void main(String[] args) {
		SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
		SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
		System.out.println(singletonEnum1 == singletonEnum2);
		System.out.println(singletonEnum1.getValue());
		singletonEnum2.setValue(2);
		System.out.println(singletonEnum1.getValue());
	}
}
