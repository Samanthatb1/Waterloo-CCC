// Question Source https://cemc.uwaterloo.ca/contests/computing/2021/index.html
import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
   
    int decisionSlot = 0, counter = 0, rowNumber = 0, colNumber = 0, k = 0  ;
    String rowColInput = " ";
    char decisionRowCol = ' ';

    rowNumber = Integer.parseInt (objReader.readLine ()); 
    colNumber = Integer.parseInt (objReader.readLine ()); 
    k = Integer.parseInt (objReader.readLine ()); 

    String canvas [][] = new String [rowNumber][colNumber];
    
    for (int i = 0 ; i < k ; i++){
        rowColInput = objReader.readLine ();
        decisionRowCol = rowColInput.charAt(0); 
        decisionSlot = Integer.parseInt(rowColInput.substring(2)) - 1; 

        if (decisionRowCol == 'R'){
            for (int x = 0 ; x < colNumber ; x++){
                if (canvas[decisionSlot][x] == null || canvas[decisionSlot][x] == "black"){
                    canvas[decisionSlot][x] = "gold" ;
                    counter++ ;
                } else {
                    canvas[decisionSlot][x] = "black" ;
                    counter-- ;
                }
            }
        } else { 
            for (int x = 0 ; x < rowNumber ; x++){
                if (canvas[x][decisionSlot] == null || canvas[x][decisionSlot] == "black"){
                    canvas[x][decisionSlot] = "gold" ;
                    counter++ ;
                } else {
                    canvas[x][decisionSlot] = "black" ;
                    counter-- ;
                }
            }
        }
    } 


    System.out.println(counter);

 }
}
