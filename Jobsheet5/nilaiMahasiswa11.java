public class nilaiMahasiswa11 {
    // Mencari nilai UTS tertinggi (Divide and Conquer)
    static int findMax(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMax = findMax(arr, l, mid);
        int rightMax = findMax(arr, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    // Mencari nilai UTS terendah (Divide and Conquer)
    static int findMin(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMin = findMin(arr, l, mid);
        int rightMin = findMin(arr, mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    // Menghitung rata-rata nilai UAS (Brute Force)
    static double findAverage(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double) total / arr.length;
    }

    public static void main(String[] args) {
        int uts[] = {78, 85, 90, 76, 92, 88, 80, 82};
        int uas[] = {82, 88, 87, 79, 95, 85, 83, 84};

        int maxUTS = findMax(uts, 0, uts.length - 1);
        int minUTS = findMin(uts, 0, uts.length - 1);
        double avgUAS = findAverage(uas);

        System.out.println("Nilai UTS tertinggi: " + maxUTS);
        System.out.println("Nilai UTS terendah: " + minUTS);
        System.out.println("Rata-rata nilai UAS: " + avgUAS);
    }
}
