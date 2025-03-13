package Strings;

import java.util.HashMap;

public class AnagramChecker {

	public static boolean areAnagrams(String str1, String str2) {

		// if lengths are not same they can't be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		// count the frequency of both the strings   
		for (char ch : str1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}

		for (char ch : str2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}

		// compare bothe frequency maps
		return map1.equals(map2);
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}

	}

}
