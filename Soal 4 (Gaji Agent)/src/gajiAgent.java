import java.util.Scanner;
/**
* This program can be used to count the total amount of agent's salary
* based on their total sales
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-19
*/
public class gajiAgent {
public static void main(String[] args) {
    int jmlPenjualan;
    int jmlGaji=0;
    int hargaItem=50000;
    int gajiPokok=500000;
    
    //membuat scanner
    Scanner scan = new Scanner(System.in);
    jmlPenjualan = scan.nextInt();
    
    //perhitungan gaji berdasarkan jumlah penjualan
    if (jmlPenjualan>=40){
        jmlGaji= gajiPokok +(hargaItem*jmlPenjualan*25/100);
    }
    if (jmlPenjualan>80){
        jmlGaji= gajiPokok +(hargaItem*jmlPenjualan*35/100);
    }
    if (jmlPenjualan>=15 && jmlPenjualan < 40){
        jmlGaji = gajiPokok + (hargaItem*jmlPenjualan/10);
    }
    if(jmlPenjualan<15){
      jmlGaji = gajiPokok - (hargaItem *(15-jmlPenjualan)*15/100); 
    }
    
    //menampilkan final jumlah gaji
    System.out.println(jmlGaji);
}    
}
