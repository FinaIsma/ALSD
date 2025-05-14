public class MahasiswaAntri {
    String nim, nama, keperluan;

    public MahasiswaAntri(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilData() {
        System.out.printf("%-10s %-15s %-20s\n", nim, nama, keperluan);
    }
}