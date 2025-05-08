package day9.codeprogram;

public class StackSurat {
    Surat11[] data;
    int top;

    public StackSurat(int kapasitas) {
        data = new Surat11[kapasitas];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= data.length - 1;
    }

    public void push(Surat11 s) {
        if (!isFull()) {
            top++;
            data[top] = s;
        } else {
            System.out.println("Stack penuh, tidak dapat menambahkan surat!");
        }
    }

    public Surat11 pop() {
        if (!isEmpty()) {
            Surat11 suratTeratas = data[top];
            data[top] = null;
            top--;
            return suratTeratas;
        } else {
            System.out.println("Stack kosong, tidak ada surat yang dapat diproses.");
            return null;
        }
    }

    public Surat11 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (data[i] != null && data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                data[i].tampilkan();
                return;
            }
        }
        System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
    }
}
