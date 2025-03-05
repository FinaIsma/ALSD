import java.util.Scanner;
public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMatkul = sc.nextInt();

        MataKuliah11[] arrayMataKuliah11 = new MataKuliah11[jumlahMatkul];
        for(int i=0; i<jumlahMatkul; i++) {
            arrayMataKuliah11[i] = new MataKuliah11();
            arrayMataKuliah11[i].tambahData(sc);
        }

        for(int i=0; i<3; i++) {
            System.out.println("Data Matakuliah ke-" +(i+1));
            arrayMataKuliah11[i].cetakInfo();
        }

        sc.close();
    }
}
