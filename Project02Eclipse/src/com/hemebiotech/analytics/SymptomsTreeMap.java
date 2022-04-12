package com.hemebiotech.analytics;

// Class to count frequencies of elements
// using HashMap.

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class SymptomsTreeMap {

    static Map<String, Integer> symptomsTreeMap = new TreeMap<>();

    public static void countFrequencies(ArrayList<String> list)
    {

        for (String symptoms : list) {
            Integer count = symptomsTreeMap.get(symptoms);
            symptomsTreeMap.put(symptoms, (count == null) ? 1 : count + 1);
        }

        for (Map.Entry m : symptomsTreeMap.entrySet())

            System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
    }


}
