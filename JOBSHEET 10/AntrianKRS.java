import java.util.LinkedList;
import java.util.Queue;

public class AntrianKRS {
    Queue<Mahasiswa11> antrian = new LinkedList<>();
    int maxAntrian = 10;
    int totalDiproses = 0;

    public boolean antrianKosong() {
        return antrian.isEmpty();
    }

    public boolean antrianPenuh() {
        return antrian.size() >= maxAntrian;
    }

    public void kosongkanAntrian() {
        antrian.clear();
    }

    public void tambahAntrian(Mahasiswa11 m) {
        if (!antrianPenuh()) {
            antrian.add(m);
            System.out.println(m + " berhasil ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian sudah penuh!");
        }
    }

    public void panggilAntrian() {
        if (antrian.size() >= 2) {
            Mahasiswa11 m1 = antrian.poll();
            Mahasiswa11 m2 = antrian.poll();
            totalDiproses += 2;
            System.out.println("Memanggil: " + m1 + " dan " + m2 + " untuk proses KRS.");
        } else {
            System.out.println("Antrian kurang dari 2.");
        }
    }

    public void tampilkanSemua() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian:");
            for (Mahasiswa11 m : antrian) {
                System.out.println("- " + m);
            }
        }
    }

    public void tampilkanDepan() {
        if (!antrianKosong()) {
            System.out.println("Antrian terdepan: " +
            ((LinkedList<Mahasiswa11>) antrian).peekFirst());
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanAkhir() {
        if (!antrianKosong()) {
            System.out.println("Antrian terakhir: " +
            ((LinkedList<Mahasiswa11>) antrian).peekLast());
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian: " + antrian.size());
    }

    public void cetakJumlahProsesKRS() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + totalDiproses);
    }

    public void cetakJumlahBelumProses() {
        int totalMhs = 30;
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: "
        + (totalMhs - totalDiproses));
    }
}