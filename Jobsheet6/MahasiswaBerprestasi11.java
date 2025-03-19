import java.util.ArrayList;

class MahasiswaBerprestasi11 {
    ArrayList<Mahasiswa11> listMhs = new ArrayList<>();

    void tambah(Mahasiswa11 m) {
        listMhs.add(m);
    }

    void tampil() {
        if (listMhs.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        for (Mahasiswa11 m : listMhs) {
            m.tampilInformasi();
        }
    }

    // Bubble Sort (Descending berdasarkan IPK)
    void bubbleSort() {
        int n = listMhs.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (listMhs.get(j).ipk < listMhs.get(j + 1).ipk) { // Descending
                    Mahasiswa11 tmp = listMhs.get(j);
                    listMhs.set(j, listMhs.get(j + 1));
                    listMhs.set(j + 1, tmp);
                }
            }
        }
    }

    // Selection Sort (Ascending berdasarkan IPK)
    void selectionSort() {
        int n = listMhs.size();
        for (int i = 0; i < n - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < n; j++) {
                if (listMhs.get(j).ipk < listMhs.get(idxMin).ipk) { // Ascending
                    idxMin = j;
                }
            }
            // Tukar elemen terkecil dengan elemen ke-i
            Mahasiswa11 tmp = listMhs.get(idxMin);
            listMhs.set(idxMin, listMhs.get(i));
            listMhs.set(i, tmp);
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.size(); i++) {
            Mahasiswa11 tempMahasiswa11 = listMhs.get(i);
            int j = i;
            while (j > 0 && listMhs.get(j - 1).ipk < tempMahasiswa11.ipk) {
                listMhs.set(j, listMhs.get(j - 1));
                j--;
            }
            listMhs.set(j, tempMahasiswa11);
        }
    }
}
