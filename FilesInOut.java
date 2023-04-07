//3059937
package Practical2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.

        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.
    	 String inputFilename = "input.txt";
    	 String outputFilename = "formatted.txt";
    	 Scanner scan = null;
         try {
             scan = new Scanner(new File(inputFilename));
         } catch (FileNotFoundException e) {
             System.out.println("Input not found: " + inputFilename);
             System.exit(1);
         }
         PrintWriter writer = null;
         try {
             writer = new PrintWriter(new File(outputFilename));
         } catch (FileNotFoundException e) {
             System.out.println("Output not found: " + outputFilename);
             System.exit(1);
         }
         while (scan.hasNextLine()) {
             String line = scan.nextLine();
             // checking if the code is read properly
             System.out.println(line);
             



       

    } // main

} }// FilesInOut
