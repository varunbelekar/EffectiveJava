package com.varun.creatingobjects.unnecessaryobjs;

import java.util.concurrent.ExecutionException;

public class AvoidCreatingUnnecessaryObjs {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long beforeUsedMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long startTime = System.currentTimeMillis();
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(sum + " in " + (endTime - startTime) / 1000 + " seconds");
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println(afterUsedMem - beforeUsedMem);
	}
}
