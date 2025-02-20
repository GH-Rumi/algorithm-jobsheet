package codeprogram;
import java.util.Scanner;

public class tugas2 {

    public static double hitungVolume(double rusuk) {
        return rusuk * rusuk * rusuk;
    }

    public static double hitungLuasPermukaan(double rusuk) {
        return 6 * rusuk * rusuk;
    }

    public static double hitungKeliling(double rusuk) {
        return 12 * rusuk;
    }

    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih perhitungan yang ingin dilakukan:");
            System.out.println("1. Volume Kubus");
            System.out.println("2. Luas Permukaan Kubus");
            System.out.println("3. Keliling Kubus");
            System.out.println("4. Keluar");

            System.out.print("Masukkan pilihan : ");
            int pilihan = emu.nextInt();

            if (pilihan == 4) {
                System.out.println("Program selesai.");
                break;
            }

            System.out.print("Masukkan panjang rusuk kubus: ");
            double rusuk = emu.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(rusuk));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(rusuk));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(rusuk));
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
            System.out.println();
        }
        emu.close();
    }
}