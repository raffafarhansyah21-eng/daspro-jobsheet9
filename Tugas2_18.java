import java.util.Scanner;

public class Tugas2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== PENCARIAN MENU KAFE ===");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cariMenu = scanner.nextLine();
        boolean ditemukan = false;
        int indeksMenu = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                indeksMenu = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Menu \"" + menu[indeksMenu] + "\" tersedia dengan harga Rp " + harga[indeksMenu]);
        } else {
            System.out.println("Maaf, menu \"" + cariMenu + "\" tidak tersedia di kafe.");
        }

        System.out.println("\n=== APLIKASI PEMESANAN KAFE KAMPUS ===");
        System.out.print("Masukkan jumlah jenis item yang ingin dipesan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] jumlahItem = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean validMenu = false;
            String pilihan = "";

            while (!validMenu) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                pilihan = scanner.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pilihan)) {
                        validMenu = true;
                        namaPesanan[i] = menu[j];
                        break;
                    }
                }

                if (!validMenu) {
                    System.out.println("Menu tidak valid! Silakan masukkan sesuai daftar menu.");
                }
            }

            System.out.print("Masukkan jumlah porsi untuk " + namaPesanan[i] + ": ");
            jumlahItem[i] = scanner.nextInt();
            scanner.nextLine();

            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaPesanan[i])) {
                    hargaSatuan = harga[j];
                    break;
                }
            }
            totalBiaya += hargaSatuan * jumlahItem[i];
        }

        System.out.println("\n========================================");
        System.out.println("          STRUK PESANAN KAFE           ");
        for (int i = 0; i < jumlahPesanan; i++) {
            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaPesanan[i])) {
                    hargaSatuan = harga[j];
                    break;
                }
            }
            int subtotal = hargaSatuan * jumlahItem[i];
            System.out.println("- " + namaPesanan[i] + " (" + jumlahItem[i] + "x) : Rp " + subtotal);
        }
        System.out.println("TOTAL KESELURUHAN BIAYA: Rp " + totalBiaya);
        System.out.println("========================================");

        scanner.close();
    }
}