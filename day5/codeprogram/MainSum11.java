package day5.codeprogram;

import java.util.Scanner;

public class MainSum11 {
    public static void main(String[] args) {
        Scanner ena = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: "); 
        int elemen = ena.nextInt();

        Sum11 sm = new Sum11(elemen);
        for(int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = ena.nextDouble();
        }
        System.out.println("Total keuntungan mennggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunaka Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }

}
