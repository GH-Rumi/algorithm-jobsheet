package day6.codeprogram;

public class Dosen11 {
        String kode;
        String nama;
        boolean jenisKelamin; 
        int usia;
    
        Dosen11(String kd, String name, boolean jk, int age) {
            this.kode = kd;
            this.nama = name;
            this.jenisKelamin = jk;
            this.usia = age;
        }
    
        void tampil() {
            System.out.println("Kode: " + kode + ", Nama: " + nama + ", Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + ", Usia: " + usia);
        }
}
