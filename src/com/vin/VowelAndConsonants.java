package com.vin;

public class VowelAndConsonants {
    public static void main(String[] args) {
        String text ="aplphabetically";
        System.out.println(findVowelConsonants(text));
    }

    private static String findVowelConsonants(String text) {
        int vowel=0,consonants=0;
        for (int i=0;i<text.length();i++){
            if(text.charAt(i)=='a' || text.charAt(i)=='e' || text.charAt(i)=='i' ||
                    text.charAt(i)=='o' ||text.charAt(i)=='u'){
                vowel++;
            }else if(text.charAt(i) >= 'a' && text.charAt(i) <='z'){
                consonants++;
            }
        }
        return "no of vowels "+vowel+" no of Consonants "+consonants;
    }
}
