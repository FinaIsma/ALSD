public class sortingmain11 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        sorting11 dataurut1 = new sorting11(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();;
        dataurut1.bubbleSort();
        System.out.println("Data diurutkan dengan BUBBLE SORT (ASC )");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        sorting11 dataurut2 = new sorting11(b, b.length);
        System.out.println("\nData awal 2");
        dataurut2.tampil();
        dataurut2.selectionsort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        int c[] = {40, 10, 4, 9, 3};
        sorting11 dataurut3 = new sorting11(b, b.length);
        System.out.println("\nData awal 3");
        dataurut3.tampil();
        dataurut3.selectionsort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
