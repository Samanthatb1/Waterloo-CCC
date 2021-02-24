// Question Source https://cemc.uwaterloo.ca/contests/computing/2020/index.html

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner myObj = new Scanner(System.in);

        int observationNumber = 0;
        double currentSpeed = 0, maxSpeed = 0 ;
        observationNumber = myObj.nextInt();
    
        int input [][] = new int [observationNumber][2];
    
        for ( int i = 0 ; i < observationNumber ; i++){
            input[i][0] = myObj.nextInt();
            input[i][1] = myObj.nextInt();
        } 
    
        Arrays.sort(input, (a, b) -> Integer.compare(a[0], b[0]));
        
        for ( int i = 0 ; i < observationNumber - 1 ; i++){
            currentSpeed = (double)(input[i][1] - input[i+1][1]) / (input[i+1][0] - input[i][0]);
            if (currentSpeed < 0){
                currentSpeed = currentSpeed - currentSpeed - currentSpeed ;
            }
            if (currentSpeed > maxSpeed){
                maxSpeed = currentSpeed ;
            }
         }
         System.out.println(maxSpeed);

         myObj.close();
    }
}
