class mataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public mataKuliah(String kdMK, String namaMK, int sks) {
        kodeMK = kdMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilMatakuliah() {
        System.out.println("Kode MK: " + kodeMK + " | Nama MK: " + namaMK +  "  | SKS: " + sks);
    }
}