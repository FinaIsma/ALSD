import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Panggil 2 mahasiswa");
            System.out.println("3. Tampilkan semua antrian");
            System.out.println("4. Cek antrian depan");
            System.out.println("5. Cek antrian akhir");
            System.out.println("6. Kosongkan antrian");
            System.out.println("7. Cek jumlah antrian");
            System.out.println("8. Cek jumlah yang sudah proses");
            System.out.println("9. Cek jumlah belum proses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("NIM mahasiswa: ");
                    String nim = input.nextLine();
                    Mahasiswa11 m = new Mahasiswa11(nama, nim);
                    antrian.tambahAntrian(m);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDepan();
                    break;
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    System.out.println("Antrian dikosongkan.");
                    break;
                case 7:
                    antrian.cetakJumlahAntrian();
                    break;
                case 8:
                    antrian.cetakJumlahProsesKRS();
                    break;
                case 9:
                    antrian.cetakJumlahBelumProses();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}