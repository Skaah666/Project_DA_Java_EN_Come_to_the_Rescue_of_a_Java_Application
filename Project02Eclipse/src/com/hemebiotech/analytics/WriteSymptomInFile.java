package com.hemebiotech.analytics;

// Java program to write TreeMap to a file

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


class WriteSymptomInFile {

    public static String outputFilePath
            = "result.out";


    public static void writeSymptomInFile (String args) {

        // new file object
        File filepath = new File(outputFilePath);

        BufferedWriter writer = null;

        try {

            // create new BufferedWriter for the output file
            writer = new BufferedWriter(new FileWriter(filepath));

            // iterate map entries
            for (Map.Entry<String, Integer> entry :
                    SymptomsTreeMap.symptomsTreeMap.entrySet()) {

                // put key and value separated by a colon
                writer.write(entry.getKey() + ": "
                        + entry.getValue());

                // new line
                writer.newLine();
            }

            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {

                // always close the writer
                writer.close();
            }
            catch (Exception e) {
            }
        }
    }
}
