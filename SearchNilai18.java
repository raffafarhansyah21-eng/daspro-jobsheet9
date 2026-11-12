public class SearchNilai18 {
    public static void main(String[] args) {
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 90;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {

            System.out.println("INFORMASI PENCARIAN:");
            System.out.println("Maaf, nilai \"" + key + "\" yang Anda cari tidak ditemukan.");
            System.out.println("Pastikan kembali nilai tersebut terdaftar di dalam sistem.");

        }
    }
}