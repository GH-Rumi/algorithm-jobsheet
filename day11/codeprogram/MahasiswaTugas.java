package day11.codeprogram;

public class MahasiswaTugas {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaTugas(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - IPK: " + ipk);
    }
}
