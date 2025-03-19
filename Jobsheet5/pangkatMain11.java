import java.util.Scanner;
public class pangkatMain11 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Elemen: ");
    int elemen = input.nextInt();

    pangkat11[] png = new pangkat11[elemen];
    for(int i = 0; i<elemen; i++){
        System.out.print("Masukkan nilai basis elemen ke-" +(i+1)+": ");
        int basis = input.nextInt();
        System.out.print("Masukkan nilai pangkat elemen ke-" +(i+1)+ ": ");
        int pangkat = input.nextInt();
        png[i] = new pangkat11(basis, pangkat);
    }

    System.out.println("HASIL PANGKAT BRUTEFORCE: ");
    for (pangkat11 p : png){
        System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
    }
    System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
    for (pangkat11 p : png){
        System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
    }
    }
}