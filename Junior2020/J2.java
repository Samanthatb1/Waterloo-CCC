// Question Source https://cemc.uwaterloo.ca/contests/computing/2020/index.html

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
    
   int p = 0, infected = 0, r = 0, day = 0, totalNumber = 0 ;

    p = Integer.parseInt (objReader.readLine ()); 
    infected = Integer.parseInt (objReader.readLine ()); 
    r = Integer.parseInt (objReader.readLine ());

    totalNumber = infected ;

    while (totalNumber <= p){
        infected = infected * r ;
        totalNumber = totalNumber + infected ;
        day++;
    }

    System.out.println(day);

    }
}
