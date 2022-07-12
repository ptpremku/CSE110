package com.tymon;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class L9 {

    public static double getAverage (ArrayList<Double> x){
        double value = 0;
        double avg;
        for (int i = 0; i < x.size(); i++){
            value = value + x.get(i);
        }
        avg = value/x.size();
        return avg;
    }

    public static double getMin (ArrayList<Double> x){
        double value = x.get(0);
        for(int i = 0; i < x.size(); i++){
            if(x.get(i) < value){
                value = x.get(i);
            }
        }
        return value;
    }

    public static double getMax (ArrayList<Double> x){
        double value = x.get(0);
        for(int i = 0; i < x.size(); i++){
            if(x.get(i) > value){
                value = x.get(i);
            }
        }
        return value;
    }

    public static void center (ArrayList<Double> x){
        double value = 0;
        double avg;
        for (int i = 0; i < x.size(); i++){
            value = value + x.get(i);
        }
        avg = value/x.size();

        for (int i = 0; i < x.size(); i++){
            x.set(i, x.get(i) - avg);
        }
    }

    public static void scale (ArrayList<Double> x, double new_range){
        double range;
        double scale_Factor;
        double z;

        range = getMax(x) - getMin(x);
        scale_Factor = new_range/range;

        for(int i = 0; i < x.size(); i++){
            z = x.get(i) * scale_Factor;
            x.set(i, z);
        }

    }

    public static void normalize (ArrayList<Double> x){
        center(x);
        scale(x, 100.00);
    }

    public static ArrayList<Double> loadData(String file_name)throws IOException {
        int line_count = 0;
        double current_line = 0;
        ArrayList<Double> x = new ArrayList<>();

        FileInputStream myFile = new FileInputStream(file_name);
        Scanner myFileReader = new Scanner(myFile);

        while(myFileReader.hasNextDouble()){
            current_line = myFileReader.nextDouble();
            x.add(current_line);
        }
        myFile.close();
        myFileReader.close();
        return x;
    }

    public static void saveData(ArrayList<Double> x)throws IOException{
            FileOutputStream fileStream = new FileOutputStream("normal.dat");
            PrintWriter outFS= new PrintWriter(fileStream);

            for (double i : x){
                outFS.printf("%.2f \n", i);
            }

            outFS.flush();
            outFS.close();
            fileStream.close();
        }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Double> myData = null;

        // Collect data file name from user
        System.out.print("Enter data file name : ");
        String dataFileName = scnr.nextLine();

        // get the data from the file
        myData = loadData(dataFileName);
        // normalize the data
        normalize(myData);
        // outut the normalized data to the required file
        saveData(myData);


    }

    }




