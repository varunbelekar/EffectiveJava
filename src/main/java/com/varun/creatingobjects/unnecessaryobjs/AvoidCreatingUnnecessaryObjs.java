package com.varun.creatingobjects.unnecessaryobjs;

import java.util.concurrent.ExecutionException;

public class AvoidCreatingUnnecessaryObjs {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long startTime = System.currentTimeMillis();
		long sum = 0;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(sum + " in " + (endTime - startTime) / 1000 + " seconds");
	}
}
