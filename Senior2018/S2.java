// Question Source https://cemc.uwaterloo.ca/contests/computing/2018/index.html

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner myObj = new Scanner(System.in);

    int n = myObj.nextInt();
    int array [][] = new int [n][n] ;

     for ( int i = 0 ; i < n ; i++){
        for ( int x = 0 ; x < n ; x++){
            array[i][x] = myObj.nextInt();
        }
     }
        int max = 0;
        int maxRow=0 ;
        int MaxCol=0 ;
  
        for ( int i = 0 ; i < n ; i = i + n-1){
           for ( int x = 0 ; x < n ; x = x + n -1){
              if (array[i][x] > max){
                  max = array[i][x] ;
                  maxRow = i ;
                  MaxCol = x ;
              }
           }
        }
  
     if (maxRow == n - 1 && MaxCol == n - 1){
        for ( int i = 0 ; i < n ; i++){
           for ( int x  = 0 ; x < n ; x++){
              if (x == n-1){
                 System.out.println(array[i][x]);
              } else {
                 System.out.print(array[i][x] + " ");
              }
           }
        }
     }
     else if (maxRow == 0 && MaxCol == n - 1){
        for( int x = 0 ; x < n ; x++){
           for( int i = n-1 ; i >= 0 ; i--){
              if (i == 0){
                 System.out.println(array[i][x]);
              } else {
                 System.out.print(array[i][x] + " ");
              }
  
           }
         } 
     } else if (maxRow == n - 1 && MaxCol == 0){
        for( int x = n - 1 ; x >= 0 ; x--){
           for( int i = 0 ; i < n ; i++){
              if (i == n-1){
                 System.out.println(array[i][x]);
              } else {
                 System.out.print(array[i][x] + " ");
              }
  
           }
         } 
     } else if (maxRow == 0 && MaxCol == 0){
        for( int i = n-1 ; i >= 0 ; i--){
           for( int x = n - 1 ; x >= 0 ; x--){
              if (x == 0){
                 System.out.println(array[i][x]);
              } else {
                 System.out.print(array[i][x] + " ");
              }
  
           }
         } 
     } 
  
     myObj.close();
 }
}
