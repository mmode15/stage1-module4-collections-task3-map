package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap();

        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {

            if (result.containsKey(e.getValue()) && result.get(e.getValue()) < e.getKey()) {
                result.put(e.getValue(), e.getKey());
            } else {
                result.put(e.getValue(), e.getKey());
            }
        }
        System.out.println(result);
        return result;
    }
}
