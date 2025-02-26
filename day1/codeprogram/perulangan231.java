package codeprogram;
import java.util.Scanner;
public class perulangan231 {
    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        System.out.print("Masukkan NIM anda : ");
        long nim = emu.nextLong();
        System.out.println("====================");
        long n = nim % 100;
        if (n<10) {
            n += 10;
        }
        System.out.println("Maka n adalah = " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        emu.close();
    }
}
