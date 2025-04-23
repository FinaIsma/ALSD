class Dosen {
    String nidn;
    String nama;
    String email;
    int tahunMasuk;
    String prodi;
    int tahunIni = 2025;
    int masaKerja;

    public int hitungMasaKerja() {
        masaKerja = tahunIni - tahunMasuk;
        return masaKerja;
    }

    public Dosen(String nidn, String nama, String email, int tahunMasuk, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.prodi = prodi;
    }

    public void tampil() {
        hitungMasaKerja();
        System.out.printf("%-15s %-17s %-22s %-15s %-15s\n", nidn, nama, email, masaKerja + " tahun", prodi);
    }
}
