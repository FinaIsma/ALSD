public class DataDosen11 {
    // a. Menampilkan semua data dosen
    public static void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        System.out.println("===== Data Semua Dosen =====");
        for (Dosen11 d : arrayOfDosen) {
            d.cetakInfo();
        }
    }

    // b. Menampilkan jumlah dosen per jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("===== Jumlah Dosen Per Jenis Kelamin =====");
        System.out.println("Pria  : " + pria);
        System.out.println("Wanita: " + wanita);
    }

    // c. Menghitung rata-rata usia dosen per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                countPria++;
            } else {
                totalUsiaWanita += d.usia;
                countWanita++;
            }
        }

        System.out.println("===== Rata-rata Usia Dosen Per Jenis Kelamin =====");
        System.out.println("Pria  : " + (countPria > 0 ? (double) totalUsiaPria / countPria : 0) + " tahun");
        System.out.println("Wanita: " + (countWanita > 0 ? (double) totalUsiaWanita / countWanita : 0) + " tahun");
    }

    // d. Menampilkan dosen paling tua
    public static void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen11 tertua = arrayOfDosen[0];
        for (Dosen11 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("===== Dosen Paling Tua =====");
        tertua.cetakInfo();
    }

    // e. Menampilkan dosen paling muda
    public static void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen11 termuda = arrayOfDosen[0];
        for (Dosen11 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("===== Dosen Paling Muda =====");
        termuda.cetakInfo();
    }
}
