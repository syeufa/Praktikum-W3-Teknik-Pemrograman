import java.util.Scanner;
import java.math.*;

/**
* <h1> Add and Multiply using Big Number</h1>
* This program implements an application that can add and multiply two 
* entered number 
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-19
*/
public class addMultiplyNum {

    public static void main(String[] args) {
      //add scanner
      Scanner scan = new Scanner (System.in);
      String num1;
      String num2;
      
      //input 2 bilangan
      num1 = scan.nextLine();
      num2 = scan.nextLine();
      
      //menampilkan hasil + dan * dua bilangan
      System.out.println(new BigInteger(num1).add(new BigInteger(num2)));
      System.out.println(new BigInteger(num1).multiply(new BigInteger(num2)));
      
    }
    
}
