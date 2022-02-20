import java.util.Scanner;
/**
* Program ini dapat digunakan untuk menghitung 2 bilangan sesuai operator yang
* diinputkan user
* 
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-19
*/
public class operasiDuaBilangan {
    public static void main(String[] args) {
    int angka1;
    int angka2;
    char operator;    

    Scanner scan = new Scanner(System.in);
    //scan angka dan operator dari keyboard
    angka1 = scan.nextInt();
    operator = scan.next().charAt(0);
    angka2  = scan.nextInt();
        
    int hasil = 0; 
    //switch operator agar hasil sesuai perhitungan
    switch (operator){
        case '+' : hasil = angka1 + angka2;break;
        case '-' : hasil = angka1 - angka2;break;
        case '*' : hasil = angka1 * angka2;break;
        case '/' : hasil = angka1 / angka2;break;
        case '%' : hasil = angka1 % angka2;break; 
    }
    //tampilkan output
    System.out.println(hasil);
    }
}
