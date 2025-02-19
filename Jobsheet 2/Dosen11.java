public class Dosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID              : " +idDosen);
        System.out.println("Nama            : " +nama);
        System.out.println("Status          : " +statusAktif);
        System.out.println("Tahun Bergabung : " +tahunBergabung);
        System.out.println("Bidang Keahlian : " +bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (status) {
            System.out.println("Dosen Aktif");
        } else {
            System.out.println("Dosen Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg-tahunBergabung;
        System.out.println("Masa Kerja      : " +masaKerja+ " tahun.");
        return masaKerja;
    }

    void ubahKeahlian (String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen11() {

    }

    public Dosen11(String ID, String nama, boolean status,
    int tahunBergabung, String bidang) {
        idDosen = ID;
        this.nama = nama;
        statusAktif = status;
        this.tahunBergabung = tahunBergabung;
        bidangKeahlian = bidang;
    }
}
