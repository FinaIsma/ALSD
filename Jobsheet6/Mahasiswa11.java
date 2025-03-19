public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    //Konstruktor default
    Mahasiswa11() {
    }

    //Konstruktor berparameter
    Mahasiswa11(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " +nim);
        System.out.println("Kelas   : " +kelas);
        System.out.println("IPK     : " +ipk);
    }
}