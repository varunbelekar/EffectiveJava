package com.varun.generic.heterogenouscontainers;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
	private Map<Class<?>, Object> favorites = new HashMap<>();
	
	public <T> void put(Class<T> key, T value) {
		favorites.put(key, value);
	}
	
	public <T> T get(Class<T> key) {
		return key.cast(favorites.get(key));
	}
	
	public static void main(String[] args) {
		Favorites favorites = new Favorites();
		favorites.put(String.class, "varun");
		favorites.put(Integer.class, 1);
		
		int i = favorites.get(Integer.class);
		System.out.println(i);
		
		
		Map<Class<?>, Object> favoritesMap = new HashMap<>();
		favoritesMap.put(String.class, "varun");
		favoritesMap.put(Integer.class, 1);
	}
}
