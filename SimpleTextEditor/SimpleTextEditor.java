import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        StringBuilder current = new StringBuilder();
        Stack<String> history = new Stack<>();
        
        for(int i=0; i<q; i++){
            String[] parts = sc.nextLine().split(" ");
            String cmd = parts[0]; // first element is the operation
            
            switch(cmd){
                case "1":
                    history.push(current.toString());
                    current.append(parts[1]);
                    break;
                 case "2":
                    history.push(current.toString());
                    int k = Integer.parseInt(parts[1]);
                    current.setLength(current.length() - k); //set to the first current.length*() -k
                    break;
                 case "3":
                    int input = Integer.parseInt(parts[1])-1;
                    System.out.println(current.charAt(input));
                    break;
                 case "4":
                    if(!history.isEmpty()){
                        current = new StringBuilder(history.pop());
                    }
                    break;
                
            }
        }
        sc.close();
    }
}
