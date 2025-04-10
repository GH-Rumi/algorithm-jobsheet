package day5.codeprogram;

import java.util.Scanner;

public class MainFaktorial11 {
    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = emu.nextInt();
        
        Faktorial11 fk = new Faktorial11();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.Faktorial11BF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.Faktorial11DC(nilai));
    }      
}
