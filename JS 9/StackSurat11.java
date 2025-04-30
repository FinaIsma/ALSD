public class StackSurat11 {
    Surat11[] tumpukan;
    int top;
    int size;

    public StackSurat11() {
        size = 100;
        tumpukan = new Surat11[size];
        top = -1;
    }

    public void push(Surat11 s) {
        if (top < size - 1) {
            top++;
            tumpukan[top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat11 pop() {
        if (!isEmpty()) {
            Surat11 s = tumpukan[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat11 peek() {
        if (!isEmpty()) {
            return tumpukan[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                tumpukan[i].tampilkan();
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}
