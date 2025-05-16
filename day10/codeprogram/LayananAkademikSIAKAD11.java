package day10.codeprogram;

import java.util.Scanner;

public class LayananAkademikSIAKAD11 {
        public static void main(String[] args) {
        Scanner ena = new Scanner(System.in);
        AntrianLayanan11 antrian = new AntrianLayanan11(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrean");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrean");
            System.out.println("5. Jumlah Mahasiswa dalam Antrean");
            System.out.println("0. Keluar");
            System.out.println("---------------------------------------");
            System.out.print("Pilih menu : ");
            pilihan = ena.nextInt();
            ena.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = ena.nextLine();
                    System.out.print("Nama : ");
                    String nama = ena.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = ena.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = ena.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, prodi, kelas);
                    antrian.tambahAntrean(mhs);
                    break;

                case 2:
                    Mahasiswa11 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani Mahasiswa : ");
                        dilayani.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    System.out.println("Jumlah dalam antrian : " + antrian.getJumlahAntrean());
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        ena.close();
    }
}
