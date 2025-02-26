package codeprogram;
import java.util.Scanner;
public class pemilihan221 {

    public static void main(String[] args) {
        Scanner emu = new Scanner(System.in);
        double totalNilai = 0;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = emu.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = emu.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = emu.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = emu.nextInt();
        System.out.println("======================");
        System.out.println("======================");
        if (tugas <= 100 && tugas >= 0 && kuis <= 100 && kuis >= 0 && uts <= 100 && uts >= 0 && uas <= 100 && uas >= 0) {
            tugas = tugas * 0.2;
            totalNilai += tugas;

            kuis = kuis * 0.2;
            totalNilai += kuis;

            uts = uts * 0.3;
            totalNilai += uts;

            uas = uas * 0.3;
            totalNilai += uas;
            System.out.println("Nilai Akhir: " + totalNilai);
            if (totalNilai > 80 && totalNilai <= 100) {
                System.out.println("nilai huruf: A");
                System.out.println("======================");
                System.out.println("======================");
            } else if (totalNilai > 73 && totalNilai <= 80) {
                System.out.println("nilai huruf: B+");
                System.out.println("======================");
                System.out.println("======================");
            } else if (totalNilai > 65 && totalNilai <= 73) {
                System.out.println("nilai huruf: B");
                System.out.println("======================");
                System.out.println("======================");
            } else if (totalNilai > 60 && totalNilai <= 65) {
                System.out.println("nilai huruf: C+");
                System.out.println("======================");
                System.out.println("======================");
            } else if (totalNilai > 50 && totalNilai <= 60) {
                System.out.println("nilai huruf: C");
                System.out.println("======================");
                System.out.println("======================");
            } else if (totalNilai > 39 && totalNilai <= 50) {
                System.out.println("nilai huruf: D");
                System.out.println("======================");
                System.out.println("======================");
            } else if (totalNilai <= 39) {
                System.out.println("nilai huruf: E");
                System.out.println("======================");
                System.out.println("======================");
            } if (totalNilai > 50 && totalNilai <= 100) {
                System.out.println("SELAMAT ANDA LULUS!");
            } else {
                System.out.println("MAAF, ANDA TIDAK LULUS");
            }
        } else {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        }
        emu.close();
    }
}