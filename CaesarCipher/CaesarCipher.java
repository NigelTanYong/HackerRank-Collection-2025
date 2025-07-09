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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
    // Time and space complexity: O(n)
    public static String caesarCipher(String s, int k) {
    // Write your code here
        StringBuilder result = new StringBuilder();
        k = k % 26; //prevent overflow
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                char shifted = (char) ((c - 'a' + k)%26 + 'a'); //lexicographically shift by characters 
                result.append(shifted);
            }
            else if (c >= 'A' && c <= 'Z'){
                char shifted = (char) ((c-'A' + k)%26 + 'A');
                result.append(shifted);
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
