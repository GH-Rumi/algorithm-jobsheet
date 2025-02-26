package day2.codeprogram;

public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa11() {       
    }

    public Mahasiswa11(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void ubahIPK(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk > 0 && ipk < 4.00) {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "Kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
            } 
        } else {
            return "Nilai Tidak Valid!";
        }
    }
}