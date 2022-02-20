
import java.util.Scanner;

/**
* Program ini dapat digunakan untuk menampilkan string dan bilangan sesuai
* output yang ditentukan dalam soal praktikum
* 
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-19
*/
public class outputFormatting {
   public static void main(String[] args){
       // membuat scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for (int i=0;i<3;i++){
        //input string
        String character = scan.next();
        //input bilangan
        int num = scan.nextInt();
        //tampilkan ke layar dengan metode formatted output
        System.out.printf("%-15s %03d\n", character,num);
        }
        System.out.println("================================");
       
   
   }
}