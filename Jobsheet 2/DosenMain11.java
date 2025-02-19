public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 ds1 = new Dosen11();
        System.out.println("Data Dosen");
        ds1.idDosen = "SG";
        ds1.nama = "Satoru Gojo";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2006;
        ds1.bidangKeahlian = "CP";

        ds1.ubahKeahlian("English");
        ds1.tampilInformasi();
        ds1.hitungMasaKerja(2025);
        ds1.setStatusAktif(true);

        Dosen11 ds2 = new Dosen11("FIS", "Fina Ismatus Saniyah",
        true, 2018, "MATH");
        ds2.tampilInformasi();
        ds2.hitungMasaKerja(2025);
        ds2.setStatusAktif(true);
    }
}
