package com.vin;
/*
WAP to reverse a sentence while preserving the position.
Input : “Think Twice”
Output : “kniht eciwt”
 */
public class ReverseEachWords {
    public static void main(String[] args) {
        String sentence = "Think Twice";
        System.out.println(reverseEveryWord(sentence));
    }

    private static String reverseEveryWord(String sentence) {
        String[] text = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String eachText : text){
            sb.append(new StringBuilder(eachText).reverse().append(" "));
        }

        return sb.toString();
    }
}
