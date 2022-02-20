
import java.util.Scanner;
import java.util.StringTokenizer;

/**
* <h1> Split the string into several tokens</h1>
* This program implements an application that split the string into tokens 
* and then print the number of tokens, followed by each token on a new line
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-19
*/
public class stringTokenizer {
     public static void main(String[] args) {
        String input;
        // membuat scanner
        Scanner scan = new Scanner(System.in);
         input = scan.nextLine();
         
         int stringLength = input.length();
        //memisahkan string menjadi beberapa token 
       StringTokenizer tokenizer = new StringTokenizer (input,"!@?',._ ");
        // menghitung token
        
        System.out.println(tokenizer.countTokens());  
        
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}  
