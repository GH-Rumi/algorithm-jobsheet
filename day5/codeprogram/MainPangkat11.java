package day5.codeprogram;

import java.util.Scanner;

public class MainPangkat11 {
    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = emu.nextInt();

        Pangkat11[] png = new Pangkat11[elemen];
        for(int i=0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = emu.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = emu.nextInt();
            png[i] = new Pangkat11(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat11 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.Pangkat11BF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat11 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.Pangkat11DC(p.nilai, p.pangkat));
        }
    }
}
