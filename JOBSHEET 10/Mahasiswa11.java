public class Mahasiswa11 {
    String nama;
    String nim;

    public Mahasiswa11(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String toString() {
        return nama + " (" + nim + ")";
    }
}