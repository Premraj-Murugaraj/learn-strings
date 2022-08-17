package com.vin;

public class CountSpecialCharacters {
    public static void main(String[] args) {
        String text = "@Alpha%beticall&y";
        System.out.println(countSpecialsChars(text));
    }

    private static int countSpecialsChars(String text) {
        int count = 0;
        for (int i=0; i<text.length(); i++){
           if(!Character.isLetterOrDigit(text.charAt(i))) {
               count++;
           }
        }
        return count;
    }


}
