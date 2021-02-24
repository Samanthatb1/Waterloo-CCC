// Question Source https://cemc.uwaterloo.ca/contests/computing/2020/index.html

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
    
    int small, medium, large;

    small = Integer.parseInt (objReader.readLine ()); 
    medium = Integer.parseInt (objReader.readLine ()); 
    large = Integer.parseInt (objReader.readLine ()); 

    if (((small * 1) + (medium * 2) + (large * 3)) >= 10){
        System.out.println("happy");
    } else {
        System.out.println("sad");
    }
    }
}
