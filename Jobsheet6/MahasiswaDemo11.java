import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = input.nextLine();

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Kelas: ");
            String kelas = input.nextLine();

            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();

            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK:");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut dengan SELECTION SORT");
        list.selectionSort();
        list.tampil();

        System.out.println("\n Data yang sudah terurut dengan INSERTION SORT");
        list.insertionSort();
        list.tampil();
        
        input.close();
    }
}
