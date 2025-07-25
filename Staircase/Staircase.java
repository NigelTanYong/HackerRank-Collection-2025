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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    //Time complexity: O(n^2), O(1)
    public static void staircase(int n) {
    // Write your code here
        for(int i=0; i<n; i++){
            for(int s = 0; s<n-i-1; s++){
                System.out.print(" ");
            }
            for(int h = n-i-1; h<n; h++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
