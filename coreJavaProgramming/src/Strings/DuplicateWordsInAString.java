package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInAString {

	public static void main(String[] args) {

		findDuplicateWords("Hey java is java best language is java");
		findDuplicateWords("Hey python is not java best language is python");
		findDuplicateWords("hi hi hi hi");
		findDuplicateWords("100 100 200 100 200");
	}

	private static void findDuplicateWords(String inputString) {

		// split:
		String words[] = inputString.split(" ");

		// create one hashmap:
		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		// To cehck each word in given array:
		for (String word : words) {

			// if word is present:
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		// Extracting all the keys of map - wordCount:
		Set<String> wordsInString = wordCount.keySet();

		// loop through all the words in wordCount:
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + ":" + wordCount.get(word));
			}
		}
	}

}
