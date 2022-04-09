package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static com.hemebiotech.analytics.SymptomsTreeMap.countFrequencies;


public class AnalyticsCounterMain {

    public static void main(String[] args)  {

        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/symptoms.txt");
        List<String> symptomsList = reader.getSymptoms();

        Map<String, Integer> symptomsTreeMap = new TreeMap<String, Integer>();
        countFrequencies((ArrayList<String>) symptomsList);


    }
}

