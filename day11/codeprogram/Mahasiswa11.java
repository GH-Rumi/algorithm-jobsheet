package day11.codeprogram;

public class Mahasiswa11 {
    String nim;
    String nama;
    String prodi;
    double ipk;

    public Mahasiswa11(){}

    public Mahasiswa11(String nim, String nama, String prodi, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + ipk);
    }
}
