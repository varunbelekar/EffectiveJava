package com.varun.generic.arraysandlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserWithGenerics<T> {
	private final List<T> choiceList;
	
	public ChooserWithGenerics(Collection<T> choices) {
		this.choiceList = new ArrayList<>(choices);
	}
	
	public Object choose() {
		Random random = ThreadLocalRandom.current();
		return choiceList.get(random.nextInt(choiceList.size()));
	}
	
	
	public static void main(String[] args) {
		ChooserWithGenerics<Integer> chooser = new ChooserWithGenerics<>(List.of(1, 2, 3));
		
		Integer integer = (Integer)chooser.choose();
		System.out.println(integer);
	}
}
