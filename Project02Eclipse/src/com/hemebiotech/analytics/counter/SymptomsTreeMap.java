package com.hemebiotech.analytics.counter;

// Class to count frequencies of elements
// using HashMap.

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class SymptomsTreeMap implements ISymptomsTreeMap{

    @Override
    public Map<String, Integer> countFrequencies(List<String> list) {

        Map<String, Integer> symptomsTreeMap = new TreeMap<>();

        for (String symptoms : list) {
            Integer count = symptomsTreeMap.get(symptoms);
            symptomsTreeMap.put(symptoms, (count == null) ? 1 : count + 1);
        }
        return symptomsTreeMap;
    }
}
