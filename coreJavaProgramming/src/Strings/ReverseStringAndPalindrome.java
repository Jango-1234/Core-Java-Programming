package Strings;

import java.util.Scanner;

public class ReverseStringAndPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        String org_str = str;
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String is:" +rev);
        if (org_str.equals(rev)) {
            System.out.println(org_str + " is a Palindrome String");
        } else {
            System.out.println(org_str + " is not a Palindrome String");

        }
    }
}
