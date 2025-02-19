public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 matkul = new MataKuliah11();
        System.out.println("Data Mata Kuliah");
        matkul.kodeMk = "ALSD";
        matkul.nama = "Algoritma dan Struktur Data";
        matkul.sks = 2;
        matkul.jumlahJam = 4;
        matkul.tampilInformasi();
       
        System.out.println("\nData Mata Kuliah setelah perubahan");
        matkul.ubahSKS(3);
        matkul.tambahJam(2);
        matkul.tampilInformasi();

        System.out.println("");
        MataKuliah11 matkul2 = new MataKuliah11("PALSD", "Praktek Algoritma dan Struktur Data",
        4, 8);
        matkul2.tampilInformasi();
        
        System.out.println("\nData Mata Kuliah setelah perubahan");
        matkul2.ubahSKS(3);
        matkul2.kurangiJam(2);
        matkul2.tampilInformasi();
    }
}
