import java.util.Scanner;

public class DosenMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen11 daftarDosen = new DataDosen11();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L = Laki-laki, P = Perempuan): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    Dosen11 dsn = new Dosen11(kode, nama, jenisKelamin, usia);
                    daftarDosen.tambah(dsn);
                    break;

                case 2:
                    daftarDosen.tampil();
                    break;

                case 3:
                    daftarDosen.SortingASC();
                    daftarDosen.tampil();
                    break;

                case 4:
                    daftarDosen.sortingDSC();
                    daftarDosen.tampil();
                    break;

                case 5:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}