public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double ipk;
    
    void tampilkanInformasi() {
        System.out.println("Nama : " +nama);
        System.out.println("NIM : " +nim);
        System.out.println("IPK : " +ipk);
        System.out.println("Kelas : " +kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru < 0.00 || ipkBaru > 4.00) {
            System.out.println("IPK tidak valid");
            return;
        }
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }

    public Mahasiswa11() {

    }

    public Mahasiswa11(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}
