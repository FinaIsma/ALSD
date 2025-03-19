import java.util.Scanner;

public class faktorialMain11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        faktorial11 fk = new faktorial11();
        System.out.println("Nilai Faktorial " +nilai+
        " menggunakan BF: " +fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " +nilai+
        " menggunakan DC: " +fk.faktorialDC(nilai));
    }
}
