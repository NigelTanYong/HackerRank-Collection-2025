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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
//Time complexity: O(nlogn) , Space complexity: O(1);
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long minSum = 0L, maxSum = 0L; //use long cuz of constraints 64-bit integer
        Collections.sort(arr);
        for(int i=0; i<arr.size()-1; i++){
            minSum+=arr.get(i);
        }
        for(int i=arr.size()-1; i>=1; i--){
            maxSum+=arr.get(i);
        }
        System.out.printf("%d %d", minSum, maxSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
