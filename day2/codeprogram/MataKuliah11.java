package day2.codeprogram;
public class MataKuliah11 {
   
    String kodeMatkul;
    String nama;
    int sks;
    int totalJam;

    public MataKuliah11() {
        this.kodeMatkul = "";
        this.nama = "";
        this.sks = 0;
        this.totalJam = 0;
    }

    public MataKuliah11(String kodeMatkul, String nama, int sks, int totalJam) {
        this.kodeMatkul = kodeMatkul;
        this.nama = nama;
        this.sks = sks;
        this.totalJam = totalJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMatkul);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + totalJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        this.totalJam += jam;
        System.out.println("Jumlah jam sekarang: " + totalJam);
    }

    public void kurangiJam(int jam) {
        if (totalJam >= jam) {
            this.totalJam -= jam;
            System.out.println("Jumlah jam sekarang: " + totalJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam tidak mencukupi.");
        }
    }
}