package day3.codeprogram;

import java.util.Scanner;

public class MataKuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah11() {}

    public MataKuliah11(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData(Scanner emu) {
        System.out.print("Kode        : ");
        this.kode = emu.nextLine();
        System.out.print("Nama        : ");
        this.nama = emu.nextLine();
        System.out.print("SKS         : ");
        this.sks = Integer.parseInt(emu.nextLine());
        System.out.print("Jumlah Jam  : ");
        this.jumlahJam = Integer.parseInt(emu.nextLine());
    }
    public void cetakInfo() {
        System.out.println("Kode        : " + this.kode);
        System.out.println("Nama        : " + this.nama);
        System.out.println("SKS         : " + this.sks);
        System.out.println("Jumlah Jam  : " + this.jumlahJam);
        System.out.println("---------------------------------");
    }
}
