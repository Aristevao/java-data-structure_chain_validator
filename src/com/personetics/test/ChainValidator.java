package com.personetics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.personetics.test.FrequencyCounter.countArrayItemsAppearanceFrequency;

public class ChainValidator {

    public boolean validate(final List<Node> nodes) {
        final List<String> extractedValues = extractValuesFromNodeAsString(nodes);
        final Map<String, Integer> map = countArrayItemsAppearanceFrequency(extractedValues, extractedValues.size());
        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (entry.getValue() < 2)
                return false;
        return true;
    }

    private List<String> extractValuesFromNodeAsString(final List<Node> nodes) {
        final List<String> extractedValues = new ArrayList<>();
        nodes.forEach(node -> {
            String[] split = node.getObj().toString().split("(?!^)");
            extractedValues.addAll(List.of(split));
        });
        return extractedValues;
    }
}
