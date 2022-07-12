package com.tymon;

// This program will read the contents of an input file (line by line);
// each line of the input file will have one integer value between 1 and 100.
// From the data in the input file, you must compute the
// sum, average, minimum, and maximum values.
// These values must then be written to an output file.

// You must fill in the missing piece described in the code below.
// 1) you must write the reportStatistics method.

// make no other changes to the code,
// and make no changes to any of the provided .dat files.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter ;
import java.io.IOException;
import java.util.Scanner;

class MainOld {
    static Scanner scnr = new Scanner(System.in);
    // make no changes to this method
    public static void main(String[] args) throws IOException {
        String inputFileName = getFileName("Enter input file name  : ");
        String outputFileName = getFileName("Enter output file name : ");

        reportStatistics(inputFileName, outputFileName);

        // print out the contents of the output file to
        // verify that the output file is correct
        System.out.println("\n" + outputFileName + " contents :");
        printFile(outputFileName);
    }

    // make no changes to this method
    public static String getFileName(String prompt) {
        System.out.print(prompt);
        return scnr.nextLine();
    }

    /* 1) Write a public static method named reportStatistics.
          Be sure to add the 'throws IOException' clause to the method header
          This method should take two String arguments (an input file name and an output file name).
          This method should have a return type of void.
          This method should read in all of the integers from the input file.
          This method should compute the sum (int), average (float), min (int) and max (int) values.
          from the data in the input file.
          This method should output these statistics to the output file.
          The output should look like this (average should have two digits to the right of the decimal point):
             Sum is     : 45
             Average is : 5.00
             Min is     : 1
             Max is     : 9
    */
    public static void reportStatistics(String input, String output) throws IOException {
        double avg = 0.0;
        int max = 0;
        int min = 101;
        int sum = 0;
        int count = 0;
        int a = 0;

        FileInputStream x = new FileInputStream (input);
        Scanner scnr = new Scanner (x);
        FileOutputStream output_file = new FileOutputStream (output);
        PrintWriter y = new PrintWriter(output_file);

        while(scnr.hasNextInt()){
            a = scnr.nextInt();
            sum = a + sum;
            count++;

            if(max < a){
                max = a;
            }

            if(min > a){
                min = a;
            }

            avg = sum/count;



        }
        y.println("Sum is     : " + sum);
        y.printf("Average is : %.2f\n", avg);
        y.println("Min is     : " + min);
        y.println("Max is     : " + max);
        y.close();
    }


    // make no changes to this method
    public static void printFile(String fileName) throws IOException {
        Scanner myFileReader = new Scanner(new FileInputStream(fileName));
        while (myFileReader.hasNextLine()) {
            System.out.println(myFileReader.nextLine());
        }

        myFileReader.close();
    }
}

