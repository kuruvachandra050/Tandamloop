package com.tandamloop.project;

import java.util.HashMap;
import java.util.Map;

public class Problem_4 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
		int[] multiples = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Map<Integer, Integer> countMap = new HashMap<>();

		// Initialize countMap with multiples as keys and 0 as initial count
		for (int multiple : multiples) {
			countMap.put(multiple, 0);
		}

		// Count the numbers that are multiples of the given multiples
		for (int number : numbers) {
			for (int multiple : multiples) {
				if (number % multiple == 0) {
					countMap.put(multiple, countMap.get(multiple) + 1);
				}
			}
		}

		// Print the output in the desired format
		StringBuilder output = new StringBuilder();
		output.append("{");
		for (int i = 0; i < multiples.length; i++) {
			output.append(multiples[i]).append(": ").append(countMap.get(multiples[i]));
			if (i != multiples.length - 1) {
				output.append(", ");
			}
		}
		output.append("}");

		System.out.println(output.toString());
	}

}
