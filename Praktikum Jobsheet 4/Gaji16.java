import java.util.Scanner;
public class Gaji16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        JmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan Besaran Gaji :  ");
        gaji = input.nextInt();
        System.out.println("Masukkan Potongan Gaji : ");
        potGaji = input.nextInt();
       
        TotGaji = (jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Total Gaji Yang Anda Terima Adalah " + TotGaji);
    }
    
}
