import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa11[] arrayMahasiswa = new Mahasiswa11[3];
        String dummy;

        for(int i=0; i<3; i++) {
            arrayMahasiswa[i] = new Mahasiswa11();

            System.out.println("Masukkan Data Mahasiswa ke-" +(i+1));
            System.out.print("NIM       : ");
            arrayMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama      : ");
            arrayMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas     : ");
            arrayMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK       : ");
            dummy = sc.nextLine();
            arrayMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------------------");
        }
        
        for(int i=0; i<3; i++) {
            System.out.println("Data Matakuliah ke-" +(i+1));
            arrayMahasiswa[i].cetakInfo();
        }
    }
}
