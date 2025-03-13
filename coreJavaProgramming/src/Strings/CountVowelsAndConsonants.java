package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		String input = "Hello World"; // Example input string
		countVowelsAndConsonants(input);
	}

	public static void countVowelsAndConsonants(String str) {
		str = str.toLowerCase(); // Convert to lowercase for uniformity
		Map<String, Integer> countMap = new HashMap<>();
		countMap.put("Vowels", 0);
		countMap.put("Consonants", 0);

		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				if ("aeiou".indexOf(ch) != -1) {
					countMap.put("Vowels", countMap.get("Vowels") + 1);
				} else {
					countMap.put("Consonants", countMap.get("Consonants") + 1);
				}
			}
		}

		System.out.println("Vowels: " + countMap.get("Vowels"));
		System.out.println("Consonants: " + countMap.get("Consonants"));
	}
}
