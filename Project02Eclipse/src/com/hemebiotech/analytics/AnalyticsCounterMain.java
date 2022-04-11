package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static com.hemebiotech.analytics.SymptomsTreeMap.countFrequencies;
import static com.hemebiotech.analytics.WriteSymptomInFile.outputFilePath;
import static com.hemebiotech.analytics.WriteSymptomInFile.writeSymptomInFile;


public class AnalyticsCounterMain {

    public static void main(String[] args) throws IOException {

        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/symptoms.txt");
        List<String> symptomsList = reader.getSymptoms();

        Map<String, Integer> symptomsTreeMap = new TreeMap<String, Integer>();
        countFrequencies((ArrayList<String>) symptomsList);

        writeSymptomInFile(outputFilePath);


    }
}

