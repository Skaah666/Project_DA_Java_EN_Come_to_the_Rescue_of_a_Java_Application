/*

* package com.hemebiotech.analytics;

 * This is the OLD main class of the application AnalyticsCounter
 */

/* public class AnalyticsCounter {
    private static int headCount = 0;
    private static int rashCount = 0;
    private static int pupilCount = 0;

    /* public static void main(String[] args) throws Exception {

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

        FileWriter writer = new FileWriter("Project02Eclipse/src/com/hemebiotech/analytics/result.out");
        writer.write("headache: " + headCount + "\n");
        writer.write("rash: " + rashCount + "\n");
        writer.write("dilated pupils: " + pupilCount + "\n");
        writer.close();
    } */
