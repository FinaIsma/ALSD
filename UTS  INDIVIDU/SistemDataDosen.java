class SistemDataDosen {
    public static void tampilData(Dosen[] Dosen) {
        System.out.printf("\n%-15s %-17s %-22s %-15s %-15s\n", "NIDN", "Nama", "Email", "Masa Kerja", "Program Studi");
        for (Dosen dsn : Dosen) {
            dsn.tampil();
        }
    }

    public static void SortingbyNIDN(Dosen[] dsn) { // Bubble Sort
        for (int i = 0; i < dsn.length - 1; i++) {
            for (int j = 0; j < dsn.length - i - 1; j++) {
                if (dsn[j].nidn.compareTo(dsn[j + 1].nidn) > 0) {
                    Dosen temp = dsn[j];
                    dsn[j] = dsn[j + 1];
                    dsn[j + 1] = temp;
                }
            }
        }
    }

    public static void SortingbyMasaKerja(Dosen[] dsn) { // Insertion Sort (Descending)
        for (int i = 1; i < dsn.length; i++) {
            Dosen key = dsn[i];
            int keyNilai = key.hitungMasaKerja();
            int j = i - 1;

            while (j >= 0 && dsn[j].hitungMasaKerja() < keyNilai) {
                dsn[j + 1] = dsn[j];
                j--;
            }
            dsn[j + 1] = key;
        }
    }

    public static String cariDosenbyNama(Dosen[] list, String nama) { // Linear Search
        for (Dosen dsn : list) {
            if (dsn.nama.equalsIgnoreCase(nama)) {
                System.out.println("Dosen ditemukan:");
                System.out.printf("\n%-15s %-17s %-22s %-15s %-15s\n", "NIDN", "Nama", "Email", "Masa Kerja", "Program Studi");
                dsn.tampil();
                return nama;
            }
        }
        System.out.println("Dosen dengan nama \"" + nama + "\" tidak ditemukan.");
        return null;
    }
}
