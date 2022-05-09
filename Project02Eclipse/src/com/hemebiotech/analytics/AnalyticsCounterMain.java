package com.hemebiotech.analytics;


import com.hemebiotech.analytics.counter.ISymptomsTreeMap;
import com.hemebiotech.analytics.counter.SymptomsTreeMap;
import com.hemebiotech.analytics.reader.ISymptomReader;
import com.hemebiotech.analytics.reader.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.writer.IWriteSymptomInFile;
import com.hemebiotech.analytics.writer.WriteSymptomInFile;

import java.util.List;
import java.util.Map;


public class AnalyticsCounterMain {


    public static void main(String[] args) {

        ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/symptoms.txt");
        List<String> symptomsList = reader.getSymptoms();

        ISymptomsTreeMap counter = new SymptomsTreeMap();
        Map<String, Integer> symptomsFrequencies = counter.countFrequencies(symptomsList);

        IWriteSymptomInFile writer = new WriteSymptomInFile("Project02Eclipse/src/com/hemebiotech/analytics/result.out", symptomsFrequencies);
        writer.writeInFile();



    }
}

