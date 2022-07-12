package com.tymon;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.ArrayList;


   public class StudyGuide {

    public static void main(String [] args)  {

        L1:for(int i  = 5, j = 5; i > 0; i--){
        L2:for(j=0; j < 5; j++){
            System.out.print(i + "" + j + " ");
            if (j==0)
            continue L2;
        }
        }

        }
    }












