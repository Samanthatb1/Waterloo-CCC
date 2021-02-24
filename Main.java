import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader objReader = new BufferedReader(new InputStreamReader (System.in));
    
    int scorerNum = 0, tally = 0, minus = 0, groups = 0;

    scorerNum = Integer.parseInt (objReader.readLine ());
    groups = scorerNum - 3 ;

    for ( int i = 1 ; i <= groups ; i++){
        for ( int z = groups - minus ; z >= 1 ; z--){
            tally = tally + z ;
        }
        minus++ ;
    }

    System.out.println(tally);

  }
}