/* Nama Kelompok:   Fina Ismatus Saniyah / 11 / 244107060004
                    Galuh Saprilia Putri / 12 / 244107060154
 * 
 */

import java.util.Scanner;

public class sistemAkademikMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        mataKuliah[] mk = {
            new mataKuliah("MK001", "Struktur Data", 3),
            new mataKuliah("MK002", "Basis Data", 3),
            new mataKuliah("MK003", "Desain Web", 3)
        };

        penilaian[] nilai = {
            new penilaian(mhs[0], mk[0], 80, 85, 90),
            new penilaian(mhs[0], mk[1], 60, 75, 70),
            new penilaian(mhs[1], mk[0], 75, 70, 80),
            new penilaian(mhs[2], mk[1], 85, 90, 95),
            new penilaian(mhs[2], mk[2], 90, 80, 65)
        };

        int pilihan;
        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    sistemAkademik.tampilkanMahasiswa(mhs);
                    break;

                case 2:
                    sistemAkademik.tampilkanMataKuliah(mk);
                    break;

                case 3:
                    sistemAkademik.tampilkanPenilaian(nilai);
                    break;

                case 4:
                    sistemAkademik.insertionSortByNilaiAkhir(nilai);
                    sistemAkademik.tampilkanPenilaian(nilai);
                    break;

                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimCari = sc.next();
                    Mahasiswa hasil = sistemAkademik.cariMahasiswaByNIM(mhs, nimCari);
                    if (hasil != null) {
                        hasil.tampilMahasiswa();
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 0);
    }
}