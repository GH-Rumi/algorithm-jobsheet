package day11.codeprogram;

import java.util.Scanner;

public class SLLMainPertanyaan11 {
    public static void main(String[] args) {
        Scanner ena = new Scanner(System.in);
        SingleLinkedList11 sll = new SingleLinkedList11();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Mahasiswa di Awal");
            System.out.println("2. Tambah Mahasiswa di Akhir");
            System.out.println("3. Tambah Mahasiswa setelah nama tertentu");
            System.out.println("4. Tambah Mahasiswa di posisi tertentu");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = ena.nextInt();
            ena.nextLine();

            if (menu == 0) {
                System.out.println("Keluar dari program.");
                break;
            }

            Mahasiswa11 mhs = null;
            if (menu >= 1 && menu <= 4) {
                System.out.print("NIM: ");
                String nim = ena.nextLine();
                System.out.print("Nama: ");
                String nama = ena.nextLine();
                System.out.print("Kelas: ");
                String kelas = ena.nextLine();
                System.out.print("IPK: ");
                double ipk = ena.nextDouble();
                ena.nextLine();

                mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            }

            switch (menu) {
                case 1:
                    sll.addFirst(mhs);
                    break;
                case 2:
                    sll.addLast(mhs);
                    break;
                case 3:
                    System.out.print("Masukkan nama mahasiswa sebelum ini (target insertAfter): ");
                    String targetNama = ena.nextLine();
                    sll.insertAfter(mhs, targetNama);
                    break;
                case 4:
                    System.out.print("Masukkan indeks (mulai dari 0): ");
                    int index = ena.nextInt();
                    ena.nextLine();
                    sll.insertAt(index, mhs);
                    break;
                case 5:
                    sll.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        ena.close();
    }
}
