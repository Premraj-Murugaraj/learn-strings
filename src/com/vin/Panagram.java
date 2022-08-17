package com.vin;

import java.util.Map;
import java.util.stream.Collectors;

public class Panagram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(input));
    }

    private static boolean isPangram(String input) {
        Map<Character,Boolean> map = input.toUpperCase()
                .chars()
                .mapToObj(c->(char)c)
                .filter(a-> a >= 'A' && a<='Z')
                .collect(Collectors.toMap(a->a,k->Boolean.TRUE,(first,conflict)->first));

        return map.size() == 26;

    }
}
