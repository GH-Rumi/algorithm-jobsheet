package day9.codeprogram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackSurat stackSurat = new StackSurat(10);
        Scanner ena = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- Menu Surat Izin Mahasiswa ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = ena.nextInt();
            ena.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat     : ");
                    String id = ena.nextLine();
                    System.out.print("Nama         : ");
                    String nama = ena.nextLine();
                    System.out.print("Kelas        : ");
                    String kelas = ena.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = ena.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = ena.nextInt();
                    ena.nextLine(); // konsumsi newline

                    Surat11 surat = new Surat11(id, nama, kelas, jenis, durasi);
                    stackSurat.push(surat);
                    break;
                case 2:
                    Surat11 diProses = stackSurat.pop();
                    if (diProses != null) {
                        System.out.println("Surat yang diproses: ");
                        diProses.tampilkan();
                    }
                    break;
                case 3:
                    Surat11 teratas = stackSurat.pop();
                    if (teratas != null) {
                        System.out.println("Surat yang terakhir dikumpulkan: ");
                        teratas.tampilkan();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = ena.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
        ena.close();
    }
}

