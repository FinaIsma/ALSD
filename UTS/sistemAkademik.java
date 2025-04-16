public class sistemAkademik {

    public static void insertionSortByNilaiAkhir(penilaian[] data) {
        for (int i = 1; i < data.length; i++) {
            penilaian key = data[i];
            double keyNilai = key.hitungNilaiAkhir();
            int j = i - 1;

            while (j >= 0 && data[j].hitungNilaiAkhir() < keyNilai) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
    }

    public static Mahasiswa cariMahasiswaByNIM(Mahasiswa[] list, String nim) {
        for (Mahasiswa m : list) {
            if (m.nim.equals(nim)) {
                return m;
            }
        }
        return null;
    }

    public static void tampilkanPenilaian(penilaian[] nilai) {
        for (penilaian p : nilai) {
            p.tampilNilai();
        }
    }

    public static void tampilkanMahasiswa(Mahasiswa[] mahasiswa) {
        for (Mahasiswa m : mahasiswa) {
            m.tampilMahasiswa();
        }
    }

    public static void tampilkanMataKuliah(mataKuliah[] matkul) {
        for (mataKuliah m : matkul) {
            m.tampilMatakuliah();
        }
    }
}