public class BinaryTreeArray11 {
    Mahasiswa11[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray11() {
        this.dataMahasiswa = new Mahasiswa11[10];
    }

    void populateData(Mahasiswa11 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa11 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree penuh");
            return;
        }
        dataMahasiswa[++idxLast] = data;
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
