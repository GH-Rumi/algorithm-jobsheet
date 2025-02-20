package codeprogram;
import java.util.Scanner;

public class array241 {
    public static void main(String[] args) {
        System.out.println("Program Menghitung IP Semester");
        Scanner emu = new Scanner(System.in);
        String[] matkul = {
                "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };
        double[] nilai = new double[8];
        String[] predikat = new String[8];
        double[] bobot = new double[8];
        byte[] bobotSKS = { 2, 2, 2, 3, 2, 2, 3, 2 };

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilai[i] = emu.nextDouble();

            if (nilai[i] > 80 && nilai[i] <= 100) {
                predikat[i] = "A";
                bobot[i] = 4.00;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                predikat[i] = "B+";
                bobot[i] = 3.50;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                predikat[i] = "B";
                bobot[i] = 3.00;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                predikat[i] = "C+";
                bobot[i] = 2.50;
            } else if (nilai[i] > 50 && nilai[i] <= 60) {
                predikat[i] = "C";
                bobot[i] = 2.00;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                predikat[i] = "D";
                bobot[i] = 1.00;
            } else {
                predikat[i] = "E";
                bobot[i] = 0.00;
            }

            totalBobot += bobot[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        System.out.println("=================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=================================");
        System.out.printf("%-40s%-20s%-20s%-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s%-20.2f%-20s%-20.2f\n", matkul[i], nilai[i], predikat[i], bobot[i]);
        }

        double ipSemester = totalBobot / totalSKS;
        System.out.println("=================================");
        System.out.printf("IP Semester : %.2f\n", ipSemester);
        System.out.println("=================================");

        emu.close();
    }
}
