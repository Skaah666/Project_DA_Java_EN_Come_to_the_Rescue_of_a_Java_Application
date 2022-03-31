package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/*
* This is the main class of the application AnalyticsCounter
* to start "first get input" , then "next generate output"
 */

public class AnalyticsCounter {
    private static int headCount = 0;
    private static int rashCount = 0;
    private static int pupilCount = 0;

    public static void main(String [] args) throws Exception {
        /* first get input */
        BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/src/com/hemebiotech/analytics/symptoms.txt"));
        String line = reader.readLine();

        while (line != null) {
            System.out.println("symptom from file: " + line);
            if (line.equals("headache")) {
                headCount++;
                System.out.println("number of headaches: " + headCount);
            } else if (line.equals("rash")) {
                rashCount++;
            } else if (line.contains("pupils")) {
                pupilCount++;
            }

            line = reader.readLine();    // get another symptom
        }

        /* next generate output */
        FileWriter writer = new FileWriter("Project02Eclipse/src/com/hemebiotech/analytics/result.out");
        writer.write("headache: " + headCount + "\n");
        writer.write("rash: " + rashCount + "\n");
        writer.write("dialated pupils: " + pupilCount + "\n");
        writer.close();
    }
}
