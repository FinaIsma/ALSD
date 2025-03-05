public class Matkul11 {
    public class MataKuliah11 {
        public String kode;
        public String nama;
        public int sks;
    
        public MataKuliah11() {
            this.kode = "";
            this.nama = "";
            this.sks = 0;
        }

        public void cetakInfo() {
            System.out.println("===== INFORMASI MATA KULIAH =====");
            System.out.println("Kode        : " + this.kode);
            System.out.println("Nama        : " +this.nama);
            System.out.println("SKS         : " +this.sks);
            System.out.println("----------------------------------");
        }

        public void ubahSKS() {
            
        }
    }
}
