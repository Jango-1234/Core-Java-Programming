package Strings;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "Hello@#World123!! Java$%^Automation!";
		System.out.println("String before removing junk values: " + s);
		String s1 = s.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println("String after removing junk values: " + s1);

	}

}
