
import java.util.Scanner;

public class Tugas221 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n minimal 3.");
        } else {
            long jumlah = 0; // penampung jumlah semua angka di tabel

            // outer loop: baris
            for (int i = 1; i <= n; i++) {
                // inner loop: kolom
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.printf("%4d", hasil); // lebar 4 karakter, rata kanan
                    jumlah += hasil;
                }
                System.out.println(); // pindah baris
            }

            System.out.println("Jumlah seluruh angka: " + jumlah);
        }
        sc.close();
    }
}
