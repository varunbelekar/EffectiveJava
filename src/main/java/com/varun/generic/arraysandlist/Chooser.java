package com.varun.generic.arraysandlist;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser {
	private final Object[] choiceArray;

	public Chooser(Collection choices) {
		this.choiceArray = choices.toArray();
	}
	
	public Object choose() {
		Random random = ThreadLocalRandom.current();
		return choiceArray[random.nextInt(choiceArray.length)];
	}
	
	
	public static void main(String[] args) {
		Chooser chooser = new Chooser(List.of(1,2,3, "varun"));
		
		Integer integer = (Integer)chooser.choose();
		System.out.println(integer);
	}
}
