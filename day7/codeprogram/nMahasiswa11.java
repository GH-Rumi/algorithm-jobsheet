package day7.codeprogram;

public class nMahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    nMahasiswa11() {}

    nMahasiswa11(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    void tampilkanInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
