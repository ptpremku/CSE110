package com.tymon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter ;
import java.io.IOException;
import java.util.Scanner;

public class IA10 {

    public static void main(String[] args) throws IOException {
        makeCopy("original.dat", "copy.dat");

        // print out the contents of the copy to
        // verify that the original was copied correctly
        printFile("copy.dat");
    }

    public static void makeCopy(String inputFileName, String outputFileName) throws IOException {
        // open a File with the given inputFileName
        // and instantiate a Scanner object to read the File
        Scanner myFileReader = new Scanner(new FileInputStream(inputFileName));
        String x = "";
        int count  = 0;
        // open a File with the given outputFileName
        // and instantiate a PrintWriter object to write to the File
        PrintWriter myFileWriter = new PrintWriter(new FileOutputStream(outputFileName));

        // 1) loop while the Scanner has a next line
        while(myFileReader.hasNextLine()){
         x = myFileReader.nextLine();
         myFileWriter.println(x);
         count++;
        }

        myFileWriter.flush();

        // 2) read the next line from the Scanner and store it in a String variable

        // 3) write the line to the output file

        // loop ends


        // 4) flush the PrintWriter

        // 5) close the PrintWriter


        myFileReader.close();
    }

    // make no changes to this printFile method
    public static void printFile(String fileName) throws IOException {
        Scanner myFileReader = new Scanner(new FileInputStream(fileName));
        while (myFileReader.hasNextLine()) {
            System.out.println(myFileReader.nextLine());
        }

        myFileReader.close();
    }
    }





