import java.util.Scanner;

class pemilihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==========================");

        System.out.println("Masukkan Nilai Tugas: ");
        double NilaiTugas = sc.nextDouble();
        System.out.println("Masukkan Nilai Kuis: ");
        double NilaiKuis = sc.nextDouble();
        System.out.println("Masukkan Nilai UTS: ");
        double NilaiUTS = sc.nextDouble();
        System.out.println("Masukkan Nilai UAS: ");
        double NilaiUAS = sc.nextDouble();

        if (NilaiTugas < 0 || NilaiTugas > 100 || NilaiKuis < 0 || NilaiKuis > 100 ||  NilaiUTS < 0 || NilaiUTS > 100 || NilaiUAS < 0 || NilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            NilaiTugas = NilaiTugas*20/100;
            NilaiKuis = NilaiKuis*20/100;
            NilaiUTS = NilaiUTS*30/100;
            NilaiUAS = NilaiUAS*30/100;

            double NilaiAkhir = NilaiTugas + NilaiKuis + NilaiUTS + NilaiUAS;

            String NilaiHuruf;
            if (NilaiAkhir > 80) {
                NilaiHuruf = "A";
            } else if (NilaiAkhir > 73) {
                NilaiHuruf = "B+"; 
            } else if (NilaiAkhir > 65) {
                NilaiHuruf = "B"; 
            } else if (NilaiAkhir > 60) {
                NilaiHuruf = "C+"; 
            } else if (NilaiAkhir > 50) {
                NilaiHuruf = "C"; 
            } else if (NilaiAkhir > 39) {
                NilaiHuruf = "D"; 
            } else {
                NilaiHuruf = "E";
            }

            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai Akhir: " +NilaiAkhir);
            System.out.println("Nilai Huruf: " +NilaiHuruf);
            System.out.println("=========================");
            System.out.println("=========================");
            
            if (NilaiHuruf == "E") {
                System.out.println("ANDA GAGAL");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
    }
}