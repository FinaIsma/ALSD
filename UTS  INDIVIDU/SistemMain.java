import java.util.Scanner;

public class SistemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen[] dsn = {
            new Dosen("110022", "Fina Isma", "finaisma@gmail.com", 2015, "SIB"),
            new Dosen("110023", "Satoru Gojo", "satorugojo@gmail.com", 2018, "SIB")
        };

        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampil Data Dosen");
            System.out.println("2. Urutkan Data berdasarkan NIDN");
            System.out.println("3. Urutkan Data berdasarkan Masa Kerja");
            System.out.println("4. Cari Dosen berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Clear newline

            switch (pilihan) {
                case 1:
                    SistemDataDosen.tampilData(dsn);
                    break;
                case 2:
                    SistemDataDosen.SortingbyNIDN(dsn);
                    SistemDataDosen.tampilData(dsn);
                    break;
                case 3:
                    SistemDataDosen.SortingbyMasaKerja(dsn);
                    SistemDataDosen.tampilData(dsn);
                    break;
                case 4:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    SistemDataDosen.cariDosenbyNama(dsn, cariNama);
                    break;
                case 0:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}