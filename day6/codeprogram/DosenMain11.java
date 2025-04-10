package day6.codeprogram;

import java.util.Scanner;

public class DosenMain11 {
        public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        DosenData11 dataDosen = new DosenData11();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            choice = emu.nextInt();
            emu.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = emu.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = emu.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jk = emu.nextBoolean();
                    System.out.print("Masukkan Usia Dosen: ");
                    int usia = emu.nextInt();
                    Dosen11 dsn = new Dosen11(kode, nama, jk, usia);
                    dataDosen.tambah(dsn);
                    break;
                case 2:
                    dataDosen.tampil();
                    break;
                case 3:
                    dataDosen.sortingASC();
                    System.out.println("Data Dosen telah diurutkan berdasarkan usia (Muda ke Tua).");
                    break;
                case 4:
                    dataDosen.sortingDSC();
                    System.out.println("Data Dosen telah diurutkan berdasarkan usia (Tua ke Muda).");
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5);

        emu.close();
    }
}
