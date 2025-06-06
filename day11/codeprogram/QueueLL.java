package day11.codeprogram;

public class QueueLL {
    NodeTugas front, rear;
    int size;

    public QueueLL() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; // Karena berbasis linked list, maka tidak terbatas (selama memori cukup)
    }

    public void enqueue(MahasiswaTugas mhs) {
        NodeTugas newNode = new NodeTugas(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
        } else {
            System.out.print("Mahasiswa yang dipanggil: ");
            front.data.tampil();
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            NodeTugas temp = front;
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public int getSize() {
        return size;
    }
}