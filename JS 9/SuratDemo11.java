import java.util.Scanner;
public class SuratDemo11 {
    public static void main(String[] args) {
        StackSurat11 stack = new StackSurat11();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin (berdasarkan nama mahasiswa)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.nextLine().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = input.nextInt();
                    input.nextLine(); // buang newline

                    Surat11 suratBaru = new Surat11(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat berhasil ditambahkan.");
                    break;

                case 2:
                    Surat11 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat yang diproses:");
                        diproses.tampilkan();
                    }
                    break;

                case 3:
                    Surat11 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir:");
                        terakhir.tampilkan();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = input.nextLine();
                    stack.cariSurat(cari);
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        input.close();
    }
}
