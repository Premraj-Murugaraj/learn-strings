package com.vin;

import java.util.Arrays;

public class FindAnagram {
    public static void main(String[] args) {
        String s = "race";
        String t ="care";
        System.out.println(isAnagram(s,t));
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] charArray1 = s.toLowerCase().toCharArray();
        char[] charArray2 = t.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return   Arrays.equals(charArray1,charArray2);
    }
}
