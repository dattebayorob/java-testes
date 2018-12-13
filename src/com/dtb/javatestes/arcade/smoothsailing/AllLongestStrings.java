package com.dtb.javatestes.arcade.smoothsailing;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {
	public static void main(String[] args) {
		String[] teste = allLongestStrings(new String[] { "aa", "abc", "abcde", "acdbe" });
		for (String string : teste) {
			System.out.print(string);
		}
	}

	static String[] allLongestStrings(String[] inputArray) {
		int size = 0;
		List<String> teste = new ArrayList<>();
		for (String input : inputArray) {
			if (input.length() >= size)
				size = input.length();
		}
		for (String inputString : inputArray) {
			if (inputString.length() == size)
				teste.add(inputString);
		}
		return teste.toArray(new String[teste.size()]);
	}
}
