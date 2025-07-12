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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    //Time and Space Complexity: O(1)
    public static String timeConversion(String s) {
    // Write your code here
        String amPm = s.substring(s.length()-2);
        String hour = s.substring(0, 2);
        
        if(amPm.equals("AM") && Integer.parseInt(hour) == 12){
            hour = "00";
        }
        else if(amPm.equals("PM") && Integer.parseInt(hour) != 12 ){
            int hourInt = 12 + Integer.parseInt(hour);
            hour = String.valueOf(hourInt);
        }
        return new StringBuilder(hour+ s.substring(2,8)).toString();


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
