public class fungsi11 {

    // Stok bunga setiap cabang
    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    // Harga setiap bunga
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    
    public static void main(String[] args) {
        // Menampilkan pendapatan setiap cabang
        System.out.println("Pendapatan setiap cabang jika semua bunga terjual:");
        hitungPendapatan();
        
        // Menampilkan stok bunga di RoyalGarden 4 sebelum dikurangi
        System.out.println("\nStock bunga di RoyalGarden 4 sebelum dikurangi:");
        tampilkanStock(3);
        
        // Pengurangan stok karena bunga mati
        int[] penguranganStock = {-1, -2, 0, -5};
        updateStock(3, penguranganStock);
        
        // Menampilkan stok bunga di RoyalGarden 4 setelah dikurangi
        System.out.println("\nStock bunga di RoyalGarden 4 setelah dikurangi karena bunga mati:");
        tampilkanStock(3);
    }
    
    // Fungsi menghitung pendapatan setiap cabang
    public static void hitungPendapatan() {
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + String.format("%,d", totalPendapatan));
        }
    }
    
    // Fungsi untuk menampilkan stok bunga di cabang tertentu
    public static void tampilkanStock(int cabang) {
        for (int jumlah : stockBunga[cabang]) {
            System.out.print(jumlah + " ");
        }
        System.out.println();
    }
    
    // Fungsi  memperbarui stok setelah pengurangan
    public static void updateStock(int cabang, int[] pengurangan) {
        for (int i = 0; i < stockBunga[cabang].length; i++) {
            stockBunga[cabang][i] = Math.max(0, stockBunga[cabang][i] + pengurangan[i]);
        }
    }
}
