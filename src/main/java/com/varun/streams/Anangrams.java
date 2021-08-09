package com.varun.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anangrams {
	public static void main(String[] args) throws IOException {
		Path dictionary = Paths.get(args[0]);
		int minGroupSize = Integer.parseInt(args[1]);
		try (Stream<String> words = Files.lines(dictionary)) {
			words.collect(Collectors.groupingBy(word -> alphabetize(word))).values().stream()
					.filter(group -> group.size() >= minGroupSize)
					.forEach(g -> System.out.println(g.size() + ": " + g));
		}
	}

	public static String alphabetize(String word) {
		char[] arr = word.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
