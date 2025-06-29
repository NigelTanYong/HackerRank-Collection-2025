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
//TIme and Space Complexity: O(1).  ---all working on fixed no. of strings
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String amPm = s.substring(s.length()-2);
        String[] parts = s.substring(0, 8).split(":");
        int hour = Integer.parseInt(parts[0]);
        
        //when 12 am
        if(amPm.equalsIgnoreCase("AM")){
            if(hour == 12){
                parts[0] = "00";
            }
        }
        //when pm
        else{
            if(hour != 12){
                parts[0] = String.valueOf(hour + 12);
            }
        }
        return String.join(":", parts);
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
