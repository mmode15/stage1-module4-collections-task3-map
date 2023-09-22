package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public static Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap();
        String[] stringValue = sentence.toLowerCase().split(" ");

        if (stringValue.length != 1) {
            for (String j : stringValue) {
                if (j.endsWith(",") || j.endsWith(".")) {
                    j = j.substring(0, j.length() - 1);
                }
                if (result.containsKey(j)) {
                    Integer value = result.get(j) + 1;
                    result.put(j, value);
                } else {
                    result.put(j, 1);
                }
            }
        }
        return result;
    }
}
