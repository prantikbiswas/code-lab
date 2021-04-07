package com.conceptfactory.problems.misc;

public class PalindromeString {

    public static void main(String[] args) {
        PalindromeString s = new PalindromeString();

        System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        String alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println(alphanumeric);

        int left = 0;
        int right = alphanumeric.length() - 1;

        while(left <= right) {
            if (alphanumeric.charAt(left) == alphanumeric.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
