// Question Source https://cemc.uwaterloo.ca/contests/computing/2019/index.html

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
   
    int a=1, b=2, c=3, d=4, placeholder = 0 ;
    String letterSequence = objReader.readLine (); 


     for ( int i = 0 ; i < letterSequence.length() ; i++){
        if (letterSequence.charAt(i) == 'H'){
            placeholder = b ;
            b = d ;
            d = placeholder ;
            placeholder = a ;
            a = c;
            c = placeholder ;
        } else {
            placeholder = b ;
            b = a ;
            a = placeholder ;
            placeholder = d ;
            d = c;
            c = placeholder ;
        }
     }
      
     System.out.println(a + " " + b);
     System.out.println(c + " " + d);
 }
}
