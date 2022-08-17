package com.vin;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxOccurenceCharacter {
    public static void main(String[] args) {
        String text = "Tamil Nadu";
        System.out.println(maxOccurnce(text));
    }

    private static char maxOccurnce(String text) {
        return text.replaceAll("\\s+","").trim()
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(a->a.getKey())
                .findAny()
                .orElse(null);
    }
}
