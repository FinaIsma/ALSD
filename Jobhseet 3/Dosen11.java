import java.util.Scanner;
public class Dosen11 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen11() {
        this.kode = "";
        this.nama = "";
        this.jenisKelamin = true;
        this.usia = 0;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode                          : ");
        this.kode = sc.nextLine();
        System.out.print("Nama                          : ");
        this.nama = sc.nextLine();
        System.out.print("Jenis Kelamin (Pria/Wanita)   : ");
        String jkel = sc.nextLine();
        this.jenisKelamin = jkel.equalsIgnoreCase("Pria");

        System.out.print("Usia                          : ");
        this.usia = Integer.parseInt(sc.nextLine());
        System.out.println("-------------------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode            : " + this.kode);
        System.out.println("Nama            : " + this.nama);
        String jkel = (this.jenisKelamin) ? "Pria" : "Wanita";
        System.out.println("Jenis Kelamin   : " + jkel);
        System.out.println("Usia            : " + this.usia + " tahun");
        System.out.println("----------------------------------");
    }
}
