import java.io.*;
import java.util.Arrays;

/**
*Program ini dapat menampilkan array sesuai format yang diminta pada soal 
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-19
*/
public class arrayJava {
   public static void main(String[] args)
 {
 //One Dimensional Arrays
 int[] fisrtArray = {2, 5, 3};
 int[] secondArray = {9, 5, 3};
 int[] thirdArray = {2, 4, 9};
 int[] fourthArray = {10, 11, 12};
 int[] fifthArray = {13, 14, 15};
 int[] sixthArray = {16, 17, 18};
 int[] seventhArray = {19, 20, 21};
 int[] eighthArray = {22, 23, 24};
 int[] ninthArray = {25, 26, 27};
 //Two Dimensional Arrays
 int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
thirdArray};
 int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
sixthArray};
 int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
ninthArray};
 //Three Dimensional Array
 int[][][] threeDimensionalArray = {twoDimensionalArray1,
twoDimensionalArray2, twoDimensionalArray3};
 
 //convert array to string
 String strOfInts1 = Arrays.deepToString(twoDimensionalArray1).replaceAll(",", "");
 
 //replace symbol 
 String strOf1 = strOfInts1.replace("[","{");
 String str1 = strOf1.replace("]","}");
 
 String strOfInts2 = Arrays.deepToString(twoDimensionalArray2).replaceAll(",", "");
 
 String strOf2 = strOfInts2.replace("[","{");
 String str2 = strOf2.replace("]","}");
 
 String strOfInts3 = Arrays.deepToString(twoDimensionalArray3).replaceAll(",", "");
 
 String strOf3 = strOfInts3.replace("[","{");
 String str3 = strOf3.replace("]","}");
  
    //print output
   System.out.println(str1);
   System.out.println(str2);
   System.out.println(str3);
 } 
}
