public class MataKuliah11 {
    String kodeMk;
    String namaMK;
    int sks;

    public MataKuliah11(String kode, String nama, int sks) {
        kodeMk = kode;
        this.namaMK = nama;
        this.sks = sks;
    }

    void tampilInformasi() {
        System.out.println("===== INFORMASI MATA KULIAH =====");
        System.out.println("Kode        : " +kodeMk);
        System.out.println("Nama        : " +namaMK);
        System.out.println("SKS         : " +sks);
        System.out.println("---------------------------------");
    }

    void ubahNamaMK(String MKBaru) {
        namaMK = MKBaru;
    }

    void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            sks = sksBaru;
        } else {
            System.out.println("Menambah SKS minimal 2.");
        }
    }
    
    public MataKuliah11() {
    }

}
