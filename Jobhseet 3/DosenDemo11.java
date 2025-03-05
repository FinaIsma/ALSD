import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen11[] arrayDosen = new Dosen11[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayDosen[i] = new Dosen11();
            arrayDosen[i].tambahData(sc);
        }

        System.out.println("\n===== Data Semua Dosen =====");
        for (Dosen11 dosen : arrayDosen) {
            dosen.cetakInfo();
        }

        // Memanggil method dari DataDosen
        DataDosen11.dataSemuaDosen(arrayDosen);
        DataDosen11.jumlahDosenPerJenisKelamin(arrayDosen);
        DataDosen11.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        DataDosen11.infoDosenPalingTua(arrayDosen);
        DataDosen11.infoDosenPalingMuda(arrayDosen);

        sc.close();
    }
}