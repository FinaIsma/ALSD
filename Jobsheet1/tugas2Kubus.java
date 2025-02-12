import java.util.Scanner;

public class tugas2Kubus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== PROGRAM PERHITUNGAN KUBUS =====");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = sc.nextInt();

            if (pilihan == 4) {
                System.out.println("Terima kasih!");
                break;
            }

            System.out.print("Masukkan panjang rusuk kubus: ");
            double r = sc.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(r));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(r));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(r));
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        sc.close();
    }

    public static double hitungVolume(double r) {
        return r * r * r;
    }

    public static double hitungLuasPermukaan(double r) {
        return 6 * r * r;
    }

    public static double hitungKeliling(double r) {
        return 12 * r;
    }
}
