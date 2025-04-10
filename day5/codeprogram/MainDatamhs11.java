package day5.codeprogram;

import java.util.Scanner;

public class MainDatamhs11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,nim,tahunMasuk;
        double nilaiUAS, nilaiUTS;

        Datamhs11[] arrDataMhs = new Datamhs11[8];
        
        for (int i = 0; i < arrDataMhs.length; i++) {
            System.out.println("Input Data Mahasiswa ke-" + (i+1) + " : ");
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("NIM : ");
            nim = sc.nextLine();
            System.out.print("Tahun Masuk : ");
            tahunMasuk = sc.nextLine();
            System.out.print("Nilai UTS : ");
            nilaiUTS = Double.parseDouble(sc.nextLine());
            System.out.print("Nilai UAS : ");
            nilaiUAS = Double.parseDouble(sc.nextLine());
            System.out.println("------------------------------");
            arrDataMhs[i] = new Datamhs11(nama, nim, tahunMasuk, nilaiUAS, nilaiUTS);
            arrDataMhs[i].tambahData(nama, nim, tahunMasuk, nilaiUAS, nilaiUTS);
        }

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("=====================-Daftar Nilai Mahasiswa-=====================");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-18s %-10s %-15s %-10s %-10s%n", 
            "Nama", "NIM", "Tahun Masuk", "UTS", "UAS");
        System.out.println("------------------------------------------------------------------");
        
        for (Datamhs11 mhs : arrDataMhs) {
            System.out.printf("%-15s %-15s %-12s %-10.1f %-10.1f%n", 
                mhs.nama, 
                mhs.nim, 
                mhs.tahunMasuk, 
                mhs.uts, 
                mhs.uas);
        }
        System.out.println("------------------------------------------------------------------");
        double tertinggi = Datamhs11.nilaiTertinggi(arrDataMhs, 0, arrDataMhs.length - 1);
        double terendah = Datamhs11.nilaiTerendah(arrDataMhs, 0, arrDataMhs.length - 1);
        double ratarata = Datamhs11.hitungRataUAS(arrDataMhs);

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Nilai UTS Tertinggi: " + tertinggi);
        System.out.println("Nilai UTS Terendah: " + terendah);
        System.out.println("Rata-Rata Nilai UAS: " + ratarata);

        sc.close();
    }
}
