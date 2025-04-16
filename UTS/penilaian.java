class penilaian {
    Mahasiswa mahasiswa;
    mataKuliah matkul;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public double hitungNilaiAkhir() {
        return nilaiAkhir = (nilaiTugas*0.3) + (nilaiUTS*0.3) + (nilaiUAS*0.4);
    }

    public penilaian(Mahasiswa mahasiswa, mataKuliah matkul, double tugas, double UTS, double UAS) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.nilaiTugas = tugas;
        this.nilaiUTS = UTS;
        this.nilaiUAS = UAS;
    }
    
    public void tampilNilai() {
        System.out.println("Nama: " +mahasiswa.nama+ "  | Matkul: " + matkul.namaMK + "    | Nilai Akhir: " + hitungNilaiAkhir());
    } 
}