// Question Source https://cemc.uwaterloo.ca/contests/computing/2020/index.html

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
    
    int numberOfCords = 0, minX = 0, maxX = 0, minY = 0, maxY = 0 ;
    String pointCords ;

    numberOfCords = Integer.parseInt (objReader.readLine ()); 

    int xCords [] = new int [numberOfCords];
    int yCords [] = new int [numberOfCords];

    for (int i = 0 ; i < numberOfCords ; i++){
        pointCords = objReader.readLine ();
        String xAndY [] = pointCords.split(",");
        xCords [i] = Integer.parseInt(xAndY [0]);
        yCords [i] = Integer.parseInt(xAndY [1]);
    }

    minX = smallestNum(xCords) - 1;
    maxX = largestNum(xCords) + 1;
    minY = smallestNum(yCords) - 1;
    maxY = largestNum(yCords) + 1;

    System.out.println(minX + "," + minY);
    System.out.println(maxX + "," + maxY);

    } 

    public static int largestNum (int [] pointValues)
  	   {    	
            int maxValue = pointValues[0]; 
            for(int i=1 ; i < pointValues.length ; i++){ 
            if(pointValues[i] > maxValue){ 
                maxValue = pointValues[i]; 
                } 
            }
        return maxValue ; 
        }

    public static int smallestNum (int [] pointValues)
        {    	
            int minValue = pointValues[0]; 
            for(int i=1 ; i < pointValues.length ; i++){ 
            if(pointValues[i] < minValue){ 
                minValue = pointValues[i]; 
                } 
            }
        return minValue ; 
        }
}
