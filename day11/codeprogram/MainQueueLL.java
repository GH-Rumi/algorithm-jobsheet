package day11.codeprogram;

import java.util.Scanner;

public class MainQueueLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLL queue = new QueueLL();
        int pilihan;

        do {
            System.out.println("\n====== MENU ANTRIAN MAHASISWA ======");
            System.out.println("1. Daftarkan Mahasiswa (Tambah Antrian)");
            System.out.println("2. Panggil Mahasiswa (Dequeue)");
            System.out.println("3. Tampilkan Antrian Terdepan");
            System.out.println("4. Tampilkan Antrian Terakhir");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Cek Antrian Penuh");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Tampilkan Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data mahasiswa:");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine(); // Buang newline
                    MahasiswaTugas mhs = new MahasiswaTugas(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 6:
                    System.out.println(queue.isFull() ? "Antrian penuh." : "Antrian tidak penuh.");
                    break;
                case 7:
                    queue.clear();
                    break;
                case 8:
                    queue.printQueue();
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa yang masih mengantre: " + queue.getSize());
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
