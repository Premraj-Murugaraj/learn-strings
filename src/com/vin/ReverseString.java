package com.vin;

/*
WAP to reverse a String.
Input: “iNeuron”
Output: “norueNi”
 */
public class ReverseString {
    public static void main(String[] args) {
        String textToReverse ="iNeuron";
        System.out.println(reverseTheGivenText(textToReverse));
    }

    private static String reverseTheGivenText(String textToReverse) {
        return new StringBuilder(textToReverse).reverse().toString();
    }
}
