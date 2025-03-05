public class Mahasiswa11 {
    String nim;
    String nama;
    int tahunMasuk;
    MataKuliah11[] matkulDiambil;
    int jumlahMK;

    public Mahasiswa11(String nim, String nama, int tahunMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.matkulDiambil = new MataKuliah11[10];
    }

    void tampilkanInfo() {
        System.out.println("======= INFORMASI MAHASISWA =======");
        System.out.println("NIM         : " +nim);
        System.out.println("Nama        : " +nama);
        System.out.println("Tahun Masuk : " +tahunMasuk);
        System.out.println("Mata Kuliah yang Diambil ");
        for (int i = 0; i < jumlahMK; i++) {
            matkulDiambil[i].tampilInformasi();
        }
    }

    public void tambahMataKuliah(MataKuliah11 mataKuliah) {
        if (jumlahMK < matkulDiambil.length) {
            matkulDiambil[jumlahMK] = mataKuliah;
            jumlahMK++;
        } else {
            System.out.println("Tidak bisa menambah mata kuliah, kapasitas penuh!");
        }
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            totalSKS += matkulDiambil[i].sks;
        }
        return totalSKS;
    }
}