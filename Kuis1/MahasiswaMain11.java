public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasiswa11 mahasiswa = new Mahasiswa11("244107060004", "Fina", 2024);
        MataKuliah11 mk1 = new MataKuliah11("BD", "Basis Data", 3);
        MataKuliah11 mk2 = new MataKuliah11("ALSD", "Algoritma Struktur Data", 4);
        
        mahasiswa.tambahMataKuliah(mk1);
        mahasiswa.tambahMataKuliah(mk2);
        mahasiswa.tampilkanInfo();
        System.out.println("Total SKS   : " + mahasiswa.hitungTotalSKS());
    }
}
