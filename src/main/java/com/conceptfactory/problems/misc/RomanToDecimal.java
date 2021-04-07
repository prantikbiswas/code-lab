package com.conceptfactory.problems.misc;

public class RomanToDecimal {

    public static void main(String[] args) {
        String roman = "CDLVII";

        if (isValid(roman)) {
            System.out.println(convertToDecimal(roman));
        }
    }

    private static boolean isValid(String roman) {
        return true;
    }

    private static int convertToDecimal(String roman) {
        int decimal = 0;
        for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);

            switch (c) {
                case 'M':
                    decimal += 1000;
                    break;
                case 'D':
                    if (i != 0 && roman.charAt(i-1) == 'C') {
                        decimal += 300;
                    } else {
                        decimal += 500;
                    }
                    break;
                case 'C':
                    decimal += 100;
                    break;
                case 'L':
                    if (i != 0 && roman.charAt(i-1) == 'X') {
                        decimal += 30;
                    } else {
                        decimal += 50;
                    }
                    break;
                case 'X':
                    decimal += 10;
                    break;
                case 'V':
                    if (i != 0 && roman.charAt(i-1) == 'I') {
                        decimal += 3;
                    } else {
                        decimal += 5;
                    }
                    break;
                case 'I':
                    decimal += 1;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + c);
            }
        }

        return decimal;
    }
}
