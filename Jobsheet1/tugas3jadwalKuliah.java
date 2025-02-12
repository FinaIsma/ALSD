import java.util.Scanner;

public class tugas3jadwalKuliah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] mataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hari = new String[n];

        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            mataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hari[i] = sc.nextLine();
        }

        // Menu untuk menampilkan atau mencari jadwal
        while (true) {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Semua Jadwal");
            System.out.println("2. Jadwal Berdasarkan Hari");
            System.out.println("3. Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 5) {
                System.out.println("Terima kasih!");
                break;
            }

            switch (pilihan) {
                case 1:
                    SemuaJadwal(mataKuliah, sks, semester, hari);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah: ");
                    String cariHari = sc.nextLine();
                    JadwalHari(mataKuliah, sks, semester, hari, cariHari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int cariSemester = sc.nextInt();
                    JadwalSemester(mataKuliah, sks, semester, hari, cariSemester);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String cariMatkul = sc.nextLine();
                    cariMatkul(mataKuliah, sks, semester, hari, cariMatkul);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        sc.close();
    }

    // Fungsi menampilkan semua jadwal
    public static void SemuaJadwal(String[] mataKuliah, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println(mataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    // Fungsi menampilkan jadwal berdasarkan hari
    public static void JadwalHari(String[] mataKuliah, int[] sks, int[] semester, String[] hari, String cariHari) {
        System.out.println("\nJadwal Kuliah Hari " + cariHari + ":");
        for (int i = 0; i < mataKuliah.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println(mataKuliah[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
            }
        }
    }

    // Fungsi menampilkan jadwal berdasarkan semester
    public static void JadwalSemester(String[] mataKuliah, int[] sks, int[] semester, String[] hari, int cariSemester) {
        System.out.println("\nJadwal Kuliah Semester " + cariSemester + ":");
        for (int i = 0; i < mataKuliah.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println(mataKuliah[i] + " | SKS: " + sks[i] + " | Hari: " + hari[i]);
            }
        }
    }

    // Fungsi mencari mata kuliah
    public static void cariMatkul(String[] matKul, int[] sks, int[] semester, String[] hari, String cariMatkul) {
        for (int i = 0; i < matKul.length; i++) {
            if (matKul[i].equalsIgnoreCase(cariMatkul)) {
                System.out.println("\nMata Kuliah: " + matKul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                return;
            }
        }
        System.out.println("Mata kuliah tidak ditemukan.");
    }
}