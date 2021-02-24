// Question Source https://cemc.uwaterloo.ca/contests/computing/2018/index.html

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
   
    int numberOfVillages = 0 ;
    double currentMin= 0.0 , absoluteMin=1000000001  ;
    numberOfVillages = Integer.parseInt (objReader.readLine ()); 

    int positions [] = new int [numberOfVillages];

    for (int i = 0 ; i < numberOfVillages; i++){
        positions[i]= Integer.parseInt (objReader.readLine ()); 
    }

    Arrays.sort(positions);

    for (int i = 1 ; i < numberOfVillages -1 ; i++){
        currentMin = ((double)(positions[i+1] - positions[i]) / 2) + ((double)(positions[i] - positions[i-1]) / 2) ;
        if (currentMin < absoluteMin){
            absoluteMin = currentMin ;
        }
    }

    String str = String.format("%.1f", absoluteMin);

    System.out.println(str);

 }
}
