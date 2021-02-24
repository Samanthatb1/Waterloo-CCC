// Question Source https://cemc.uwaterloo.ca/contests/computing/2020/index.html

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
    
    String longText = " ", cyclic = " ";
    int yesOrNo = 0 ;

    longText = objReader.readLine (); 
    cyclic = objReader.readLine (); 

    for ( int i = 0 ; i < cyclic.length() ; i++){  
        if (longText.contains(cyclic)){
            yesOrNo = 1;
            break;
        }
        cyclic = (cyclic + cyclic.charAt(0)).substring(1) ; 
    }
    
    if (yesOrNo == 1){
    System.out.println("yes");
    } else {
    System.out.println("no");
    }
  }
}
