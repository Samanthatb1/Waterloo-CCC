// Question Source https://cemc.uwaterloo.ca/contests/computing/2021/index.html

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    Scanner myObj = new Scanner(System.in);
   
    double totalArea = 0.0 ;

    int numberOfFences = myObj.nextInt(); 
    int fenceSideLengths [] = new int [numberOfFences+1];
    int widthLengths [] = new int [numberOfFences];

    for (int i = 0 ; i < numberOfFences + 1 ; i++){
        fenceSideLengths [i] = myObj.nextInt(); 
    }

    for (int i = 0 ; i < numberOfFences ; i++){
        widthLengths [i] = myObj.nextInt(); 
    }

    for (int i = 0 ; i < numberOfFences ; i++){
        totalArea = totalArea + (widthLengths[i] * ((double) (fenceSideLengths[i] + fenceSideLengths[i + 1]) / 2)) ;
    }

    System.out.println(totalArea);
    myObj.close();
 }
}

