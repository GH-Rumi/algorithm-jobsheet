package day3.codeprogram;

import java.util.Scanner;

public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = Integer.parseInt(emu.nextLine());

        MataKuliah11[] arrayOfMataKuliah11 = new MataKuliah11[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah11[i] = new MataKuliah11();
            arrayOfMataKuliah11[i].tambahData(emu);
            System.out.println("--------------------------------");
        }

        System.out.println("Data Mata Kuliah yang Dimasukkan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah11[i].cetakInfo();
        }
        emu.close();
    }
}
