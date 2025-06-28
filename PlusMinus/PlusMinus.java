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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
// Time complexity: O(n), space Complexity: O(1)
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        float arrSize = arr.size();
        int countNegatives = 0, countPositives = 0, countZeros = 0;
        float negativeResult = 0, positiveResult = 0, zeroResult = 0;
        for(int num : arr){
            if(num < 0) countNegatives++;
            else if(num > 0) countPositives++;
            else countZeros++;
        }
        negativeResult = countNegatives / arrSize;
        positiveResult = countPositives / arrSize;
        zeroResult = countZeros / arrSize;
        System.out.printf("%.6f\n", positiveResult);
        System.out.printf("%.6f\n", negativeResult);
        System.out.printf("%.6f\n", zeroResult);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
