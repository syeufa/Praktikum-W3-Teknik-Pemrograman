import java.util.Scanner;

/**
* <h1> Buka tutup Jalan</h1>
* Program ini mengimplementasikan aturan buka tutup jalan. Jika jumlah angka
* yang ada di plat empat mobil dikurangi 999999 lalu dimoduluskan 5 sisanya 0, 
* maka mobil harus berhenti dan jika sebaliknya maka mobil boleh jalan
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-19
*/
public class bukaTutupJalan {

    public static void main(String[] args) {
     int plat1, plat2, plat3, plat4;
     int gabungan,finalGabungan;
     // membuat scanner
     Scanner scan = new Scanner(System.in);
        plat1 = scan.nextInt();
        plat2 = scan.nextInt();
        plat3 = scan.nextInt();
        plat4 = scan.nextInt();
     
    // menghitung jumlah no plat
     gabungan = plat1 + plat2 + plat3 + plat4;
     finalGabungan = gabungan - 999999;
     
     // buat ngetest salah atau benarnya perhitungan
//       System.out.println(gabungan);
//       System.out.println(finalGabungan);
    
    //selection kondisi sesuai jumlah no plat    
    if (finalGabungan % 5 == 0){
        System.out.println("berhenti");
    }        
    if (finalGabungan % 5 != 0){
        System.out.println("jalan");  
    } 
      
    }
    
}
