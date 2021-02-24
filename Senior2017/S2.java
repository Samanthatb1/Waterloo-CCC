// Question Source https://cemc.uwaterloo.ca/contests/computing/2017/index.html

import java.io.*;
import java.util.* ;
public class Main {
    public static void main(String[] args) throws IOException {
    Scanner myObj = new Scanner(System.in);
   
    int numberOfRecords = myObj.nextInt(); 
    int records [] = new int [numberOfRecords];   

    for (int i = 0 ; i < numberOfRecords ; i++){
        records[i] = myObj.nextInt(); 
    }

    if (numberOfRecords == 1){
        System.out.println(records[0]);
    }

    Arrays.sort(records);

    int num = numberOfRecords / 2 ;
    int counter = 0 ;


    if (numberOfRecords % 2 != 0){
        int low [] = new int [num + 1];
        int high [] = new int [num];  

        for (int i = num ; i >= 0 ; i--){
            low[counter] = records[i];
            counter++ ;
        }
        counter = 0 ;
        for (int i = num + 1 ; i < numberOfRecords ; i++){
            high[counter] = records[i];
            counter++ ;
        }
        for (int i = 0 ; i < num ; i ++){
            System.out.print(low[i] + " " + high[i] + " ");
            if (i == num - 1){
                System.out.println(+ low[i + 1]);
            }
        }
        
    } else {
        int low [] = new int [num];
        int high [] = new int [num];
        
        for (int i = num - 1 ; i >= 0 ; i--){
            low[counter] = records[i];
            counter++ ;
        }
        counter = 0 ;
        for (int i = num ; i < numberOfRecords ; i++){
            high[counter] = records[i];
            counter++ ;
        }

        for (int i = 0 ; i < num ; i ++){
            System.out.print(low[i] + " " + high[i] + " ");
        }
    }

myObj.close();
 } // end of main method
}
