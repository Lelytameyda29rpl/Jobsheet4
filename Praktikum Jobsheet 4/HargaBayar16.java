import java.util.Scanner;
public class HargaBayar16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harga, jumlah, jml_halaman_buku;
        double dis, total, bayar, jmlDis;
        String merk_buku;

        System.out.println("Masukkan Merk Buku Yang Akan Dibeli ");
        merk_buku = input.nextLine();
        System.out.println("Masukkan Jumlah Halaman Buku Yang Diinginkan ");
        jml_halaman_buku = input.nextInt();
        System.out.println("Masukkan Harga Barang Yang Dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah Barang Yang Dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Jumlah Diskon Yang Akan Didapatkan ");
        dis = input.nextDouble();
        

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;

        System.out.println("Diskon Yang Anda Dapatkan Adalah " + jmlDis);
        System.out.println("Jumlah Yang Harus Dibayar Adalah " + bayar);

    }
    
}