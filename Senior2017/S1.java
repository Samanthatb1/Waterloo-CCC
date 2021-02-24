// Question Source https://cemc.uwaterloo.ca/contests/computing/2017/index.html

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    Scanner myObj = new Scanner(System.in);

    int numberOfDays = 0, currentSwift = 0, currentSema = 0, days = 0, finalDay = 0 ;

    numberOfDays = myObj.nextInt();

    int swift [] = new int [numberOfDays] ;
    int sema [] = new int [numberOfDays] ;

    for ( int i = 0 ; i < numberOfDays ;i++){
        swift[i] = myObj.nextInt();
    }
    for ( int i = 0 ; i < numberOfDays ;i++){
        sema[i] = myObj.nextInt();
    }


    for (int i = 0 ; i < numberOfDays ;i++){
        currentSwift = currentSwift + swift[i] ;
        currentSema = currentSema + sema[i];
        days++ ;
        if (currentSema == currentSwift){
            finalDay = days ;
        }
    }

    if (finalDay == 0){
        System.out.println(0);
    } else{
        System.out.println(finalDay);
    }

    
    myObj.close();
 } // end of main method
}
