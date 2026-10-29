
import java.util.Scanner;

public class Tugas321 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // jumlah toko minimal 1, kalau salah diminta ulang
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        // variabel yang harus bertahan selama semua toko diproses
        int totalSemuaBarang = 0;
        int barangTerbanyak = -1; // -1 supaya toko pertama pasti tercatat (toko boleh 0 barang)
        int tokoTerbanyak = 0;

        // outer loop: toko
        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("Toko " + toko);

            int jumlahPelanggan;
            do {
                System.out.print("  Jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("  Tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0; // di-reset setiap pindah toko

            // inner loop: pelanggan
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int barang;
                do {
                    System.out.print("    Barang yang dibeli pelanggan " + pelanggan + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("    Tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);

                totalBarangToko += barang;
            }

            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);

            totalSemuaBarang += totalBarangToko;

            // pakai > (bukan >=) supaya kalau sama, toko dengan nomor kecil tetap terpilih
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("==============================");
        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
