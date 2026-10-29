
import java.util.Scanner;

public class Tugas121 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n minimal 1.");
        } else {
            int total = 0; // penampung jumlah angka yang sudah dicetak

            // outer loop: baris
            for (int i = 1; i <= n; i++) {
                // inner loop: angka 1 sampai nomor baris
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    if (j < i) {
                        System.out.print(" "); // spasi hanya di antara angka
                    }
                    total++;
                }
                System.out.println(); // pindah baris
            }

            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}
