public class QueueLayanan {
    NodeAntrian front, rear;
    int size;

    public QueueLayanan() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(MahasiswaAntri data) {
        NodeAntrian baru = new NodeAntrian(data);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil!");
        } else {
            System.out.println("Mahasiswa " + front.data.nama + " telah dipanggil.");
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.printf("%-10s %-15s %-20s\n", "NIM", "Nama", "Keperluan");
            NodeAntrian current = front;
            while (current != null) {
                current.data.tampilData();
                current = current.next;
            }
        }
    }

    public void lihatTerdepan() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void lihatTerakhir() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terakhir: ");
            rear.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void kosongkan() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size);
    }
}
