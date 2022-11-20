package com.personetics.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    public static Map<String, Integer> countArrayItemsAppearanceFrequency(final List<String> arr, final int length) {
        final Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++)
            if (map.containsKey(arr.get(i)))
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            else
                map.put(arr.get(i), 1);
        return map;
    }
}
