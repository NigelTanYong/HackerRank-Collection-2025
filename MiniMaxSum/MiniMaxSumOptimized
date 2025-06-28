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
//Time complexity: O(n) , Space complexity: O(1);
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        //use long cuz of constraints 64-bit integer
        long totalSum = 0L;
        long minNum = Long.MAX_VALUE, maxNum = Long.MIN_VALUE; 
        long minSum = 0L, maxSum = 0L; 

        for(int num:arr){
            totalSum += num;
            if(num<minNum) minNum = num;
            if(num>maxNum) maxNum = num;
        }
        minSum = totalSum - maxNum;
        maxSum = totalSum - minNum;
        
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
