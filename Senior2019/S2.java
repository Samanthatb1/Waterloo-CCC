import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
   
    int numberOfInputs = 0, primeNumTwo = 0 ;
    numberOfInputs =  Integer.parseInt(objReader.readLine()); 

    int array [] = new int [numberOfInputs] ;

    for ( int i = 0 ; i < numberOfInputs ; i++){
        array[i] = Integer.parseInt(objReader.readLine()) * 2 ;
    }

    for ( int i = 0 ; i < numberOfInputs ; i++){
        for (int x = array[i] - 2 ; x > 1 ; x--){
            primeNumTwo = array[i] - x ;
            if (isPrime(x) && isPrime(primeNumTwo)){
                System.out.println(x + " " + primeNumTwo);
                break;
            }
        }
    }

 } // end of main method

 public static boolean isPrime (int number)
 {    	
    int divisionResult = 0;
    for ( int i = 2 ; i < Math.sqrt(number) +1 ; i++){
        divisionResult = number % i ;
        if (divisionResult == 0){
            return false ; // its not prime
        }
    }
    return true ; // its prime
}
}
