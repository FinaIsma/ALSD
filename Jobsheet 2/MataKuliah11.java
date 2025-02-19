public class MataKuliah11 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode        : " +kodeMk);
        System.out.println("Nama        : " +nama);
        System.out.println("SKS         : " +sks);
        System.out.println("Jumlah Jam  : " +jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah dirubah");
    }

    void tambahJam(int jam) {
        jumlahJam = jumlahJam+jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam = jumlahJam-jam;
            // return jam;
        } else {
            System.out.println("Jumlah awal jam lebih" +
            "sedikit dari pengurangan jam");
        }
    }
    
    public MataKuliah11() {

    }

    public MataKuliah11(String kode, String nama, int sks,
    int jmlJam) {
        kodeMk = kode;
        this.nama = nama;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
}
