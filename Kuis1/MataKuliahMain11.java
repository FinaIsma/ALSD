public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 mk1 = new MataKuliah11("ALSD", "Algoritma dan Struktur Data", 3);
        mk1.tampilInformasi();
        mk1.ubahNamaMK("Teori Algoritma dan Struktur Data");
        mk1.ubahSKS(4);
        mk1.tampilInformasi();

        MataKuliah11 mk2 = new MataKuliah11("PALSD", "Algoritma dan Struktur Data", 3);
        mk2.tampilInformasi();
        mk2.ubahNamaMK("Praktik Algoritma dan Struktur Data");
        mk2.ubahSKS(1);
        mk2.tampilInformasi();
    }
}
