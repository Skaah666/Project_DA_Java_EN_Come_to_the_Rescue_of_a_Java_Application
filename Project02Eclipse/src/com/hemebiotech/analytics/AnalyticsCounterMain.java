package com.hemebiotech.analytics;

import com.hemebiotech.analytics.reader.ISymptomReader;
import com.hemebiotech.analytics.reader.ReadSymptomDataFromFile;

import java.util.List;
import java.util.Map;

import static com.hemebiotech.analytics.counter.SymptomsTreeMap.countFrequencies;
import static com.hemebiotech.analytics.writer.WriteSymptomInFile.writeSymptomInFile;

// creation de sous package , ss package gestion symptom et gestion des fichiers ( creation de sous dossier et y mettre les classes correspondantes)

public class AnalyticsCounterMain {

    public static void main(String[] args) {

        ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/src/com/hemebiotech/analytics/symptoms.txt");
        List<String> symptomsList = reader.getSymptoms();

        Map<String, Integer> symptomsFrequencies = countFrequencies(symptomsList);

        writeSymptomInFile("Project02Eclipse/src/com/hemebiotech/analytics/result.out", symptomsFrequencies);
    }
}

