package day3.codeprogram;

public class Dosen11 {
    public String kode;
    public String nama;
    public boolean jenisKelamin = false;
    public int usia;

    public Dosen11() {}

    public Dosen11(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanData() {
            System.out.println("Kode           : " + kode);
            System.out.println("Nama           : " + nama);
            System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + usia);
            System.out.println("---------------------------------");
        }
    }

