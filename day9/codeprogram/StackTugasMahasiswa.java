package day9.codeprogram;

public class StackTugasMahasiswa {
    Mahasiswa11[] stack;
    int top, size;

    public StackTugasMahasiswa(int size) {
        this.size = size;
        top = -1;
        stack = new Mahasiswa11[size];
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa11 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa11 pop() {
        if (!isEmpty()) {
            Mahasiswa11 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa11 pengumpulanPertama() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public int totalTugas() {
        int total = 0;
        if (!isEmpty()) {
            total = top + 1;
            return total;
        }
        return 0;
    }

    String konversiDesimalKeBiner(int nilai) {
        StackKonversi11 stack = new StackKonversi11();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = "";
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}