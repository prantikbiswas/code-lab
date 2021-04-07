package com.conceptfactory.problems.recursion;

public class PermutationsOfString {

    public static void main(String[] args) {
        PermutationsOfString test = new PermutationsOfString();

        test.printPermutations("", "abcd");
    }

    public void printPermutations(String prefix, String s) {
        if (s.length() == 0) {
            return;
        }

        if (s.length() == 1) {
            System.out.println(prefix + s);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
           printPermutations(prefix + s.charAt(i), removeCharAt(s, i));
        }
    }

    private String removeCharAt(String s, int index) {
        return s.substring(0, index) + s.substring(index + 1);
    }

}
