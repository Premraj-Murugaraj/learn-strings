package com.vin;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortAplhabetically {
    public static void main(String[] args) {
        String text = "bdca";
        System.out.println(sortAlphabets(text));
    }

    private static String sortAlphabets(String text) {
        return  text.chars()
                .sorted()
                .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
    }
}
