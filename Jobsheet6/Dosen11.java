class Dosen11 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = laki-laki, false = perempuan
    int usia;

    public Dosen11(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + 
                           ", Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + 
                           ", Usia: " + usia);
    }
}