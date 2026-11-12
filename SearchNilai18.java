import java.util.Scanner;

public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int jumlahElemen = sc.nextInt();

        int[] nilai = new int[jumlahElemen];

        System.out.println("--- Masukkan Isi Array ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai elemen ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("\nMasukkan nilai yang ingin dicari (key): ");
        int key = sc.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break; 
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan di dalam array.");
        }

        sc.close();
    }
}