import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */
    //time complexity: O(n), space complexity: O(1)
    public static int superDigit(String n, int k) {
    // Write your code here
        long sum = 0;
        //sum the digits in n
        for(int i = 0; i < n.length(); i++){
            sum += Character.getNumericValue(n.charAt(i));
        }
        //multiply by k
        sum = sum*k;
        
        //sum till 1 digit
        while (sum>=10){
            long temp = 0;
            while(sum>0){ //summation per time into temp
                temp+= sum%10;
                sum/= 10;
            }
            sum = temp;
        }
        return (int)sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
