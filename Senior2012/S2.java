// Question Source https://cemc.uwaterloo.ca/contests/computing/2012/index.html

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));

    String aromaticNumber = objReader.readLine ();
    
    int total = 0, arrayLength=0, charCount = 0 ;
    arrayLength = aromaticNumber.length() / 2 ;
    int arabic [] = new int [arrayLength];
    int roman [] = new int [arrayLength];
    charCount = 0 ;

    for ( int i = 0 ; i < arrayLength; i++){
        arabic[i] = Character.getNumericValue(aromaticNumber.charAt(charCount));
        switch(aromaticNumber.charAt(charCount + 1)) {
            case 'I':
              roman[i] = 1;
              break;
            case 'V':
              roman[i] = 5;
              break;
            case 'X':
              roman[i] = 10;
              break;
            case 'L':
               roman[i] = 50;
              break;
            case 'C':
               roman[i] = 100;
              break;
            case 'D':
               roman[i] = 500;
              break;
            case 'M':
              roman[i] = 1000;
              break;
          }
        charCount= charCount + 2 ;
    }

    for ( int i = 0 ; i < roman.length; i++){
        if (i == roman.length -1){
            total = total + (arabic[i] * roman[i]);
        } else {
            if (roman[i] < roman[i + 1]){
                total = total - (arabic[i] * roman[i]);
            } else {
                total = total + (arabic[i] * roman[i]);
            }
        }
    }

    System.out.println(total);

  }
}
