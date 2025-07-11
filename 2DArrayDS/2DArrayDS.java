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
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<=3; i++){ //3 cuz 6x6 matrix can have 4 rows top to down
            for(int j=0; j<=3; j++){
                int sum = 0; //for each hour glass
                // toprow
                sum+= arr.get(i).get(j);
                sum+= arr.get(i).get(j+1);
                sum+= arr.get(i).get(j+2);
                //middle
                sum+= arr.get(i+1).get(j+1);
                //bottomrow
                sum+= arr.get(i+2).get(j);
                sum+= arr.get(i+2).get(j+1);
                sum+= arr.get(i+2).get(j+2);
                
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
