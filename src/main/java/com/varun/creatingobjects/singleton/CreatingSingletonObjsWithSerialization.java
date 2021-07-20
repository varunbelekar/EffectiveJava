package com.varun.creatingobjects.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CreatingSingletonObjsWithSerialization {
	public static void main(String[] args) {
		SingletonLazy obj1 = SingletonLazy.getInstanceLazy();
		obj1.setValue(1);
		
		//Serialize
		try (FileOutputStream fos = new FileOutputStream("/home/varun/testfiles/out.ser");
				ObjectOutputStream out = new ObjectOutputStream(fos)){
			out.writeObject(obj1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		obj1.setValue(2);
		
		//Deserialize
		SingletonLazy obj2 = null;
		try(FileInputStream is = new FileInputStream("/home/varun/testfiles/out.ser");
				ObjectInputStream ois = new ObjectInputStream(is)) {
			obj2 = (SingletonLazy)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (obj1 == obj2) {
			System.out.println("Two objects are the same");
		}else {
			System.out.println("Not same");
		}
		
		System.out.println(obj1.getValue());
		System.out.println(obj2.getValue());
	}
}
