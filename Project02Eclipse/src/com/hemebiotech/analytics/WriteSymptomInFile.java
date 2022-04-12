package com.hemebiotech.analytics;

// Class to write TreeMap to a file

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


class WriteSymptomInFile {


    // il faudrait que cette methode ne soit plus statique , il faut une interface qui definisse cette methode pour fonctionner comme le symptoms reader

    public static void writeSymptomInFile(String outputFilePath, Map<String, Integer> symptomsFrequencies) {

        // new file object
        File filepath = new File(outputFilePath);

        BufferedWriter writer = null;

        try {

            // create new BufferedWriter for the output file
            writer = new BufferedWriter(new FileWriter(filepath));

            // iterate map entries
            for (Map.Entry<String, Integer> entry : symptomsFrequencies.entrySet()) {

                // put key and value separated by a colon
                writer.write(entry.getKey() + ": " + entry.getValue());

                // new line
                writer.newLine();
            }

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // always close the writer
            writer.close();

        }
    }
}
